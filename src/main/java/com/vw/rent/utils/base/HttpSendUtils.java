package com.vw.rent.utils.base;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 
 * 
 */
public class HttpSendUtils {
	
	/**
	 * get无参数请求
	 * @param url
	 * @return
	 */
	public static String sendGet(String url)  {
		//采用HttpClient技术
		try {
			CloseableHttpClient httpClient = HttpClientBuilder.create().build();
			HttpGet httpGet = new HttpGet(url);
			// 设置超时断连
	        RequestConfig configDL = RequestConfig.custom().setConnectTimeout(10000)// 设置连接时间超时10秒断连
	            .setSocketTimeout(10000)// 设置读取时间超时10秒断连
	            .build();
	        // 添加请求配置
	        httpGet.setConfig(configDL);
	        // 设置Get请求头的 User-Agent (模拟代理浏览器信息)
	        httpGet.setHeader("User-Agent",
	            "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:56.0) Gecko/20100101 Firefox/56.0");
			CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
			String result = EntityUtils.toString(httpResponse.getEntity());
			return result;
		} catch (Exception e) {//捕捉异常让程序返回空值，之后自定义处理
			System.out.println(url);
			e.printStackTrace();
		}
		return "";
	}
	/**
	 * get带参数请求
	 * @param url
	 * @param map
	 * @return
	 */
	public static String sendGetWithParam(String url, Map<String,Object> map)  {
		//采用HttpClient技术
		try {
			CloseableHttpClient httpClient = HttpClientBuilder.create().build();
			 List<NameValuePair> formparams = new ArrayList<NameValuePair>();
			 for (Map.Entry<String, Object> entry : map.entrySet()) {
				 formparams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()+""));
			}
			String paramStr = EntityUtils.toString(new UrlEncodedFormEntity(formparams, Consts.UTF_8));
			HttpGet httpGet = new HttpGet(url+"?"+paramStr);
			// 设置超时断连
	        RequestConfig configDL = RequestConfig.custom().setConnectTimeout(10000)// 设置连接时间超时10秒断连
	            .setSocketTimeout(10000)// 设置读取时间超时10秒断连
	            .build();
	        // 添加请求配置
	        httpGet.setConfig(configDL);
	        // 设置Get请求头的 User-Agent (模拟代理浏览器信息)
	        httpGet.setHeader("User-Agent",
	            "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:56.0) Gecko/20100101 Firefox/56.0");
			CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
			String result = EntityUtils.toString(httpResponse.getEntity());
			return result;
		} catch (Exception e) {//捕捉异常让程序返回空值，之后自定义处理
			System.out.println(url);
			e.printStackTrace();
		}
		return "";
	}
	
	public static String sendPost(String url, File file) {
		try {
			CloseableHttpClient httpClient = HttpClientBuilder.create().build();
//			 List<NameValuePair> formparams = new ArrayList<NameValuePair>();
//			 for (Map.Entry<String, Object> entry : map.entrySet()) {
//				 formparams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()+""));
//			}
//			String paramStr = EntityUtils.toString(new UrlEncodedFormEntity(formparams, Consts.UTF_8));
			HttpPost httpPost = new HttpPost(url);
			// 设置超时断连
	        RequestConfig configDL = RequestConfig.custom().setConnectTimeout(100000)// 设置连接时间超时10秒断连
	            .setSocketTimeout(100000)// 设置读取时间超时10秒断连
	            .build();
	        // 添加请求配置
	        httpPost.setConfig(configDL);
	        // 设置请求头的 User-Agent (模拟代理浏览器信息)
	        httpPost.setHeader("User-Agent",
	            "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:56.0) Gecko/20100101 Firefox/56.0");
	        MultipartEntityBuilder multipartEntityBuilder = MultipartEntityBuilder.create();
	        multipartEntityBuilder.setMode(HttpMultipartMode.RFC6532);
	        multipartEntityBuilder.addBinaryBody("file", file);
	        HttpEntity httpEntity = multipartEntityBuilder.build();
	        httpPost.setEntity(httpEntity);
	        
			CloseableHttpResponse httpResponse = httpClient.execute(httpPost);
			String result = EntityUtils.toString(httpResponse.getEntity());
			return result;
		} catch (Exception e) {//捕捉异常让程序返回空值，之后自定义处理
			System.out.println(url);
			e.printStackTrace();
		}
		return "";
		
	}
	
	public static void main(String[] args) {
		try {
			String url = "http://localhost:8080/uploadFile";
			File file = new File("C:\\Users\\Administrator\\Desktop\\马雪-1.4 工时填报表.xlsx");
			String a = sendPost(url,file);
			System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
