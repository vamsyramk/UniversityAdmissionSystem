
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import data.*;
import java.util.ArrayList;
import javax.mail.MessagingException;
import model.*;

/**
 *
 * @author vamsyramk
 */
public class ControlServlet extends HttpServlet {
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
            System.out.println("id is "+id+"password is "+password);
            if(ProductDB.idExists(id)&&(ProductDB.passwordExists(password))){
                url="/admin.jsp";
            }else if(ProductDB.useridExists(id)&&(ProductDB.userpasswordExists(password))){
                User user = new User();
                user.setId(id);
                user.setPassword(password);
                request.setAttribute("id", id);
                ProductDB.insertUser(user);
                request.setAttribute("message", message);
                url = "/studentpage.jsp";
            }
            else{
                url="/error.jsp";
            }
            
        }
        else if(action.equals("signup"))
        {
            String id =(String)request.getParameter("id");
            String password =(String)request.getParameter("password");
            //System.out.println("id is "+id+"password is "+password);
            
                User user = new User();
                user.setId(id);
                user.setPassword(password);
                request.setAttribute("id", id);
                ProductDB.insertUser(user);
                request.setAttribute("message", message);
                url = "/login.jsp";
                        
        }
        else if(action.equals("formfill")){
            String firstname=(String)request.getParameter("firstname");
            String lastname=(String)request.getParameter("lastname");
            String suffix=(String)request.getParameter("suffix");
            String dob=(String)request.getParameter("dob");
            String email=(String)request.getParameter("email");
            String contact=(String)request.getParameter("contact");
            String branch=(String)request.getParameter("branch");
            int grescore=Integer.parseInt(request.getParameter("grescore"));
            Double englishscore=Double.parseDouble(request.getParameter("englishscore"));
            Double percentage=Double.parseDouble(request.getParameter("percentage"));
            String country=(String)request.getParameter("country");
            String state=(String)request.getParameter("state");
            String zip=(String)request.getParameter("zip");
            
            Student student = new Student();
            student.setFirstname(firstname);
            student.setLastname(lastname);
            student.setSuffix(suffix);
            student.setDob(dob);
            student.setEmail(email);
            student.setContact(contact);
            student.setBranch(branch);
            student.setGrescore(grescore);
            student.setEnglishscore(englishscore);
            student.setPercentage(percentage);
            student.setCountry(country);
            student.setState(state);
            student.setZip(zip);
            
            ProductDB.insertStudent(student);
            message="Your application has been submitted successfully";
            request.setAttribute("message",message);
            url="/studentpage.jsp";
        }        
        else if (action.equals("displayStudents")) {
            url = "/students.jsp";    // the "products" page
            ArrayList studentslist = new ArrayList();
            studentslist = (ArrayList) ProductDB.selectStudents();
            int cscount = ProductDB.getEmptySeats("cs");
            int itcount = ProductDB.getEmptySeats("it");
            int dsbacount = ProductDB.getEmptySeats("dsba");
            request.setAttribute("studentslist", studentslist);
            request.setAttribute("cscount", cscount);
            request.setAttribute("itcount", itcount);
            request.setAttribute("dsbacount", dsbacount);
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
