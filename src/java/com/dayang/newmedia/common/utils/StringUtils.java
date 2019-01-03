package com.dayang.newmedia.common.utils;


import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import org.apache.commons.lang.StringEscapeUtils;

import sun.misc.BASE64Decoder;

public class StringUtils {
	private static Logger logger = Logger.getLogger(StringUtils.class);
    /**
     * 判断是否为空
     * 
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0 || "".equals(str) || "null".equals(str);
    }

    /**
     * 判断是否为空
     * 
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str) {
        return !StringUtils.isEmpty(str);
    }

    /**
     * 将字符串list转化成以逗号隔开的
     */
    public static String listToString(List<String> stringList, String split) {
        if (stringList == null) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        boolean flag = false;
        for (String string : stringList) {
            if (flag) {
                result.append(split);
            } else {
                flag = true;
            }
            result.append(string);
        }
        return result.toString();
    }

    /**
     * 将String转化成list
     * 
     * @param text
     * @param split
     * @return
     */
    public static List<String> stringToList(String text, String split) {
        if (text == null || "".equals(text)) {
            return null;
        }
        List<String> list = new ArrayList<String>();
        String[] textArray = text.split(split);

        for (String str : textArray) {
            list.add(str);
        }
        return list;
    }

    /**
     * 合并两个地址
     * 
     * @param streamUrl
     * @param filePath
     * @return
     * @throws Exception 
     */
    public static String combineUrl(String streamUrl, String filePath){
    	
        streamUrl = streamUrl.replace("\\", "/");
        filePath = filePath.replace("\\", "/");
        if (!streamUrl.endsWith("/")) {
            streamUrl = streamUrl + "/";
        }
        if (filePath.startsWith("/")) {
            filePath = filePath.substring(1, filePath.length());
        }

        return streamUrl + filePath;
    }

    /**
     * 将一个base64转换成图片保存在 path 文件夹下 名为imgName.gif
     * 
     * @param base64String
     * @param uncPath
     *            是存储的uncPath
     * @param imgName
     *            图片名字(没有后缀)
     * @throws Exception
     */
    public static String savePictoServer(String base64String, String uncPath, String filePathPre, String imgName) throws Exception {
        BASE64Decoder decoder = new BASE64Decoder();

        // Base64解码
        byte[] b = decoder.decodeBuffer(base64String);
        for (int i = 0; i < b.length; ++i) {
            if (b[i] < 0) {// 调整异常数据
                b[i] += 256;
            }
        }
        // 路径
        String realPath = uncPath + "/" + filePathPre;
        File dir = new File(realPath);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        String fileName = "";
        if (StringUtils.isEmpty(filePathPre)) {
            fileName = imgName + ".jpg";
        } else {
            fileName = filePathPre + "\\" + imgName + ".jpg";
        }
        // 保存
        OutputStream out = new FileOutputStream(uncPath + "\\" + fileName);
        out.write(b);
        out.flush();
        out.close();
        return fileName;
    }

    public static boolean listIsNotEmpty(List object) {
        // TODO Auto-generated method stub
        if (object != null && object.size() > 0) {
            return true;
        }
        return false;
    }
    
    public static boolean listIsEmpty(List object) {
        // TODO Auto-generated method stub
        return !listIsNotEmpty(object);
    }

    /**
     * 获取文件的后缀名，适合FTP\UNC\HTTP路径
     * 
     * @param fileName
     * @return
     * @throws Exception
     */
    public static String getExtName(String fileName) throws Exception {
        // 判断给定的文件名是否为空，并且长度要大于0
        if (fileName == null || "".equals(fileName)) {
            throw new Exception("文件名不能为空!");
        }
        // fileName 可能是UNC路径（\\\\100.0.1.248\\e\\gather\\1.txt）,获取文件名
        fileName = fileName.replace("/", "\\");
        String name = fileName.substring(fileName.lastIndexOf('\\') + 1, fileName.length());
        // 查找字符‘.‘出现的最后一个索引位置
        int x = name.lastIndexOf('.');
        // 判断此索引是否存在，并且不是最后一个字符
        if (x <= -1 || x >= name.length() - 1) {
            // throw new Exception("此文件不存在后缀名!");
            return "jpeg";
        }
        return name.substring(x + 1);
    }

    /**
     * 获取文件名称
     * 
     * @param url
     * @return
     * @throws Exception
     */
    public static String getFileNameByAddress(String url) throws Exception {
        url = url.replace("/", "\\");
        int x = url.lastIndexOf('\\');
        if (x <= -1 || x >= url.length() - 1) {
            throw new Exception("找不到文件名!");
        }
        String name = url.substring(x + 1, url.length());
        return name;
    }

    public static String getTimeByMillis(long mills) {
        Date date = new Date(mills * 1000l);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeString = format.format(date);
        return timeString;
    }

