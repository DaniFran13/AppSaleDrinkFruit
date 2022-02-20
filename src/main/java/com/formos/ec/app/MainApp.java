package com.formos.ec.app;

import java.util.ArrayList;

import com.formos.ec.model.Ingredient;
import com.formos.ec.model.Inventory;
import com.formos.ec.model.Product;

public class MainApp {
	static ArrayList<Inventory> inventoryList;
	static Ingredient ingredient;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initializeInventoryValue();
		Menu menu = new Menu();
		menu.displayMenu();
		menu.order(inventoryList);
	}

	public static void initializeInventoryValue() {
		inventoryList = new ArrayList<Inventory>();
		ingredient = new Ingredient();
		//Product creation
		Product ice = new Product("ice");
		ice.setUnit("ml");
		//Ingredient creation
		Ingredient ingredient = new Ingredient();
		ingredient.setProduct(ice);
		ingredient.setMeasure(90);
		//Inventory initialize
		Inventory inventory = new Inventory();
		inventory.setProduct(ice);
		inventory.setInitialStock(300);
		inventory.setMinStock(90);
		inventory.calculateStock(ice, 0);
		inventoryList.add(inventory);
		
		//Product creation
		Product sugar = new Product("sugar");
		sugar.setUnit("g");
		//Ingredient creation
		ingredient = new Ingredient();
		ingredient.setProduct(sugar);
		ingredient.setMeasure(24);
		//Inventory initialize
		inventory = new Inventory();
		inventory.setProduct(sugar);
		inventory.setInitialStock(200);
		inventory.setMinStock(24);
		inventory.calculateStock(sugar, 0);
		inventoryList.add(inventory);

		//Product creation
		Product sugarMilk = new Product("sugarMilk");
		sugarMilk.setUnit("ml");
		//Ingredient creation
		ingredient = new Ingredient();
		ingredient.setProduct(sugarMilk);
		ingredient.setMeasure(60);
		//Inventory initialize
		inventory = new Inventory();
		inventory.setProduct(sugarMilk);
		inventory.setInitialStock(400);
		inventory.setMinStock(60);
		inventory.calculateStock(sugarMilk, 0);
		inventoryList.add(inventory);

		//Product creation
		Product strawberry = new Product("strawberry");
		strawberry.setUnit("g");
		//Ingredient creation
		ingredient = new Ingredient();
		ingredient.setProduct(strawberry);
		ingredient.setMeasure(150);
		//Inventory initialize
		inventory = new Inventory();
		inventory.setProduct(strawberry);
		inventory.setInitialStock(500);
		inventory.setMinStock(150);
		inventory.calculateStock(strawberry, 0);
		inventoryList.add(inventory);

		//Product creation
		Product banana = new Product("banana");
		banana.setUnit("g");
		//Ingredient creation
		ingredient = new Ingredient();
		ingredient.setProduct(banana);
		ingredient.setMeasure(180);
		//Inventory initialize
		inventory = new Inventory();
		inventory.setProduct(banana);
		inventory.setInitialStock(400);
		inventory.setMinStock(180);
		inventory.calculateStock(banana, 0);
		inventoryList.add(inventory);
		

		//Product creation
		Product mango = new Product("mango");
		mango.setUnit("g");
		//Ingredient creation
		ingredient = new Ingredient();
		ingredient.setProduct(mango);
		ingredient.setMeasure(2);
		////Inventory initialize
		inventory = new Inventory();
		inventory.setProduct(mango);
		inventory.setInitialStock(450);
		inventory.setMinStock(210);
		inventory.calculateStock(mango, 0);
		inventoryList.add(inventory);

	}
}
