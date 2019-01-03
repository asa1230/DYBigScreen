package com.dayang.newmedia.newscommand.ws.commandapp.api.impl;

import com.dayang.newmedia.common.utils.CommonServiceUtil;
import com.dayang.newmedia.common.utils.StringUtils;
import com.dayang.newmedia.newscommand.db.model.enums.CLUETYPEANDSERVERTYPE_ID;
import com.dayang.newmedia.newscommand.ws.client.clueclient.ClueClient;
import com.dayang.newmedia.newscommand.ws.client.clueclient.ClueClientFactory;
import com.dayang.newmedia.newscommand.ws.client.clueclient.impl.HJClue.HJClueClientImpl;
import com.dayang.newmedia.newscommand.ws.commandapp.api.NotFoundException;
import com.dayang.newmedia.newscommand.ws.commandapp.api.QueryClueByIdApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryClueByIdResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryClueCondition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.log4j.Logger;

/**
 * 根据资源ID获取资源详情
 * @author luomeng
 *
 */

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class QueryClueByIdApiServiceImpl extends QueryClueByIdApiService {
	
	public static Logger log = Logger.getLogger(QueryClueApiServiceImpl.class); 
	
	/**
	 * 根据资源ID获取资源详情
	 * @author luomeng
	 */
	@Override
    public Response queryClueById(QueryClueCondition queryClueCondition, SecurityContext securityContext) throws NotFoundException {
		try {
			log.debug("--------begin queryClueById request param [queryClueCondition:]"+queryClueCondition+"------");
			
			// 获取汇聚的接口地址
			String serverUrl =StringUtils.combineUrl(CommonServiceUtil.getServerSettingUrlByUtype(12), "api/resource");
			
			// 获取线索客户端
			HJClueClientImpl clueClient = new HJClueClientImpl();
			// 调用接口获取资源详情
			QueryClueByIdResponse queryClueByIdResponse = clueClient.getClueInfoByResourceGuid(serverUrl, queryClueCondition);
			return Response.ok().entity(queryClueByIdResponse).build();
		} catch (Exception e) {
			log.error("-----------queryClueById error-----",e);
			return Response.ok().entity(getQueryClueByIdResponseFilure(e.toString())).build();
		}
    }
	
	/**
	 * 默认失败返回结果
	 * @param msg
	 * @return
	 * @author luomeng
	 */
	public QueryClueByIdResponse getQueryClueByIdResponseFilure(String msg){
		QueryClueByIdResponse queryClueByIdResponse = new QueryClueByIdResponse();
		queryClueByIdResponse.setCommonResponse(CommonServiceUtil.getCommonResponseFailure(msg));
		return queryClueByIdResponse;
	}
}