    public static boolean regexString(String regEx, String text) {
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            return true;
        }
        return false;
        // return matcher.find();
    }

    public static void getDateTimeByText1(String dateText) throws Exception {
        Map<String, String> dateMap = new HashMap<String, String>();
        dateMap.put("\\d{4}-\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}", "yyyy-MM-dd HH:mm:ss");
        dateMap.put("\\d{4}年\\d{1,2}月\\d{1,2}日 \\d{1,2}:\\d{1,2}:\\d{1,2}", "yyyy年MM月dd HH:mm:ss");
        dateMap.put("\\d{4}\\d{1,2}\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}", "yyyyMMdd HH:mm:ss");
        dateMap.put("\\d{4}.d{1,2}.d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}", "yyyy.MM.dd HH:mm:ss");

        Set<String> keySet = dateMap.keySet();
        boolean isFlag = false;
        String regex = "";
        for (String reg : keySet) {

            System.out.println(reg + ":" + regexString(reg, dateText));
        }
    }

    public static boolean checkDateFormat(String dateText, String dateFormat) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat(dateFormat);
        format.parse(dateText);
        return true;
    }

    public static Date getDateTimeByText(String dateText) throws Exception {
        if (StringUtils.isNotEmpty(dateText)) {
            String[] split = dateText.split(":");
            if (split != null && split.length == 1) {
                dateText = dateText + " 00:00:00";
            } else if (split != null && split.length == 2) {
                dateText = dateText + ":00";
            }
        }
        Map<String, String> dateMap = new HashMap<String, String>();
        dateMap.put("\\d{4}-\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{1,2}", "yyyy-MM-dd HH:mm:ss");
        dateMap.put("\\d{4}年\\d{1,2}月\\d{1,2}日 \\d{1,2}:\\d{1,2}:\\d{1,2}", "yyyy年MM月dd日 HH:mm:ss");
        dateMap.put("\\d{4}\\d{1,2}\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}", "yyyyMMdd HH:mm:ss");
        dateMap.put("\\d{4}.d{1,2}.d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}", "yyyy.MM.dd HH:mm:ss");

        Set<String> keySet = dateMap.keySet();
        boolean isFlag = false;
        String regex = "";
        for (String reg : keySet) {
            if (regexString(reg, dateText)) {
                isFlag = true;
                regex = dateMap.get(reg);
                break;
            }
        }

        if (isFlag) {
            SimpleDateFormat dateFormat = new SimpleDateFormat(regex);
            Date date = dateFormat.parse(dateText);
            return date;
        } else {
            throw new Exception("日期格式不符合要求，正确格式：2016-03-15 18:10");
        }
    }

    public static String deletePathSelect(String selectPath, String oriafileName) {
        selectPath = selectPath.replace("/", "\\");
        oriafileName = oriafileName.replace("/", "\\");
        if (!selectPath.endsWith("\\")) {
            selectPath = selectPath + "\\";
        }
        return oriafileName.replace(selectPath, "");
    }

    public static boolean isFileExit(String selectPath, String oriafileName) {
        selectPath = selectPath.replace("\\", "/");
        oriafileName = oriafileName.replace("\\", "/");
        return oriafileName.startsWith(selectPath);
    }

    public static boolean isBlank(String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if ((Character.isWhitespace(str.charAt(i)) == false)) {
                return false;
            }
        }
        return true;
    }

    /**
     * <p>
     * Checks if a String is not empty (""), not null and not whitespace only.
     * </p>
     *
     * <pre>
     * StringUtils.isNotBlank(null)      = false
     * StringUtils.isNotBlank("")        = false
     * StringUtils.isNotBlank(" ")       = false
     * StringUtils.isNotBlank("bob")     = true
     * StringUtils.isNotBlank("  bob  ") = true
     * </pre>
     *
     * @param str
     *            the String to check, may be null
     * @return <code>true</code> if the String is not empty and not null and not
     *         whitespace
     * @since 2.0
     */
    public static boolean isNotBlank(String str) {
        return !StringUtils.isBlank(str);
    }

    public static String CreateGuid(){
        return UUID.randomUUID().toString();
    }
    

    public static boolean isStrLegal(String str)
    {
      if ((str != null) && (str.trim().length() > 0)) {
        return true;
      }
      return false;
    }
    
    public static String Create24ID()
    {
      String uuid = UUID.randomUUID().toString().toUpperCase();
      return uuid.replaceAll("-", "").substring(8);
    }
    
    public static String resetStr(String str)
    {
      return str == null ? "" : str.trim();
    }
    
    public static String utf8Space() {
        byte[] utf8Space = new byte[] { (byte) 0xc2, (byte) 0xa0 };               
        String tempSpace = "";
        try {
            tempSpace = new String(utf8Space,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        
        return tempSpace ;
    }
    
    public static int getNumberByString(String number){
        int num = 0;
        double doubleNumber = 0;
        if (number.endsWith("亿")){
            String strNumber = number.substring(0, number.length()-1);
            doubleNumber = Double.parseDouble(strNumber)*1000000000;
        } else if (number.endsWith("万")) {
            String strNumber = number.substring(0, number.length()-1);
            doubleNumber = Double.parseDouble(strNumber)*10000;
        } else {
            doubleNumber = Double.parseDouble(number);
        }
        
        return (int) doubleNumber;
    }
    
    public static String getTimeByDate(Date date) {
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeString=format.format(date);
        return timeString;
    }
    
    /**
     * 获取0-10之间的随机数
     * @return
     */
    public static int getRandomNum(){
    	Random random=new Random();// 定义随机类
    	int result=random.nextInt(10);// 返回[0,10)集合中的整数，注意不包括10
    	return result;
    }
    
    /**
     * 获取0-num之间的随机数
     * @return
     */
    public static int getRandomNum(int num){
    	Random random=new Random();// 定义随机类
    	int result=random.nextInt(num);// 返回[0,10)集合中的整数，注意不包括10
    	return result;
    }
    
 
   
 
    /**
     * 根据FTP文件名，获取相对于跟的路径地址
     * @param ftpFilePath
     * @return
     */
    public static String getFtpRootPathFromFTPPath(String ftpFilePath){
    	ftpFilePath = ftpFilePath.replace("\\", "/");
    	String filePath[] = ftpFilePath.split("//");
    	String ftp = filePath[0];
    	String url = filePath[1];
    	String ipPort[] = url.split("/");
    	String nameIpPort = ipPort[0];
    	String ftpServeUrl = ftp+"//"+nameIpPort; 
    	ftpFilePath = ftpFilePath.replace(ftpServeUrl, "");
		return ftpFilePath;
    }
    
    /**
     * 与运算
     * @param number1
     * @param number2
     * @return
     */
    public static int andOperation(int number1,int number2 ){
    	return number1&number2;
    }
    
    /**
     * 获取当前时间的前time时长的时间
     * type:参数类型    1:时    2:分    3:秒  4:天
     * @param type
     * @param time
     * @return
     */
    public static Date getDateTimeByCurrentTime(int type,int time){
    	Date now = new Date();
    	long timeLong = 0;
    	if (type==1) {
    		timeLong = 60*60*1000;
    	} else if (type == 2) {
    		timeLong = 60*1000;
    	} else if (type == 3) {
    		timeLong = time*1000;
    	} else if (type == 4) {
    		timeLong = 24*60*60*1000;
    	}
    	Date now_10 = new Date(now.getTime() - time * timeLong); 
    	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	String nowTime_10 = dateFormat.format(now_10);
    	System.out.println(nowTime_10);
    	return now_10;
    }
    
    /**
     * 将sourceContent中和newContent中公共的部分移除，
     * @param sourceContent
     * @param newContent
     * @return
     */
    public static String[] combineContent(String[] sourceContent,String[] newContent){
		return null;
    }
    
    /**
     * 将sourceContent中和newContent中公共的部分移除，
     * @param sourceContent
     * @param newContent
     * @return
     */
    public static String combineContent(String sourceContent,String newContent){
    	String [] sources = sourceContent.split(",");
    	String [] newContents = newContent.split(",");
    	Set<String> returnSet = new HashSet<>();
    	for (String source : sources) {
    		returnSet.add(source);
		}
    	for (String content : newContents) {
    		returnSet.add(content);
		}
    	
    	String result = "";
    	for (String set : returnSet) {
			if (StringUtils.isEmpty(result)) {
				result = set;
			} else {
				result = result+","+set;
			}
		}
		return result;
    }
    
    /**
     * 从sourceContent中移除newContent中也存在的部分
     * @param sourceContent
     * @param newContent
     * @return
     */
    public static String deleteSameContent(String sourceContent,String newContent){
    	String [] sources = sourceContent.split(",");
    	String [] newContents = newContent.split(",");
    	Set<String> sourceSet = new HashSet<>();
    	for (String source : sources) {
    		sourceSet.add(source);
		}
    	for (String source : sources) {
			for (String content : newContents) {
				if (source.equals(content)) {
					sourceSet.remove(source);
				}
			}
		}
    	String result = "";
    	for (String set : sourceSet) {
			if (StringUtils.isEmpty(result)) {
				result = set;
			} else {
				result = result+","+set;
			}
		}
		return result;
    }
    
    /**
     * 获取当前时间出
     * @return
     * @author luomeng
     */
    public static String getCurrentTimeStamp(){
    	SimpleDateFormat sdf = new SimpleDateFormat("[yyyy-MM-dd]_HHmmss_SSS");
    	Date currentDate = new Date();
    	return sdf.format(currentDate);
    }
    
    /**
     * 截取中英文混合字符串 等宽显示
     * @param text 截取内容
     * @param length 截取长度
     * @param endWith 结尾显示
     * @return
     */
    public static String subString(String text, int length, String endWith) {      
        int textLength = text.length();
        int byteLength = 0;
        StringBuffer returnStr =  new StringBuffer();
        for(int i = 0; i<textLength && byteLength < length*2; i++){
            String str_i = text.substring(i, i+1); 
            if(str_i.getBytes().length == 1){//英文
                byteLength++;
            }else{//中文
                byteLength += 2 ;
            }
            returnStr.append(str_i);
        }
        try {
            if(byteLength<text.getBytes("GBK").length){//getBytes("GBK")每个汉字长2，getBytes("UTF-8")每个汉字长度为3
                returnStr.append(endWith);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return returnStr.toString();
    }
    
    /**
     * 去除字符串中的空格、回车、换行符、制表符
     * @param str
     * @return
     */
	public static String replaceBlank(String str) {
		String dest = "";
		if (str != null) {
			Pattern p = Pattern.compile("\\s*|\t|\r|\n");
			Matcher m = p.matcher(str);
			dest = m.replaceAll("");
		}
		return dest;
	}
    
    public static void main(String[] args) throws Exception {
    	String test = "　　新华社北京８月１１日专电（记者李萌）北京市国资委１０日发布的《北京市国资委国有经济“十三五”发展规划》显示，“十三五”期间，北京将努力打造１０－１５家上市公司，进一步深化改革，推进企业改制上市。";
    	System.out.println(replaceBlank(test));
    	String str = StringEscapeUtils.unescapeHtml(test);
    	System.out.println(replaceBlank(str));
        /*
         * String fileName =
         * getFileNameByAddress("http://localhost:31701/img/1.jpg"); String
         * fileName1 = getFileNameByAddress("ftp://zp:zp@100.0.1.248/2.jpg");
         * String fileName2 = getFileNameByAddress("\\\\100.0.1.248\\e\\3.jpg");
         * System.out.println(fileName); System.out.println(fileName1);
         * System.out.println(fileName2);
         */
        /*
         * String ext = getExtName(
         * "http://mmbiz.qpic.cn/mmbiz/uZ8rCeE7gAkoM5NcTu6QVo4rqyNAUnYR245icWB7DfBuaBZc9DiaLr8NFrBtCUJs60tYhFhdbvZxVPDaqXe1IJDg/0?wx_fmt=jpeg"
         * ); System.out.println(ext);
         */
        /*
         * Date date = getDateTimeByText("2016年03月15日 08:03:11");
         * System.out.println(date.toLocaleString());
         */
        /*
         * boolean result = checkDateFormat("2013-10-23 10:10:10",
         * "yyyy-MM-dd HH:mm:ss"); System.out.println(result);
         */
        // String path =
        // deletePathSelect("\\\\100.0.1.51\\e\\gather","\\\\100.0.1.51\\e\\gather\\1.txt");
        // System.out.println(path);
    	//System.out.println(getExtName("1.jgp"));
    	//System.out.println(getFtpRootPathFromFTPPath("ftp://lm:lm@100.0.1.61/lm/1-moov_2_20150824095140.mp4"));
    	//System.out.println(getFtpRootPathFromFTPPath("ftp://lm:lm@100.0.1.61:21/lm/1-moov_2_20150824095140.mp4"));
    	//System.out.println(getFtpRootPathFromFTPPath("ftp://lm:lm@100.0.1.61"));
    	//getFtpRootPathFromFTPPath("ftp://lm:lm@100.0.1.61:21/lm/1-moov_2_20150824095140.mp4");
    	//System.out.println(andOperation(131073, 131072));
    	//getDateTimeByCurrentTime(3, 1);
    	//System.out.println("===========os.name:"+System.getProperties().getProperty("os.name"));  
    	
//    	Date date = getDateTimeByCurrentTime(4, 10);
    	//System.out.println(date.toLocaleString());
    	
    	//String result = combineContent("zhangsan,lisi,wangwu", "wangwu,zha");
    	//System.out.println(result);
//    	String result = deleteSameContent("", "张三,张三");
//    	System.out.println(result);
//    	String fullPath = StringUtils.combineUrl("ftp://lm:lm@100.0.1.61:21", "/");
//    	System.out.println(fullPath);
//    	String fullPath1 = StringUtils.combineUrl("ftp://lm:lm@100.0.1.61:21/", "/");
//    	System.out.println(fullPath1);
    }
}
