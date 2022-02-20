/**
 * 
 */
package com.formos.ec.model;

import java.util.ArrayList;

import com.formos.ec.enums.Size;

/**
 * @author Daniela
 *
 */
public class Drink {
	private int id;
	private ArrayList<Ingredient> listIngredient;
	private Size size;
	private float price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Ingredient> getListIngredient() {
		return listIngredient;
	}

	public void setListIngredient(ArrayList<Ingredient> listIngredient) {
		this.listIngredient = listIngredient;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void prepare() {

	}

	public ArrayList<Ingredient> defineIngredients(Product product, int quantity) {
		Product ice = new Product("ice");
		Product sugarMilk = new Product("sugarMilk");
		Product sugar = new Product("sugar");
		ArrayList<Ingredient> ingredientList = new ArrayList<Ingredient>();
		Ingredient ingredient = new Ingredient();

		ingredient.setProduct(product);
		ingredient.setMeasure(product.getWeight() * quantity);
		ingredientList.add(ingredient);
		ingredient = new Ingredient();

		ice.setUnit("ml");
		ice.setWeight(quantity * 90);
		ingredient.setProduct(ice);
		ingredient.setMeasure(quantity * 90);
		ingredientList.add(ingredient);
		ingredient = new Ingredient();

		sugarMilk.setUnit("ml");
		sugarMilk.setWeight(quantity * 60);
		ingredient.setProduct(sugarMilk);
		ingredient.setMeasure(quantity * 60);
		ingredientList.add(ingredient);
		ingredient = new Ingredient();

		sugar.setUnit("g");
		sugar.setWeight(quantity * 24);
		ingredient.setProduct(sugar);
		ingredient.setMeasure(quantity * 24);
		ingredientList.add(ingredient);

		return ingredientList;
	}

}
