package com.dayang.newmedia.newscommand.ws.commandapp.api.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.log4j.Logger;

import com.dayang.newmedia.common.utils.CommonServiceUtil;
import com.dayang.newmedia.common.utils.SpringContextUtil;
import com.dayang.newmedia.newscommand.db.model.BanmianInfo;
import com.dayang.newmedia.newscommand.service.BanmianInfoService;
import com.dayang.newmedia.newscommand.ws.commandapp.api.NotFoundException;
import com.dayang.newmedia.newscommand.ws.commandapp.api.QueryColumnApiService;
import com.dayang.newmedia.newscommand.ws.commandapp.model.Column;
import com.dayang.newmedia.newscommand.ws.commandapp.model.CommonResponse;
import com.dayang.newmedia.newscommand.ws.commandapp.model.QueryColumnResponse;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-16T07:09:52.097Z")
public class QueryColumnApiServiceImpl extends QueryColumnApiService {
	
	public static Logger log = Logger.getLogger(QueryColumnApiServiceImpl.class);
    public BanmianInfoService banmianInfoService = (BanmianInfoService) SpringContextUtil.getBean("banmianInfoService");

    
    @Override
    public Response queryColumn(SecurityContext securityContext) throws NotFoundException {
		try {
			List<BanmianInfo> canmianInfols = banmianInfoService.getColumnInfo();
			List<Column> columns = getColumns(canmianInfols);
            return  Response.ok().entity(getResopnseWithSuccess("",columns)).build();
		} catch (Exception e) {
			 log.error("----------queryColumn error-------", e);
	            return Response.ok().entity(getResponseWithFailure(e.getMessage())).build();

		}
    }
    
    
    /**
     *  转换APP所需类型
     * @param aCustomConfigList
     * @return
     */
    private List<Column> getColumns(List<BanmianInfo> banmianInfols) {
        List<Column> columns = new ArrayList<Column> () ;
        for (BanmianInfo banmianInfo : banmianInfols) {
        	Column column = new Column() ;
        	column.setColumn(banmianInfo.getBname());
            columns.add(column);
        }
        return columns;
    }
    
    public QueryColumnResponse getResopnseWithSuccess(String message, List<Column> records) {
    	QueryColumnResponse queryColumnResponse = new QueryColumnResponse();
        CommonResponse commonResponse = CommonServiceUtil.getCommonResponseSuccess(message);
        queryColumnResponse.setCommonResponse(commonResponse);
        queryColumnResponse.setRecords(records);
        return queryColumnResponse;
    }
    
    /**
     * 失败返回结果
     * 
     * @param msg
     * @return
     */
    public QueryColumnResponse getResponseWithFailure(String msg) {
    	QueryColumnResponse queryColumnResponse = new QueryColumnResponse();
        CommonResponse commonResponse = CommonServiceUtil.getCommonResponseFailure(msg);
        queryColumnResponse.setCommonResponse(commonResponse);
        return queryColumnResponse;
    }
}
