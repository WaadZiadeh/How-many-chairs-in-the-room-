package assignment2;

public class Room {
	private int number ;
	private double length;
	private double width ;
	private Chair [] chairs ;
	
	
	public Room(int number, double length, double width, Chair[] chairs) {
		this.number = number;
		this.length = length;
		this.width = width;
		this.chairs = chairs;
	}
	
	public Room() {
		
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	public Chair[] getChairs() {
		return chairs;
	}
	
	public void setChairs(Chair[] chairs) {
		this.chairs = chairs;
	}
	
	public void displayRoomInfo() {
		int redCount = 0;
		int yellowCount = 0;
		int whiteCount = 0;
		for(int i=0; i<chairs.length; i++) {
			if (chairs[i].getColor() == "red") {
				redCount++;
			} else if (chairs[i].getColor() == "yellow") {
				yellowCount++;
			} else if (chairs[i].getColor() == "white") {
				whiteCount++;
			}
		}
		
		System.out.println(number + "\t" + length + "\t" + width + "\t" + chairs.length + "\t" + redCount + "\t" + yellowCount + "\t" + whiteCount);
	}
	        
}
