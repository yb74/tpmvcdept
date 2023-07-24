package controller;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DeptPair;

@WebServlet("/CreateDeptPair")
public class CreateDeptPair extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CreateDeptPair() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// retrieving dept-num and dept-name name values send by POST form request
		String deptNum = request.getParameter("dept-num");
		String deptName = request.getParameter("dept-nom");
		
		// setting deptPair values and passing data to result.jsp view template
		System.out.println("Num de département = " + deptNum);
		DeptPair deptPair = new DeptPair(deptNum, deptName);
		request.setAttribute("key", deptPair);

		// managing errors
		String address = "";
		if (deptNum == "" || deptName == "") {
			address = "/WEB-INF/results/missing-num.jsp";
		} else {
			address = "/WEB-INF/results/show-created-departement.jsp";
		}

		request.getRequestDispatcher(address).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		String deptNum = request.getParameter("dept-num");
		String deptName = request.getParameter("dept-nom");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        EntityTransaction txn = em.getTransaction();

		System.out.println("Before persist condition");
		
		if (deptNum != "" && deptName != "") {
			try {
	            txn.begin();

    	    	DeptPair deptPair = new DeptPair(deptNum, deptName);
				em.persist(deptPair);
	    		 
	            txn.commit();
	        } catch (Exception e) {
	            if (txn != null) {
	                txn.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            if (em != null) {
	                em.close();
	            }
	            if (emf != null) {
	                emf.close();
	            }
	        }
			
			System.out.println("Data persisted to DB");
			System.out.println("Num de département = " + deptNum);
			System.out.println("Num de département = " + deptName);
		} else {
			System.out.println("data not persisted to the DB");
			System.out.println("Num de département = " + deptNum);
			System.out.println("Num de département = " + deptName);
		}
	}
}
