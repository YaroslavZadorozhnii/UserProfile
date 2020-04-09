import logic.Pelper;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 * Created by anton on 08.04.2020.
 */
@WebServlet(name = "profile")
public class profile extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Date date = new Date();
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String age = request.getParameter("age");
        String leanr = request.getParameter("learn");
        String a = ";";
        int ageYes = 0;
        int ageNo = 0;
        int learnYes = 0;
        int learnNo = 0;
        if("1".equals(age)){
            ageYes = 1;
        } else if("0".equals(age)){
            ageNo = 1;
        }
        if("1".equals(leanr)){
            learnYes = 1;
        }else if("0".equals(leanr)){
            learnNo = 1;
        }
        try(FileWriter fileWrit = new FileWriter("C:\\Users\\anton\\Desktop\\tempTest.txt")) {
            fileWrit.write(firstName + a + lastName + a + ageYes + a + ageNo + a + learnYes + a + learnNo + a +
                    date + "\n");
        }
        try(FileWriter fileWriter = new FileWriter("C:\\Users\\anton\\Desktop\\test.txt", true)){
            fileWriter.write(firstName + a + lastName + a + ageYes + a + ageNo + a + learnYes + a + learnNo + a +
                    date +  "\n" );
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("result.jsp");
        requestDispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
