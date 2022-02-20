/**
 * 
 */
package com.formos.ec.model;

/**
 * @author Daniela
 *
 */
public class Ingredient {
	private int id;
	private Product product;
	private int measure;

	public int getId() {
		return id;
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

	public int getMeasure() {
		return measure;
	}

	public void setMeasure(int measure) {
		this.measure = measure;
	}

	

}
