package org.app.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.app.shoppingbackend.dao.CategoryDAO;
import org.app.shoppingbackend.dto.Category;
import org.springframework.stereotype.Repository;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	static {
		
		//DUMMY "STATIC"!!! DATA FOR TESTING PURPUSES 

		Category category = new Category();

		// adding first category
		category.setId(1);
		category.setName("Televison");
		category.setDescription("This is description for television!");
		category.setImageURL("CAT_1.png");

		categories.add(category);

		// adding second category

		category = new Category();

		// adding first category
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is description for mobile!");
		category.setImageURL("CAT_2.png");

		categories.add(category);

		// adding third category

		category = new Category();

		// adding first category
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is description for laptop!");
		category.setImageURL("CAT_3.png");

		categories.add(category);
	}

	public List<Category> list() {

		return categories;
	}

	
	public Category get(int id) {
		//for each to get the category by id
		for(Category category : categories) {
			if(category.getId() == id)
				return category;
		}
		return null;
	}

}
