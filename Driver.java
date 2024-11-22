package assignment2;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		Room [] rooms =new Room[3];
		
		for(int i= 0;i<rooms.length;i++) {
			Random r1 =new Random();
			int RC = r1.nextInt(31)+20;
			Chair [] CH = new Chair[RC];
			
			int Rnum=201+i;
			
			Random r2 = new Random();
			double min = 30;
			double max = 50;
			double Rlength= Math.round(min + (max - min) * r2.nextDouble());
			double Rwidth= Math.round(max + (max - min) * r2.nextDouble());
			
			Room room =new Room(Rnum,Rlength,Rwidth,CH);
			
			for(int y=0;y<CH.length;y++) {
				CH[y]=new Chair();
				CH[y].getDistanceFromFrontWall();
				CH[y].setColor();
				}	
			
			rooms[i] = room;
		}
		
		displayRoom (rooms);
		
	}
	
	public static void displayRoom(Room [] rooms) {
		System.out.println("number" + "\t" + "length" + "\t" + "width" + "\t" + "total chairs" + "\t" + "red" + "\t" + "yellow" + "\t" + "white");
		for (Room r : rooms) {
			r.displayRoomInfo();
			}
	}

}


