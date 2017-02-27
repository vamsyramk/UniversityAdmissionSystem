/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import data.*;
import model.User;

/**
 *
 * @author vamsyramk
 */
public class LoginServlet extends HttpServlet {

   @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String url = "";
        String message = "";
        
        String action = request.getParameter("action");
        if(action.equals("login"))
        {
            String id =(String)request.getParameter("id");
            String password =(String)request.getParameter("password");
            String hashedPassword;
            try {
                hashedPassword = PasswordUtil.hashPassword(password);

            } catch (NoSuchAlgorithmException ex) {
                hashedPassword = ex.getMessage();
            }
            if(ProductDB.idExists(id)&&(ProductDB.passwordExists(password))){
                url="/admin.jsp";
            }else if(ProductDB.useridExists(id)&&(ProductDB.userpasswordExists(hashedPassword))){               
                url = "/studentpage.jsp";
            }
            else{
                url="/login.jsp";
                message = "wrong username or password";
                request.setAttribute("message", message);
            }
            
        }
        else if(action.equals("signup"))
        {
            // get parameters from the request
            String id =(String)request.getParameter("id");
            String password =(String)request.getParameter("password");            
             
            
            // hash and salt password
            String hashedPassword;
            try {
                hashedPassword = PasswordUtil.hashPassword(password);
                message="You have successfully signed up, log in here";
            } catch (NoSuchAlgorithmException ex) {
                hashedPassword = ex.getMessage();
            }            
            User user = new User();
            user.setId(id);
            user.setPassword(hashedPassword);
            request.setAttribute("id", id);
            ProductDB.insertUser(user);
            request.setAttribute("message", message);
            url = "/login.jsp";                       
        }
        else if(action.equals("resetpage")){
            String email = (String)request.getParameter("email");
            request.setAttribute("email",email);
            url="/reset.jsp";
        }
        else if(action.equals("resetpassword")){
            String email = (String)request.getParameter("email");
            String password = (String)request.getParameter("password");
            String hashedPassword;
            try {
                hashedPassword = PasswordUtil.hashPassword(password);                   
            } catch (NoSuchAlgorithmException ex) {
                hashedPassword = ex.getMessage();
            }
            User user = new User();
            user.setId(email);
            user.setPassword(hashedPassword);
            ProductDB.replaceUserPassword(user);
            url="/login.jsp";
            message = "You have successfully changed your password, use your new password to login";
            request.setAttribute("message",message);
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

}
