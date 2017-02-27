/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import data.*;
import java.util.UUID;

/**
 *
 * @author vamsyramk
 */
public class EmailServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String url="";
        String message="";
        // get current action
        String action = request.getParameter("action");
        if (action.equals("admit")){
            String branch = (String)request.getParameter("branch");
            String to = (String)request.getParameter("email");
            String from = "vamsyramk@gmail.com";
            String subject = "Congratulations on your Admit";
            
            String body = "Dear " + to + ",\n\n"
                    + "We are glad to inform you that you have "
                    + "been admitted to our university\n"
                    + "Have a great day and congrats again!\n\n"
                    + "Kelly Slivkoff\n"
                    + "UNC Charlotte";
            boolean isBodyHTML = false;
            ProductDB.deleteStudent(to);
            int count = ProductDB.getEmptySeats(branch);
            count=count-1;
            ProductDB.updateEmptySeats(branch,count);
            
            try {
                //MailUtilLocal.sendMail(to, from, subject, body, isBodyHTML);
                MailUtilGmail.sendMail(to, from, subject, body, isBodyHTML);
                message="You have successfully admitted the student, click on display students to review more applications";
                request.setAttribute("message",message);
            } catch (MessagingException e) {
                String errorMessage
                        = "ERROR: Unable to send email. "
                        + "Check Tomcat logs for details.<br>"
                        + "ERROR MESSAGE: " + e.getMessage();
                request.setAttribute("errorMessage", errorMessage);
                this.log("Unable to send email");
            }
            url = "/admin.jsp";
        }
        //for forgot password action
        else if (action.equals("forgot")){
            String to = (String)request.getParameter("Email");
            String from = "vamsyramk@gmail.com";
            String subject = "Reset your password.";
            String token = UUID.randomUUID().toString();
            String fUrl = "http://localhost:8081/Vamsy_Project/LoginServlet?action=resetpage&value="+token+"&email="+to;
            
            String body = "Dear " + to + ",\n\n"
                    + "Click on the link below to change your password. \n"
                    +fUrl;
            boolean isBodyHTML = false;

            try {
                //MailUtilLocal.sendMail(to, from, subject, body, isBodyHTML);
                MailUtilGmail.sendMail(to, from, subject, body, isBodyHTML);
                
            } catch (MessagingException e) {
                String errorMessage
                        = "ERROR: Unable to send email. "
                        + "Check Tomcat logs for details.<br>"
                        + "ERROR MESSAGE: " + e.getMessage();
                request.setAttribute("errorMessage", errorMessage);
                this.log("Unable to send email");
            }
            url = "/login.jsp";
        }
        else if(action.equals("reset")){
            url = "/reset.jsp";
        }else if(action.equals("resetPwd")){
            
        }
        else if(action.equals("reject")){            
            String to = (String)request.getParameter("email");
            String from = "vamsyramk@gmail.com";
            String subject = "Decision of your Admit";
            String body = "Dear " + to + ",\n\n"
                    + "We are sorry to inform you that you have "
                    + "not been admitted to our university\n"
                    + "Thank You for your interest\n\n"
                    + "Kelly Slivkoff\n"
                    + "UNC Charlotte";
            boolean isBodyHTML = false;
            ProductDB.deleteStudent(to);

            try {
                //MailUtilLocal.sendMail(to, from, subject, body, isBodyHTML);
                MailUtilGmail.sendMail(to, from, subject, body, isBodyHTML);
                message="You have rejected the student, click on display students to review more applications";
                request.setAttribute("message",message);
            } catch (MessagingException e) {
                String errorMessage
                        = "ERROR: Unable to send email. "
                        + "Check Tomcat logs for details.<br>"
                        + "ERROR MESSAGE: " + e.getMessage();
                request.setAttribute("errorMessage", errorMessage);
                this.log("Unable to send email");
            }
            url = "/admin.jsp";           
        }
        else if(action.equals("contactus")){            
            String to = "vamsyramk@gmail.com";
            String from = (String)request.getParameter("email");
            String subject = (String)request.getParameter("subject");;
            String body = (String)request.getParameter("message");;
            boolean isBodyHTML = false;

            try {
                MailUtilGmail.sendMail(to, from, subject, body, isBodyHTML);
                message="Your mail was sent to the support team. Your issue will be resolved soon.";
                request.setAttribute("message",message);
            } catch (MessagingException e) {
                String errorMessage
                        = "ERROR: Unable to send email. "
                        + "Check Tomcat logs for details.<br>"
                        + "ERROR MESSAGE: " + e.getMessage();
                request.setAttribute("errorMessage", errorMessage);
                this.log("Unable to send email");
            }
            url = "/contact.jsp";           
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
