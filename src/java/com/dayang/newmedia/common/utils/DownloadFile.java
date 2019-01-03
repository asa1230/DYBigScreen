package com.dayang.newmedia.common.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.log4j.Logger;



/**
 * HTTP\UNC\FTP下载
 * @author luomeng
 *
 */
public class DownloadFile {
    
	public static Logger log = Logger.getLogger(DownloadFile.class);
    static SimpleDateFormat sdf2 = null;
    static SimpleDateFormat sdf = null;
    
	private static FTPClient ftpClient = new FTPClient();
	public static String downLoadFile(int downType,String descfilePath,String oriafileName) throws Exception {
		oriafileName = oriafileName.trim();
		String path = null;
		if (downType == 0) {
			path = httpDownLoad(descfilePath,oriafileName);
		} else if (downType == 1) {
			path = UNCDownLoad(descfilePath,oriafileName);
		} else if (downType == 2) {
			path = FTPDownLoad(descfilePath,oriafileName);
		}
		return path;
	}
	
	/**
	 * 下载http文件
	 * @param descfilePath
	 * @param oriafileName
	 * @return
	 * @throws Exception 
	 */
	public static String httpDownLoad(String descfilePath,String oriafileName) throws Exception{
		int byteread = 0;
		// 以日期时间为文件夹区分
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
		String date = sdf2.format(new Date());
		String filepath = StringUtils.combineUrl(descfilePath,date);
		// 判断文件夹是否存在,如果不存在则创建文件夹
		File file = new File(filepath);
		if (!file.exists()) {
			file.mkdirs();
		}
		
		// 组合成用户自定义路径+时间戳_文件名,比如：D:/test/[20150109]_145209201_a5c27d1ed21b0ef440a5da59dfc451da81cb3e63.jpg
		SimpleDateFormat sdf = new SimpleDateFormat("[yyyy-MM-dd]_HHmmss_SSS");
		String saveFile = "";
		String fileName ="";
		URL url = new URL(oriafileName);
		URLConnection conn = null;
		InputStream inStream = null;
		FileOutputStream fs = null;
		try {
			conn = url.openConnection();
			// 修复：“HTTP
			// 403命令是禁止恶意访问此网站，不能从此网站中抓取内容。如果是服务器端禁止抓取,那么这个你可以通过设置User-Agent来欺骗服务器”BUG
			conn.setRequestProperty("User-Agent",
					"Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
			inStream = conn.getInputStream();
			// 获取文件的后缀名
			String extName = StringUtils.getExtName(oriafileName);
			fileName = sdf.format(new Date()) + "_."+extName;
			saveFile = StringUtils.combineUrl(filepath, fileName);
			fs = new FileOutputStream(saveFile);
			byte[] buffer = new byte[1204];
			while ((byteread = inStream.read(buffer)) != -1) {
				fs.write(buffer, 0, byteread);
			}
		} catch (Exception e) {
			log.error("---------httpDownLoad error----", e);
		} finally {
			try {
				if (fs!=null) {
					fs.close();
				}
				if (inStream!=null) {
					inStream.close();
				}
			} catch (Exception e) {
				log.error("---------httpDownLoad error----", e);
			}
		}
		return date+File.separator+fileName;
	}	
	
	/**
	 * 下载UNC文件
	 * @param descFilePath
	 * @param oriaFileName
	 * @return
	 * @throws Exception 
	 */
	public static String UNCDownLoad(String descFilePath,String oriaFileName) throws Exception {
		System.out.println("----------UNCDownLoad----------------");
		// 源文件
		File oriaFile = new File(oriaFileName);
		// 以日期时间为文件夹区分
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
		String date = sdf2.format(new Date());
		String filepath = StringUtils.combineUrl(descFilePath,date);
		System.out.println("----------oriaFileName----------------"+oriaFileName);
		System.out.println("----------filepath----------------"+filepath);
		// 判断源文件是否存在，如果存在，则不下载
		if (StringUtils.isFileExit(filepath,oriaFileName)){
			System.out.println("存在不需要下载，直接返回");
			return StringUtils.deletePathSelect(descFilePath, oriaFileName);
		}
		System.out.println("不存在需要下载");
		// 判断文件夹是否存在,如果不存在则创建文件夹
		File file = new File(filepath);
		if (!file.exists()) {
			file.mkdirs();
		}
		// 组合成用户自定义路径+时间戳_文件名,比如：D:/test/[20150109]_145209201_a5c27d1ed21b0ef440a5da59dfc451da81cb3e63.jpg
		SimpleDateFormat sdf = new SimpleDateFormat("[yyyy-MM-dd]_HHmmss_SSS");
		String saveFile = "";
		// 获取文件的后缀名
		String extName = StringUtils.getExtName(oriaFileName);
		String fileName = sdf.format(new Date()) + "_."+extName;
		// 目标文件
		saveFile = StringUtils.combineUrl(filepath, fileName);
		FileInputStream fi = null;
		FileOutputStream fo = null;
		FileChannel in = null;
		FileChannel out = null;
		try {
			fi = new FileInputStream(oriaFile);
			fo = new FileOutputStream(saveFile);
			in = fi.getChannel();//得到对应的文件通道
			out = fo.getChannel();//得到对应的文件通道
			in.transferTo(0, in.size(), out);//连接两个通道，并且从in通道读取，然后写入out通道
		} catch (Exception e) {
			log.error("---------UNCDownLoad error----", e);
		} finally {
			try {
				if (fi!=null) {
					fi.close();
				}
				if (in!=null) {
					in.close();
				}
				if (fo!=null) {
					fo.close();
				}
				if (out!=null) {
					out.close();
				}
				
			} catch (Exception e) {
				log.error("---------UNCDownLoad error----", e);
			}
		}
		return date+File.separator+fileName;
	}
	
	/**
	 * 下载FTP文件
	 * @param descFilePath
	 * @param oriaFileName
	 * @return
	 * @throws Exception 
	 */
    public static String FTPDownLoad(String descFilePath, String oriaFileName)throws Exception {
    	// 根据FTP文件解析用户名，密码，ip
    	String ftpArr[] = oriaFileName.split("//");
		String ftpPath = ftpArr[1];
		String ftpPathArr[] = ftpPath.split(":");
		String ip ="";
		String port = "";
		// 用户名
		String userName = ftpPathArr[0];
		// 密码
		String password = ftpPathArr[1].split("@")[0];
		if (ftpPathArr.length>2) {
			// 存在端口
			// ip
			ip = ftpPathArr[1].split("@")[1];
			// 端口
			port = ftpPathArr[2].split("/")[0];
		} else {
			// 不存在端口
			// ip
			ip = ftpPathArr[1].split("@")[1].split("/")[0];
			// 端口
			port = "21";
		}
		String ofileName = oriaFileName.substring(oriaFileName.lastIndexOf("/"), oriaFileName.length());
		// 获取文件的根路径
		String rootFileName = StringUtils.getFtpRootPathFromFTPPath(oriaFileName);
		log.debug("-----rootFileName:"+rootFileName+"-----");
    	boolean result = connect(ip, Integer.parseInt(port), userName, password);
    	if (!result) {
    		throw new Exception("连接FTP服务器失败!");
    	}
    	// 以日期时间为文件夹区分
    	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
    	String date = sdf2.format(new Date());
    	String filepath = StringUtils.combineUrl(descFilePath,date);
    	// 判断文件夹是否存在,如果不存在则创建文件夹
    	File file = new File(filepath);
    	if (!file.exists()) {
    		file.mkdirs();
    	}
    	// 组合成用户自定义路径+时间戳_文件名,比如：D:/test/[20150109]_145209201_a5c27d1ed21b0ef440a5da59dfc451da81cb3e63.jpg
    	SimpleDateFormat sdf = new SimpleDateFormat("[yyyy-MM-dd]_HHmmss_SSS");
    	String saveFile = "";
    	// 获取文件的后缀名
    	String extName = StringUtils.getExtName(oriaFileName);
    	String fileName = sdf.format(new Date()) + "_."+extName;
    	// 目标文件
    	saveFile = StringUtils.combineUrl(filepath, fileName);
        // 设置被动模式
        ftpClient.enterLocalPassiveMode();
        // 设置以二进制方式传输
        ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
        // 检查远程文件是否存在
        FTPFile[] files = ftpClient.listFiles(new String(rootFileName.getBytes("UTF-8"), "iso-8859-1"));
        System.out.println(files);
        if (files.length != 1) {
            return "远程文件不存在!";
        }
        long lRemoteSize = files[0].getSize();
        String fildName = files[0].getName();
        // 本地存在文件，进行断点下载
        File f = new File(saveFile);
        if (f.exists()) {
            long localSize = f.length();
            if (localSize >= lRemoteSize) {
                return "本地文件大于远程文件，下载中止";
            }

            // 进行断点续传，并记录状态
            FileOutputStream out = new FileOutputStream(f, true);
            ftpClient.setRestartOffset(localSize);
            InputStream in = ftpClient.retrieveFileStream(new String(rootFileName.getBytes("UTF-8"), "iso-8859-1"));
            byte[] bytes = new byte[1024];
            long step = lRemoteSize / 100;
            long process = localSize / step;
            int c;
            while ((c = in.read(bytes)) != -1) {
                out.write(bytes, 0, c);
                localSize += c;
                long nowProcess = localSize / step;
                if (nowProcess > process) {
                    process = nowProcess;
                    if (process % 10 == 0)
                        System.out.println("下载进度：" + process);
                    // TODO 更新文件下载进度,值存放在process变量中
                }
            }
            in.close();
            out.close();
            boolean isDo = ftpClient.completePendingCommand();
            if (isDo) {
            	return date+File.separator+fileName;
            } else {
            	 throw new Exception("下载失败!");
            }
        } else {
            OutputStream out = new FileOutputStream(f);
            InputStream in = ftpClient.retrieveFileStream(new String(rootFileName.getBytes("UTF-8"), "iso-8859-1"));
            byte[] bytes = new byte[1024];
            long step = lRemoteSize / 100;
            long process = 0;
            long localSize = 0L;
            int c;
            while ((c = in.read(bytes)) != -1) {
                out.write(bytes, 0, c);
                localSize += c;
                long nowProcess = localSize / step;
                if (nowProcess > process) {
                    process = nowProcess;
                    if (process % 10 == 0)
                        System.out.println("下载进度：" + process);
                    // TODO 更新文件下载进度,值存放在process变量中
                }
            }
            in.close();
            out.close();
            boolean upNewStatus = ftpClient.completePendingCommand();
            if (upNewStatus) {
               return date+File.separator+fileName;
            } else {
                throw new Exception("下载失败!");
            }
        }
    }
	/**
	 * 连接到FTP服务器
	 * @param hostname
	 * @param port
	 * @param username
	 * @param password
	 * @return
	 * @throws IOException
	 */
	private static boolean connect(String hostname, int port, String username, String password) throws IOException {
        ftpClient.connect(hostname, port);
        ftpClient.setControlEncoding("UTF-8");
        if (FTPReply.isPositiveCompletion(ftpClient.getReplyCode())) {
            if (ftpClient.login(username, password)) {
                return true;
            }
        }
        disconnect();
        return false;
    }
	
	/**
	 * 关闭连接
	 * @throws IOException
	 */
	private static void disconnect() throws IOException {
		 if (ftpClient.isConnected()) {
			 ftpClient.disconnect();
		 }
	 }
	
	
	/**
     * 执行体
     * 
     * @param httpUrl
     *            http下载地址 filePath 文件保存路径
     */
    @SuppressWarnings("unused")
    public static String httpDownload(String httpUrl, String filePath) throws Exception{
        sdf = new SimpleDateFormat("[yyyy-MM-dd]_HHmmss_SSS");
        sdf2 = new SimpleDateFormat("yyyyMMdd");
        log.info("-----------------------------------------开始下载附件---------------------------------------------");
        // 把正斜杠改为反斜杠，window下文件夹路径格式
        filePath = filePath.replaceAll("/", "\\\\");
        // 下载网络文件
        int bytesum = 0;
        int byteread = 0;

        // 以日期时间为文件夹区分
        filePath += sdf2.format(new Date()) + "\\";
        // 判断文件夹是否存在,如果不存在则创建文件夹
        File file = new File(filePath);
        if (!file.exists()) {
            file.mkdirs();
        }

        // 组合成用户自定义路径+时间戳_文件名,比如：D:/test/[20150109]_145209201_a5c27d1ed21b0ef440a5da59dfc451da81cb3e63.jpg
        String saveFile = "";

        URL url = null;
        String checkHttp = "";
        // 检查http协议
        if (httpUrl.contains(":")) {
            checkHttp = httpUrl.substring(0, httpUrl.indexOf(":"));
        }
        // http协议执行下面的代码
        if (checkHttp.equals("http")) {
            try {
                url = new URL(httpUrl);
            } catch (MalformedURLException e1) {
                log.error("http地址错误：" + httpUrl);
            }

            URLConnection conn = null;
            InputStream inStream = null;
            FileOutputStream fs = null;
            try {
                conn = url.openConnection();
                // 修复：“HTTP
                // 403命令是禁止恶意访问此网站，不能从此网站中抓取内容。如果是服务器端禁止抓取,那么这个你可以通过设置User-Agent来欺骗服务器”BUG
                conn.setRequestProperty("User-Agent",
                        "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
                inStream = conn.getInputStream();
                // 获取到文件本身的格式
                log.info("------------------------------附件【" +httpUrl + "】的文件类型为：" + conn.getContentType());
                // 如果http下载地址中包含图片后缀，则使用http地址中的后缀做为新文件名的后缀；否则默认使用.jpg做为文件名后缀
                if (conn.getContentType().contains("gif")) {
                    saveFile = filePath + sdf.format(new Date()) + "_.gif";
                } else if (conn.getContentType().contains("mp4")
                        || conn.getContentType().contains("video")) {
                    saveFile = filePath + sdf.format(new Date()) + "_.mp4";
                } else {
                    saveFile = filePath + sdf.format(new Date()) + "_.jpg";
                }

                fs = new FileOutputStream(saveFile);

                byte[] buffer = new byte[1204];
                while ((byteread = inStream.read(buffer)) != -1) {
                    bytesum += byteread;
                    fs.write(buffer, 0, byteread);
                }
                log.info("------------------------------附件【" + httpUrl
                        + "】下载成功，存储为" + saveFile
                        + "-----------------------------");
            } catch (Exception e) {
                log.error("---------httpDownload error----", e);
            } finally {
                try {
                	if (fs!=null) {
                		fs.close();
                	}
                	if (inStream!=null) {
                		inStream.close();
                	}
                } catch (IOException e) {
                	log.error("---------httpDownload error----", e);
                }
            }
        }
        // unc协议执行下面的代码
        else {
            FileInputStream fi = null;
            BufferedInputStream in = null;
            FileOutputStream fo = null;
            BufferedOutputStream out = null;
            try {
                saveFile = filePath + sdf.format(new Date())
                        + httpUrl.substring(httpUrl.lastIndexOf("."));

                fi = new FileInputStream(httpUrl);
                in = new BufferedInputStream(fi);

                fo = new FileOutputStream(saveFile);
                out = new BufferedOutputStream(fo);

                byte[] buf = new byte[4096];
                int len = in.read(buf);
                while (len != -1) {
                    out.write(buf, 0, len);
                    len = in.read(buf);
                }
                log.info("------------------------------附件【" + httpUrl
                        + "】下载成功，存储为" + saveFile
                        + "-----------------------------");
            } catch (Exception e) {
                log.error("----------------------------------附件迁移异常："
                        ,e);
            } finally {
                try {
    				if (out!=null) {
    					out.close();
    				}
    				if (fo!=null) {
    					fo.close();
    				}
    				if (in!=null) {
    					in.close();
    				}
    				if (fi!=null) {
    					fi.close();
    				}
                } catch (IOException e) {
                	 log.error("----------------------------------附件迁移异常："
                             ,e);
                }

            }

        }
        log.info("-----------------------------------------结束下载附件---------------------------------------------");
        // 如果文件存在，则返回文件路径
        if (new File(saveFile).exists()) {
            saveFile =  saveFile.replace(InitUtil.file_down_dir, "");
            return saveFile;
        } else {
            return Constants.FILE_DOWNLOAD_FAILURE;
        }
    }
	
	public static void main(String[] args) throws Exception {
		//String path = httpDownLoad("\\\\100.0.1.248\\e\\gather","http://localhost:31701/img/[2016-01-04]_161133_332.jpg");
		//System.out.println(path);
		//String path = UNCDownLoad("\\\\100.0.1.248\\e\\gather\\","\\\\100.0.1.248\\e\\gather\\0003_thumbnail.jpg");
		/*File file = new File("\\\\100.0.1.52\\share\\gather\\20160328\\mCK7j8cbn1jcWnikj49UWXMP-zaK97E2xCA_8tFpHPC32cDIO4KVoiBF0ITXqGX18417690503756168239.amr");
		String filePath = "\\\\100.0.1.52\\share\\gather\\20160328\\";
		if (file.getPath().startsWith(filePath)) {
			System.out.println("211111");
		}*/
		String path = FTPDownLoad("\\\\192.168.20.120\\e\\gather\\","ftp://lm:lm@100.0.1.61/lm/Chrysanthemum.jpg");
		System.out.println(path);
	}
}
