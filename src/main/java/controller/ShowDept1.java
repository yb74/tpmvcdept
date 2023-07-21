package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DeptPair;
import service.DeptNumService;
import service.NumDeptMapper;

@WebServlet("/show-departement-1")
public class ShowDept1 extends HttpServlet {
 
	private DeptNumService deptNumMapper = new NumDeptMapper();
  
  @Override
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
	  
    String deptNum = request.getParameter("dept-num");

    if (deptNum == null) {
      deptNum = "";
    }
    
    deptNum = deptNum.trim();
    
    String deptName = deptNumMapper.findDept(deptNum);
    
    
    
    DeptPair deptInfo = new DeptPair(deptNum, deptName);
    
    request.setAttribute("deptInfo1", deptInfo);
    
    
    String address;
    if (deptNum.isEmpty()) {
      address = "/WEB-INF/results/missing-num.jsp";
    } else if (deptName != null) {
      address = "/WEB-INF/results/show-departement-1.jsp";
    } else {
      address = "/WEB-INF/results/unknown-num-1.jsp";
    }
    RequestDispatcher dispatcher =
      request.getRequestDispatcher(address);
    dispatcher.forward(request, response);
  }
}
