package com.xiong;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by pandongyu on 14-7-1.
 */
public class ActionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String method=request.getParameter("method") ;
      if("initWeb".equals(method)){
          initWeb(request) ;
      }
    }

    private void initWeb(HttpServletRequest request){
        String cookieStr=request.getParameter("cookieStr") ;
        if(!CommonUtil.StringEmpty(cookieStr)){
            HttpSession session = request.getSession(true);
            session.setAttribute("httpClient",CommonUtil.getHttpClient(cookieStr));
        }
    }
}
