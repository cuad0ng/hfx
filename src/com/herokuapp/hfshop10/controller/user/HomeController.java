package com.herokuapp.hfshop10.controller.user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.herokuapp.hfshop10.data.CategoryDAO;
import com.herokuapp.hfshop10.data.ProductDAO;
import com.herokuapp.hfshop10.model.Category;
import com.herokuapp.hfshop10.model.Product;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductDAO productDao;
	private CategoryDAO categoryDao;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeController() {
    	productDao = new ProductDAO();
    	categoryDao = new CategoryDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Product> listProduct = new ArrayList<Product>();
		listProduct = productDao.listAllProduct();
        request.setAttribute("listProduct", listProduct);
        
        List<Category> listCategory = new ArrayList<Category>();
        listCategory = categoryDao.listAllCategory();
        request.setAttribute("listCategory", listCategory);
        
        String url = "/view/user/index.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(url);
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
