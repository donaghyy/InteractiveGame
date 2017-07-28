package InteractiveGame;

public class Player {
	
	private String playerName;
	private int noOfDeaths;
	private int xVal;
	private int yVal;
	
	
	public Player(String playerName, int noOfDeaths, int xVal, int yVal) {
		this.playerName = playerName;
		this.noOfDeaths = noOfDeaths;
		this.xVal = xVal;
		this.yVal = yVal;
	}


	public String getPlayerName() {
		return playerName;
	}


	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}


	public int getNoOfDeaths() {
		return noOfDeaths;
	}


	public void setNoOfDeaths(int noOfDeaths) {
		this.noOfDeaths = noOfDeaths;
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
