package com.cognizant.truyum.dao;
import com.cognizant.truyum.model.MenuItem;

import java.util.List;

public interface CartDao {
	public void addCartItem(long userId,long menuItemId);
	public List<MenuItem> getAllCartItems(long userId) throws CartEmptyException;
	void removeCartItem(long userId,long menuItemId); 

}
