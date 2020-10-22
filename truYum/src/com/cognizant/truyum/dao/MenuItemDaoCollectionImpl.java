package com.cognizant.truyum.dao;

import java.util.ArrayList;
import java.util.List;

public class MenuItemDaoCollectionImpl{
	
	private static List<MenuItem> menuItemList=new ArrayList<MenuItem>();
	public MenuItemDaoCollectionImpl() throws ParseException {
		//super();
		if(menuItemList == null)
		{
			menuItemList=new ArrayList<MenuItem>();
		}
	}
	
	public List<MenuItem> getMenuItemList() {
		return menuItemList;
	}

	public void setMenuItemList(List<MenuItem> menuItemList) {
		this.menuItemList = menuItemList;
	}
	public List<MenuItem> getMenuItemListAdmin(){
		
	}
	public List<MenuItem> getMenuItemListCustomer(){
		
	}
	public void modifyMenuItem(MenuItem menuItem){
		
	}
	public MenuItem getMenuItem(long menuItemId){
		
	}

}
