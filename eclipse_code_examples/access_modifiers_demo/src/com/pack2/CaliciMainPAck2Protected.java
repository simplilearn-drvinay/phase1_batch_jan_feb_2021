package com.pack2;

import com.pack1.Calculator;

public class CaliciMainPAck2Protected extends Calculator{

	public static void main(String[] args) {
	
		CaliciMainPAck2Protected cp=new CaliciMainPAck2Protected();
		System.out.println("m = "+cp.m);
		//System.out.println("z = "+cp.z);
		cp.printX();

	}

}
