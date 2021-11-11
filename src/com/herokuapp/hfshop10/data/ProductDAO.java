package com.herokuapp.hfshop10.data;

import java.util.List;

import com.herokuapp.hfshop10.model.Product;


public class ProductDAO {
    @SuppressWarnings("unchecked")
	public List<Product> listAllProduct() {
        try {
        	return HibernateUtil.getSessionFactory().openSession().createQuery("From Product").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
		return null;
    }
}
