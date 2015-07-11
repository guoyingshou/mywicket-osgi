package com.tissue.osgi.web.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.framework.BundleContext;


public class MyServlet extends HttpServlet {
    public static final long serialVersionUID = 1L;

    private BundleContext bctx;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        bctx = (BundleContext)config.getServletContext().getAttribute("osgi-bundlecontext");
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        System.out.println(bctx);
        res.getWriter().println("fhdafj"); 
    }
}
