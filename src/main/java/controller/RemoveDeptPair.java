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

import org.formation.hibernate.entity.Actor;
import org.formation.hibernate.entity.Movie;
import org.formation.hibernate.entity.Professor;

import model.DeptPair;
import service.NumDeptMapper;

@WebServlet("/RemoveDeptPair")
public class RemoveDeptPair extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RemoveDeptPair() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String deptNum = request.getParameter("dept-num");
		String deptName = request.getParameter("dept-nom");
		
		System.out.println("Num de département = " + deptNum);
		System.out.println("Num de département = " + deptName);
		
	        
		// retrieving dept-num name value send by POST form request

		System.out.println("Before persist condition");
		
		
		if (deptNum != "" && deptName != "") {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
			EntityManager em = emf.createEntityManager();
			EntityTransaction txn = em.getTransaction();
			try {
				txn.begin();
				
				NumDeptMapper deptMapper = new NumDeptMapper();
		        String associatedDeptName = deptMapper.findDept(deptNum);
				
				
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
