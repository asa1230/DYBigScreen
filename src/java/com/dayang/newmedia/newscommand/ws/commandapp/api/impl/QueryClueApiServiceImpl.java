package com.dayang.newmedia.newscommand.ws.commandapp.api.impl;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.log4j.Logger;

import com.dayang.newmedia.common.utils.CommonServiceUtil;
import com.dayang.newmedia.common.utils.Constants;
import com.dayang.newmedia.common.utils.StringUtils;
import com.dayang.newmedia.newscommand.ws.client.clueclient.impl.HJClue.HJClueClientImpl;
import com.dayang.newmedia.newscommand.ws.commandapp.api.NotFoundException;
import com.dayang.newmedia.newscommand.ws.commandapp.api.QueryClueApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.model.CommonResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryClueResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryHJCondition;

/**
 * 获取最新线索
 * @author huyulong
 *
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-06T12:04:38.805Z")
public class QueryClueApiServiceImpl extends QueryClueApiService {
	
	public static Logger log = Logger.getLogger(QueryClueApiServiceImpl.class); 
	
	/**
	 * 获取最新线索
	 * @author huyulong
	 */
    @Override
    public Response queryClue(QueryHJCondition queryHJCondition, SecurityContext securityContext) throws NotFoundException {
    	log.debug("-----begin queryClue,Request param[queryTaskCondition:]"+queryHJCondition+"---------");
    	try {
			if (queryHJCondition == null || queryHJCondition.getResourceOriginType() == null) {
				return Response.ok().entity(getQueryClueResponseFailure("请求参数有误")).build();
			}
			
			// 获取汇聚服务地址
			String serverUrl = StringUtils.combineUrl(CommonServiceUtil.getServerSettingUrlByUtype(Constants.HJ_SERVER_URL_TYPE), "api/resources/find");
			
			HJClueClientImpl clueClient = new HJClueClientImpl();
			QueryClueResponse queryClueResponse = clueClient.getClueList(serverUrl, queryHJCondition);
			log.debug("-----end queryClue,Request result[queryClueResponse:]"+queryClueResponse+"---------");
			return Response.ok().entity(queryClueResponse).build();
		} catch (Exception e) {
			log.debug("-----queryClue error-------------",e);
			QueryClueResponse queryClueResponse = getQueryClueResponseFailure(e.toString());
			return Response.ok().entity(queryClueResponse).build();
		}
    }
    
    /**
     * 查询线索失败响应
     * @param msg
     * @return
     * @author huyulong
     */
    public QueryClueResponse getQueryClueResponseFailure(String msg){
    	QueryClueResponse queryClueResponse = new QueryClueResponse();
    	CommonResponse commonResponse = CommonServiceUtil.getCommonResponseFailure(msg);
    	queryClueResponse.setCommonResponse(commonResponse);
		return queryClueResponse;
    }
}
