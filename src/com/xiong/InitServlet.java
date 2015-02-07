package com.xiong;

import org.opencv.core.Core;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

/**
 * Created by pandongyu on 14-7-1.
 */
public class InitServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        System.setProperty("java.library.path", System.getProperty("java.library.path")+ ":"+this.getServletContext().getRealPath("/WEB-INF/lib"));
        Field fieldSysPath = null;
        try {
            fieldSysPath = ClassLoader.class.getDeclaredField("sys_paths");
            fieldSysPath.setAccessible(true);
            fieldSysPath.set(null, null);
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
//        File file = new File(this.getServletContext().getRealPath("/WEB-INF/lib"));;
//        File[] cs = file.listFiles();
//        for (File c : cs) {
//            if (c.exists()&&!c.getName().endsWith("a")) {
//                System.load(c.getAbsolutePath());
//            }
//        }
    }
}
