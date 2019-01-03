package com.dayang.newmedia.common.utils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

/**
 * 上传文件到指定目录
 * 
 * @author dy
 *
 */
public class UploadFileUtil {

	private FTPClient ftp;

	/**
	 * 将字符串内容content保存到FTP上，文件名为fileName
	 * @param serverUrl
	 * @param fileName
	 * @param content
	 * @throws Exception
	 */
	public static void FtpUploadFile (String serverUrl,String fileName,String content) throws Exception {
		UploadFileUtil t = new UploadFileUtil();
		InputStream input = new ByteArrayInputStream(content.getBytes("utf-8"));
		boolean result = t.connect(serverUrl);
		t.upload(fileName, input);
	}
	
	/**
	 * 将附件file上传到FTP上
	 * @param serverUrl
	 * @param file
	 * @throws Exception
	 */
	public static void FtpUploadFile (String serverUrl,File file,String fileName) throws Exception {
		UploadFileUtil t = new UploadFileUtil();
		t.connect(serverUrl);
		t.upload(file,fileName);
	}
	
	/**
	 * 
	 * @param path
	 *            上传到ftp服务器哪个路径下
	 * @param addr
	 *            地址
	 * @param port
	 *            端口号
	 * @param username
	 *            用户名
	 * @param password
	 *            密码
	 * @return
	 * @throws Exception
	 */
	private boolean connect(String path, String addr, int port, String username, String password) throws Exception {
		boolean result = false;
		ftp = new FTPClient();
		int reply;
		ftp.connect(addr, port);
		ftp.login(username, password);
		ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
		reply = ftp.getReplyCode();
		if (!FTPReply.isPositiveCompletion(reply)) {
			ftp.disconnect();
			return result;
		}
		System.out.println(ftp.changeWorkingDirectory(path));
		result = true;
		return result;
	}

	/**
	 * 
	 * @param file
	 *            上传的文件或文件夹
	 * @throws Exception
	 */
	public void upload(File file,String fileName) throws Exception {
		ftp.enterLocalPassiveMode();
		ftp.setFileType(FTP.BINARY_FILE_TYPE);
		if (file.isDirectory()) {
			ftp.makeDirectory(file.getName());
			ftp.changeWorkingDirectory(file.getName());
			String[] files = file.list();
			for (int i = 0; i < files.length; i++) {
				File file1 = new File(file.getPath() + "\\" + files[i]);
				if (file1.isDirectory()) {
					upload(file1,fileName);
					ftp.changeToParentDirectory();
				} else {
					File file2 = new File(file.getPath() + "\\" + files[i]);
					FileInputStream input = new FileInputStream(file2);
					ftp.storeFile(new String(fileName.getBytes("GBK"), "iso-8859-1"), input);
					input.close();
				}
			}
		} else {
			File file2 = new File(file.getPath());
			FileInputStream input = new FileInputStream(file2);
			/*String extName = StringUtils.getExtName(file2.getName());
			String fileName = sdf.format(new Date())+"."+extName;*/
			ftp.storeFile(new String(fileName.getBytes("GBK"), "iso-8859-1"), input);
			input.close();
		}
	}

	/**
	 * 流方式上传文件
	 * @param filename
	 * @param input
	 * @return
	 * @throws IOException
	 */
	public void upload(String fileName, InputStream input) throws IOException { 
		ftp.enterLocalPassiveMode();
		ftp.setFileType(FTP.BINARY_FILE_TYPE);
		ftp.storeFile(new String(fileName.getBytes("GBK"), "iso-8859-1"), input);
		input.close();
	}
	
	/**
	 * 解析FTP路径，并连接
	 * @param serverPath
	 * @return
	 * @throws Exception
	 */
	public boolean connect(String serverPath) throws Exception{
		serverPath = serverPath.replace("\\", "/");
		System.out.println("FTP上传的地址："+serverPath);
		String path="";
		// 根据FTP文件解析用户名，密码，ip
    	String ftpArr[] = serverPath.split("//");  //[ftp:, lm:lm@100.0.1.61:21/zhangsan]
    	System.out.println("--长度："+ftpArr.length);
		String ftpPath = ftpArr[1];	//lm:lm@100.0.1.61:21/zhangsan
		String ftpPathArr[] = ftpPath.split(":"); //[lm, lm@100.0.1.61, 21/zhangsan]
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
			String portAndPath = ftpPathArr[2];
			String portAndPathArray[] = ftpPathArr[2].split("/");
			// 端口
			port = ftpPathArr[2].split("/")[0];
			if (portAndPathArray.length>1) {
				// 路径
				path = portAndPath.replace(port, "");
			}
		} else {
			// 不存在端口
			// ip
			ip = ftpPathArr[1].split("@")[1].split("/")[0];
			// 端口
			port = "21";
			if (ftpPathArr[1].split("@")[1].split("/").length>1) {
				path = ftpPathArr[1].split("@")[1].replace(ip, "");
			}
		}
		int port1 = Integer.parseInt(port);
		return connect(path,ip,port1,userName,password);
	}
	
	public static void main(String[] args) throws Exception {
		try {
			UploadFileUtil t = new UploadFileUtil();
			/*boolean result = t.connect("ftp://lm:lm@100.0.1.61:21/zhangsan/12");
			File file = new File("G:\\新建文件夹");
			t.upload(file);
			System.out.println(result);*/
			InputStream input = new ByteArrayInputStream("test ftp".getBytes("utf-8"));
			boolean result = t.connect("ftp:\\\\lm:lm@100.0.1.61:21\\zhangsan/12");
			
			UploadFileUtil.FtpUploadFile("ftp:\\\\lm:lm@100.0.1.61:21","121212112123123.xml", "2112121212121212");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
