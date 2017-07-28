package InteractiveGame;

public class Player {
	
	private String playerName;
	
	private int noOfLifes;
	private int xVal;
	private int yVal;
	private String direction;
	
	
	public String getDirection() {
		return direction;
	}


	public void setDirection(String direction) {
		this.direction = direction;
	}


	public Player(String playerName, int noOfDeaths, int xVal, int yVal) {
		this.playerName = playerName;
		this.noOfLifes = noOfDeaths;
		this.xVal = xVal;
		this.yVal = yVal;
	}
	
	public boolean checkDead(Player p1) {
		String r = "";
		if(p1.getNoOfLifes()<1) {
			System.out.println("\nYOU ARE DEAD!");
			System.out.println("GAME OVER " +"\nUnlucky "+ p1.getPlayerName()+", better luck next time");
			System.exit(0);
			r = "true";
		}
		else {
			r = "false";
		}
		
		boolean rr = Boolean.parseBoolean(r);
		return rr;
	}


	public Player() {
		
	}


	public String getPlayerName() {
		return playerName;
	}


	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}



	public int getNoOfLifes() {
		return noOfLifes;
	}


	public void setNoOfLifes(int noOfLifes) {
		this.noOfLifes = noOfLifes;
	}


	public int getxVal() {
		return xVal;
	}


	public void setxVal(int xVal) {
		this.xVal = xVal;
	}


	public int getyVal() {
		return yVal;
	}


	public void setyVal(int yVal) {
		this.yVal = yVal;
	}
	
	
	

}
