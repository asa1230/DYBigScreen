package com.dayang.newmedia.common.utils;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.Map;
import java.util.Set;

import net.sf.json.JSONObject;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;



public class HttpClientUtil {
	private static Logger logger = Logger.getLogger(HttpClientUtil.class);

	/**
	 * 使用defaultHttp形式调用
	 * 
	 * @param url
	 * @param jsonParam
	 * @param noNeedResponse
	 * @return
	 */
	public static String defaultHttpPost(String url, String jsonParam) {

		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost method = new HttpPost(url);
		String resultStr = "";
		try {
			if (null != jsonParam) {
				StringEntity entity = new StringEntity(jsonParam, "utf-8");
				entity.setContentEncoding("UTF-8");
				entity.setContentType("application/String");
				method.setEntity(entity);
			}
			HttpResponse result = httpClient.execute(method);
			logger.info("**********result:" + result + "***************");
			url = URLDecoder.decode(url, "UTF-8");
			if (result.getStatusLine().getStatusCode() == 200) {
				try {
					resultStr = EntityUtils.toString(result.getEntity(),"utf-8");
					logger.info("***********resultStr:" + resultStr + "***********");
				} catch (Exception e) {
					logger.info("post请求url异常");
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		return resultStr;
	}

	/**
	 * get 方式或许接口信息
	 * 
	 * @param url
	 * @return
	 */
	public static JSONObject httpGet(String url) {
		JSONObject jsonResult = null;
		try {
			DefaultHttpClient client = new DefaultHttpClient();
			HttpGet request = new HttpGet(url);
			HttpResponse response = client.execute(request);

			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				String strResult = EntityUtils.toString(response.getEntity(),"utf-8");
				jsonResult = JSONObject.fromObject(strResult);
				url = URLDecoder.decode(url, "UTF-8");
			} else {
				logger.error("get请求url异常:" + url);
			}
		} catch (IOException e) {
			logger.error("get请求url异常:" + url, e);
		}
		return jsonResult;
	}

	/**
	 * 使用http形式调用
	 * 
	 * @param url
	 * @param data
	 * @return
	 */
	public static String HttpClientPost(String url, String data) {
		HttpClient client = null;
		PostMethod myPost = null;
		String output = "";
		try {
			client = new HttpClient();
			client.getParams().setContentCharset("UTF-8");
			// 连接超时
			client.getHttpConnectionManager().getParams().setConnectionTimeout(60000);
			// 读取超时
			client.getHttpConnectionManager().getParams().setSoTimeout(60000);

			myPost = new PostMethod(url);
			myPost.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");

			RequestEntity entity = new StringRequestEntity(data, "text/json", "utf-8");
			Header header = new Header();
			header.setName("content-type");
			header.setValue("application/json;charset=utf-8");
			header.setName("accept");
			header.setValue("text/html;charset=utf-8");
			myPost.setRequestHeader(header);
			myPost.setRequestEntity(entity);

			client.executeMethod(myPost);
			if (myPost.getStatusCode() == 200) {
				output = myPost.getResponseBodyAsString();
			}
			logger.info("调用【" + url + "】响应：" + output);
		} catch (Exception e) {
			logger.error("调用【" + url + "】异常：" + e.toString());
		} finally {
			myPost.releaseConnection();
			logger.info("退出调用：【url】=" + url + "");
		}
		return output;
	}
	
	
	/**
	 * 调用post请求，并这是请求头信息
	 * @param url
	 * @param data
	 * @param postHeader
	 * @return
	 */
	public static String HttpClientPost(String url, String data,Map<String, String> postHeader) {
		HttpClient client = null;
		PostMethod myPost = null;
		String output = "";
		try {
			client = new HttpClient();
			client.getParams().setContentCharset("UTF-8");
			// 连接超时
			client.getHttpConnectionManager().getParams().setConnectionTimeout(60000);
			// 读取超时
			client.getHttpConnectionManager().getParams().setSoTimeout(60000);

			myPost = new PostMethod(url);
			// 设置请求头信息
			if (postHeader!=null && postHeader.size()>0) {
				Set<String> keySet = postHeader.keySet();
				for (String key : keySet) {
					myPost.setParameter(key,postHeader.get(key));
				}
			}
			myPost.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");

			RequestEntity entity = new StringRequestEntity(data, "text/json", "utf-8");
			Header header = new Header();
			header.setName("content-type");
			header.setValue("application/json;charset=utf-8");
			header.setName("accept");
			header.setValue("text/json;charset=utf-8");
			myPost.setRequestHeader(header);
			myPost.setRequestEntity(entity);

			client.executeMethod(myPost);
			if (myPost.getStatusCode() == 200) {
				output = myPost.getResponseBodyAsString();
			}
			logger.info("调用【" + url + "】响应：" + output);
		} catch (Exception e) {
			logger.error("调用【" + url + "】异常：" + e.toString());
			e.printStackTrace();
		} finally {
			myPost.releaseConnection();
			logger.info("退出调用：【url】=" + url + "");
		}
		return output;
	}
	
     
     @SuppressWarnings("deprecation")
     public static String httpPostWithXML(String url,String xmlParam, boolean noNeedResponse){
         
         DefaultHttpClient httpClient = new DefaultHttpClient();
         HttpPost method = new HttpPost(url);
         String resultStr = "";
         try {
             if (StringUtils.isNotEmpty(xmlParam)) {
                 StringEntity entity = new StringEntity(xmlParam,"utf-8");
                 entity.setContentEncoding("UTF-8");
                 entity.setContentType("application/xml");
                 method.setEntity(entity);
             }
             HttpResponse result = httpClient.execute(method);
             logger.info("-----result:"+result);
             url = URLDecoder.decode(url, "UTF-8");
             if (result.getStatusLine().getStatusCode() == 200) {
                 try {
                     resultStr = EntityUtils.toString(result.getEntity(),"utf-8");
                     if (noNeedResponse) {
                         return null;
                     }
                     logger.info("resultStr===================="+resultStr);
                 } catch (Exception e) {
                      logger.info("url异常");
                 }
             }
         } catch (IOException e) {
             System.out.println(e);
         }
         return resultStr;
     }
     
     public static String httpPost(String url, JSONObject jsonParam,String contentType) throws Exception {
 		return httpPost(url, jsonParam,contentType, false);
 	}
 	
 	static RequestConfig defaultRequestConfig = RequestConfig.custom()
 			  .setSocketTimeout(15000)
 			  .setConnectTimeout(5000)
 			  .setConnectionRequestTimeout(5000)
 			  .setStaleConnectionCheckEnabled(true)
 			  .build();

 	/**
 	 * 发送post请求
 	 * @param url
 	 * @param jsonParam
 	 * @param noNeedResponse
 	 * @return
 	 * @throws Exception
 	 */
 	public static String httpPost(String url, JSONObject jsonParam,String contentType,boolean noNeedResponse) throws Exception{
 		CloseableHttpResponse response = null;
 		try {
 			HttpPost httpPost = new HttpPost(url);
 			CloseableHttpClient httpclient = HttpClients
 											.custom()
 				    						.setDefaultRequestConfig(defaultRequestConfig)
 				    						.build();
 			StringEntity requestEntity = null;
 			// 拼接参数
 			if (jsonParam == null) {
 				requestEntity = new StringEntity("","utf-8");
 			} else {
 				requestEntity = new StringEntity(jsonParam.toString(),"utf-8");
 			}
 			requestEntity.setContentEncoding("UTF-8");
 			if (StringUtils.isEmpty(contentType)) {
 				requestEntity.setContentType("application/json;charset=utf-8");
 			} else {
 				requestEntity.setContentType(contentType);
 			}
 			httpPost.setEntity(requestEntity);
 			response = httpclient.execute(httpPost);
 			logger.info("call url["+url+"] response:"+response.getStatusLine());
 			if (response.getStatusLine().getStatusCode() == 200) {
 				HttpEntity entity = response.getEntity();
 				String result = EntityUtils.toString(entity,"utf-8");
 				EntityUtils.consume(entity);
 				return result;
 			} else {
 				throw new Exception("请求异常:"+response.getStatusLine().getStatusCode());
 			}
 			
 		} catch (Exception e) {
 			logger.error("访问url地址["+url+"]出错",e);
 			throw e;
 		}finally {
 			if (response != null)
 				response.close();
 		}
 	}
     
}
