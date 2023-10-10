package gr.aueb.cf.webappcf.controller;

import gr.aueb.cf.webappcf.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/get-student")
public class StudentController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Student student = new Student(1, "alice", "Wonderland");

        request.setAttribute("student", student);
        request.getRequestDispatcher("/student.jsp").forward(request, response);
    }
}
