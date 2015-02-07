package com.xiong;

import org.opencv.core.Core;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by xiong on 14-7-1.
 */
public class PicServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StringBuilder sb=new StringBuilder() ;
        Properties ps = System.getProperties();
        for(Object key:ps.keySet()){
           sb.append(""+key+":"+ps.getProperty((String) key)).append("\n") ;
        }
        response.getWriter().write(sb.toString());
    }
}
