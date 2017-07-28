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
