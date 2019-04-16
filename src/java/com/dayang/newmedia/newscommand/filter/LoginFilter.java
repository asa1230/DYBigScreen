package com.dayang.newmedia.newscommand.filter;

import com.dayang.cas.client.service.CasUserService;
import com.dayang.newmedia.newscommand.db.model.LoginUser;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;
import sun.misc.BASE64Decoder;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by J.wang on 2018/3/4.
 */
public class LoginFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        String clientJWT = request.getHeader("ClientJWT");
        
        HttpSession session = request.getSession();
        if(clientJWT != null && clientJWT.contains(".")) {
            BASE64Decoder decoder = new BASE64Decoder();
            String userInfo = new String(decoder.decodeBuffer(clientJWT.split("\\.")[1]));
            if(isJson(userInfo)) {
            	LoginUser userInfo1 = new LoginUser();
                JSONObject userInfoJSON = JSONObject.fromObject(userInfo);
                String tenantid = userInfoJSON.getString("tenant_id_selected");
            	String tenantname = "";
            	String sub = userInfoJSON.getString("sub");
            	String workno = userInfoJSON.getString("work_no");
            	String accountId = userInfoJSON.getString("accountId");
                JSONArray jsonArray = userInfoJSON.getJSONArray("tenants");
                for(int i=0;i<jsonArray.size();i++){
                	String jsontenantid = jsonArray.getJSONObject(i).getString("tenant_id");
                	String jsontenantname = jsonArray.getJSONObject(i).getString("tenant_name");
                	if(tenantid.trim().equals(jsontenantid.trim())) {
                		tenantname = jsontenantname;
                	}
                }
                userInfo1.setTenantid(tenantid);
                userInfo1.setTenantname(tenantname);
                userInfo1.setSub(sub);
                userInfo1.setWorkno(workno);
                userInfo1.setAccountId(accountId);
                session.setAttribute("UserInfo", userInfo1);
            }
        }
        
        
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {
    }

    public static boolean isJson(String value) {
        try {
            JSONObject.fromObject(value);
        } catch (JSONException e) {
            return false;
        }
        return true;
    }


}
