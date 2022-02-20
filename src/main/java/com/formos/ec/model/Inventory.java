/**
 * 
 */
package com.formos.ec.model;

import java.util.ArrayList;

/**
 * @author Daniela
 *
 */
public class Inventory {
	private int id;
	private Product product;
	private int initialStock;
	private int inStock;
	private int output;
	private int stock;
	private int minStock;

	public int getId() {
		return id;
	}

	public int getMinStock() {
		return minStock;
	}

	public void setMinStock(int minStock) {
		this.minStock = minStock;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getInitialStock() {
		return initialStock;
	}

	public void setInitialStock(int initialStock) {
		this.initialStock = initialStock;
	}

	public int getInStock() {
		return inStock;
	}

	public void setInStock(int inStock) {
		this.inStock = inStock;
	}

	public int getOutput() {
		return output;
	}

	public void setOutput(int output) {
		this.output = output;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void calculateStock(Product productIn, int output) {
		if (this.product.getName().equals(productIn.getName())) {
			this.stock = this.initialStock - output;
		}
	}

	public void showInventoryList(ArrayList<Inventory> inventoryList) {
		for (Inventory inventory : inventoryList) {
			System.out.println(inventory.getProduct().getName() + ":"
					+ inventory.getStock() + " " + inventory.getProduct().getUnit());
		}
		
	}

	/*
	 * public static boolean canSell(ArrayList<Inventory> inventarioList,
	 * ArrayList<Ingredient> ingredientList, int quantityUser, boolean isStrawberry,
	 * boolean isBanana, boolean isMango) { boolean canSellJuice = false; int
	 * minValueIce = quantityUser * 90; int minValueSugarMilk = quantityUser * 60;
	 * int minValueSugar = quantityUser * 24;
	 * 
	 * ingredientList.forEach((ingredient) ->
	 * System.out.println(inventory.getProduct().getName() + ":" +
	 * inventory.getStock() + " " + inventory.getProduct().getUnit()));
	 * 
	 * if (isStrawberry) { int minValueStrawberry = quantityUser * 150;
	 * 
	 * if (inventario.getProduct().getName().equals("strawberry") >=
	 * minValueStrawberry && iceQty >= minValueIce && sugarMilkQty >=
	 * minValueSugarMilk && sugarQty >= minValueSugar) { canSellJuice = true; } else
	 * { canSellJuice = false; } } else if (isBanana) { int minValueBanana =
	 * quantityUser * 180;
	 * 
	 * if (bananaQty >= minValueBanana && iceQty >= minValueIce && sugarMilkQty >=
	 * minValueSugarMilk && sugarQty >= minValueSugar) { canSellJuice = true; } else
	 * { canSellJuice = false; } } else if (isMango) { int minValueMango =
	 * quantityUser * 210;
	 * 
	 * if (mangoQty >= minValueMango && iceQty >= minValueIce && sugarMilkQty >=
	 * minValueSugarMilk && sugarQty >= minValueSugar) { canSellJuice = true; } else
	 * { canSellJuice = false; } }
	 * 
	 * return canSellJuice; }
	 */

	public boolean canSell(ArrayList<Ingredient> listIngredient, ArrayList<Inventory> listInventory) {
		boolean canSellJuice = true;
		for (Ingredient ingredient : listIngredient) {
			for (Inventory inventory : listInventory) {
				if (ingredient.getProduct().getName().equals(inventory.getProduct().getName())
						&& ingredient.getMeasure() > inventory.getStock()) {
					canSellJuice = false;
					break;
				}
			}
		}

		return canSellJuice;
	}

	public void reduceInventory(ArrayList<Ingredient> listIngredient, ArrayList<Inventory> listInventory) {

		for (Ingredient ingredient : listIngredient) {
			for (Inventory inventory : listInventory) {
				if(ingredient.getProduct().getName().equals(inventory.getProduct().getName())){
					inventory.setStock(inventory.getStock() - ingredient.getMeasure());	
				}
			}
		}

	}

}
