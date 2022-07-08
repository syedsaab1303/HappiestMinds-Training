//Injecting reference type

package com.springcore.ref;

public class A {
	private int x;     
	private B ob;      // here we use B class as a refrence   ,here  A depend hai  B pr so B  is dependency and A is dependent object
	// A only work when we add class B as an object 
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", ob=" + ob + "]";
	}
	
	
}