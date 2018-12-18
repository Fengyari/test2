package c6;
import javax.servlet.http.HttpServletRequest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;


public class test {
	public void test1(HttpServletRequest request,HttpServletResponse response) {
	String name=request.getParameter("username");
	String pass=request.getParameter("userpass");
	System.out.print("==="+name+"   "+pass);
}
}
