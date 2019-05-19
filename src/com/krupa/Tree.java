package com.krupa;

public interface Tree {
	
	void branches();
	void family();
	
	default void color() {
		System.out.println("color of the tree is green");
	}

}
