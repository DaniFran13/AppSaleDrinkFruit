package com.formos.ec.enums;

public enum Size {
	
	SMALL(100), MEDIUM(200), LARGE(300);
	private int value;

	Size(int i) {
		this.value=i;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
