package assignment2;

import java.util.*;

public class Chair {
	private double weight ;
	private double distanceFromFrontWall ;
	private String color ;
	private Date dateManufactured ;
	
	public Chair () {
		this(0.0,0.0,null,null); 
	}
	
	public Chair(double weight, double distanceFromFrontWall, String color, Date dateManufactured) {
		
		this.weight = weight;
		this.distanceFromFrontWall = distanceFromFrontWall;
		this.color = color;
		this.dateManufactured = dateManufactured;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void setDistanceFromFrontWall(double distanceFromFrontWall) {
		this.distanceFromFrontWall = distanceFromFrontWall;
	}
	
	public void setColor() {
		String[] c={"red", "yellow", "white"};
		Random RanC=new Random ();
		this.color = c[RanC.nextInt(c.length)];
	}
	
	public void setDateManufactured(Date dateManufactured) {
		this.dateManufactured = dateManufactured;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double getDistanceFromFrontWall() {
		return distanceFromFrontWall;
	}
	
	public String getColor() {
		return color;
	}
	
	public Date getDateManufactured() {
		return dateManufactured;
	}
	
	public void moveChairForward(double distance) {
		
	}
	
	public void moveChairBackward(double distance) {
		
	}
}
