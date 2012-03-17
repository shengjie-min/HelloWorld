package com.shengjie.test.server;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * HelloServlet
 * 
 */

@SuppressWarnings("serial")
public class HelloServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		    throws IOException, ServletException {
		this.doPost(request, response);
	}
	
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("application/json");
        OutputStream out = response.getOutputStream();
        out.write("HelloWorld".getBytes());
    }

}

