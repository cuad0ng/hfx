package com.herokuapp.hfshop10.data;

import java.util.List;

import com.herokuapp.hfshop10.model.Category;

public class CategoryDAO {
    @SuppressWarnings("unchecked")
	public List<Category> listAllCategory() {
        try {
        	return HibernateUtil.getSessionFactory().openSession().createQuery("From Category").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
		return null;
    }
}
