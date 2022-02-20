package com.formos.ec.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.formos.ec.model.Drink;
import com.formos.ec.model.Ingredient;
import com.formos.ec.model.Inventory;
import com.formos.ec.model.Product;

public class Menu {

	private Scanner input = new Scanner(System.in);
	// private String again;
	private int choose, quantity;
	private Inventory inventory;
	ArrayList<Ingredient> listIngredient;

	public void displayMenu() {
		System.out.println("\t\t\t\t+===================================+");
		System.out.println("\t\t\t\t         BLENDER FRUIT MENU          ");
		System.out.println("\t\t\t\t  1.- Inventory List                 ");
		System.out.println("\t\t\t\t  2.- Buy Strawberry Juice           ");
		System.out.println("\t\t\t\t  3.- Buy Banana Juice               ");
		System.out.println("\t\t\t\t  4.- Buy Mango Juice                ");
		System.out.println("\t\t\t\t  5.- Exit                           ");

	}

	public void order(ArrayList<Inventory> inventoryList) {
		Drink drink = new Drink();
		inventory = new Inventory();
		System.out.println("Press a key according to the showed options: ");
		choose = input.nextInt();
		// Conditions
		switch (choose) {
		case 1:
			inventory.showInventoryList(inventoryList);
			displayMenu();
			order(inventoryList);
			break;
		case 2:
			Product strawberry = new Product("strawberry");
			System.out.println("You choose Buy Strawberry juice!");
			System.out.print("How many strawberry juice do you want to buy? : ");
			quantity = input.nextInt();
			strawberry.setUnit("g");
			strawberry.setWeight(150);
			listIngredient = drink.defineIngredients(strawberry, quantity);
			if (!inventory.canSell(listIngredient, inventoryList)) {
				System.out.println("This product is not avaliable anymore, please choose another one...");
			} else {
				inventory.reduceInventory(listIngredient, inventoryList);
			}
			// prepare();
			displayMenu();
			order(inventoryList);
			break;
		case 3:
			Product banana = new Product("banana");
			System.out.println("You choose Buy Banana juice!");
			System.out.print("How many banana juice do you want to buy? : ");
			quantity = input.nextInt();
			banana.setUnit("g");
			banana.setWeight(180);
			listIngredient = drink.defineIngredients(banana, quantity);
			if (!inventory.canSell(listIngredient, inventoryList)) {
				System.out.println("This product is not avaliable anymore, please choose another one...");
			} else {
				inventory.reduceInventory(listIngredient, inventoryList);
			}
			// prepare();
			displayMenu();
			order(inventoryList);
		case 4:
			Product mango = new Product("mango");
			System.out.println("You choose Buy Mango juice!");
			System.out.print("How many mango juice do you want to buy? : ");
			quantity = input.nextInt();
			mango.setUnit("g");
			mango.setWeight(210);
			listIngredient = drink.defineIngredients(mango, quantity);
			if (!inventory.canSell(listIngredient, inventoryList)) {
				System.out.println("This product is not avaliable anymore, please choose another one...");
			} else {
				inventory.reduceInventory(listIngredient, inventoryList);
			}
			// prepare();
			displayMenu();
			order(inventoryList);
			break;
		case 5:
			System.out.println("Exit..");
			break;
		}

	}
}
