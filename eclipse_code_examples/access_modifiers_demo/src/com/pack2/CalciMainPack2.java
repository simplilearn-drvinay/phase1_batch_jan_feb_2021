package com.pack2;

import com.pack1.Calculator;

public class CalciMainPack2 {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		//c.x=100; ->private within the class only
		c.printX();
		//c.m=1000;
		//System.out.println("m = "+c.m);
		//c.z=99;
		//System.out.println("z = "+c.z);
		System.out.println("Accessing outside the package");
		c.k=898989;
		System.out.println("k = "+c.k);

	}

}
