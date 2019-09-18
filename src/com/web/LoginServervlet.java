package com.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet(urlPatterns = "/login.do")
public class LoginServervlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决请求乱码
        req.setCharacterEncoding("UTF-8");
        //通过request请求对象取出前台提交的参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username+password);
        //将用户名存入reque对象
        req.setAttribute("username",username);
        req.setAttribute("password",password);
        //服务器端跳转，URL地址不变
        req.getRequestDispatcher("index.jsp").forward(req,resp);

//        //获取session对象
//        HttpSession session=req.getSession();
//        //将用户名存入session
//        session.setAttribute("username",username);
//        //客户端跳转，URL变化为

    }
}
