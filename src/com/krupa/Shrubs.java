package com.krupa;

public interface Shrubs extends Tree{
	void branches();
	void family();
	void size();
	
	default void color() {
		System.out.println("color of the tree is dark green");
	}
}
