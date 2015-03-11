package com.zth.bean;

public class Person {
	private int id;
	private double x;
	private double y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Person(int id, double x, double y) {
		super();
		this.id = id;
		this.x = x;
		this.y = y;
	}

}
