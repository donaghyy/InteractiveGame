package InteractiveGame;

import java.util.ArrayList;

public class Environment {
	
	String locationName;
	int finishX = -3;
	int finishY = 4;
	
	int boundsX1;
	int boundsX2;
	int boundsY1;
	int boundsY2;
	
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public int getFinishX() {
		return finishX;
	}
	public void setFinishX(int finishX) {
		this.finishX = finishX;
	}
	public int getFinishY() {
		return finishY;
	}
	public void setFinishY(int finishY) {
		this.finishY = finishY;
	}
	
	public void checkOutBounds(Player p1) {
		
	}
	
	public boolean checkGoal(Player p1) {
		int playerX = p1.getxVal();
		int playerY = p1.getyVal();
		String r = "";
		if(playerX == getFinishX() && playerY == getFinishY()) {
			System.out.println("\nCONGRATULATIONS " + p1.getPlayerName() + ", You completed the game!");
			r = "true";
		}
		else {
			r = "false";
		}
		boolean rr = Boolean.parseBoolean(r);
		return rr;
	}
	
	public void showCompass(Player p1) {
		Main m = new Main();
		System.out.println("Show Compass? (Y)es / (N)o");
		String input = "";
		input = m.getInput(input);
		
		
		if(input.equals("Y")) {
			showMap(p1);
		}
	}
	
	public void showMap(Player p1) {
		int goalX = getFinishX();
		int goalY = getFinishY();
		int currentX = p1.getxVal();
		int currentY = p1.getyVal();
		
		int winX = goalX - currentX;
		int winY = goalY - currentY;
		
		System.out.println("\nGOAL DIRECTION: ");
		System.out.println("Y: " + winY);
		System.out.println("X: " + winX);
		System.out.println("__________________________________");
	}
	
	public void obstacles() {
		
	}
	

}
