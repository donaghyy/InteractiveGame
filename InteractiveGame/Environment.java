package InteractiveGame;

import java.util.ArrayList;

public class Environment {
	
	public ArrayList<Obstacles> obstacles = new ArrayList<Obstacles>();
	
	
	
	String locationName;
	int finishX = -3;
	int finishY = 4;
	
	int boundsX1 = -10;
	int boundsX2 = 10;
	int boundsY1 = -10;
	int boundsY2 = 10;
	
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
	
	public void checkObstacles(Player p1, Environment e1) {
		
		
		for (int i=0; i<e1.obstacles.size(); i++) {
			if(p1.getxVal() == e1.obstacles.get(i).xVal
					&& p1.getyVal() == e1.obstacles.get(i).yVal) {
				String desc = e1.obstacles.get(i).Odesc;
				String name = e1.obstacles.get(i).Oname;
				p1.setNoOfLifes(p1.getNoOfLifes()-1);
				
				System.out.println("\n"+name+"\n"+desc);
				System.out.println("\nLifes remaining: "+p1.getNoOfLifes());
				p1.checkDead(p1);
			}
		}
	}
	
	public void checkOutBounds(Player p1) {
		if(p1.getxVal()<boundsX1 || p1.getxVal()>boundsX2) {
			System.out.println("You have reached the end of the map, please head toward the goal");
			showCompass(p1);
		}
		else if(p1.getyVal()<boundsY1 || p1.getyVal()>boundsY2) {
			System.out.println("You have reached the end of the map, please head toward the goal");
			showCompass(p1);
		}
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
	
	

}
