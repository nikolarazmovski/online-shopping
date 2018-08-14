package org.app.shoppingbackend.dao;

import java.util.List;

import org.app.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);
	
}
