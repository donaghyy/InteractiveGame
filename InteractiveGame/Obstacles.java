package InteractiveGame;

public class Obstacles {
	
	String Oname;
	String Odesc;
	int costLife;
	
	int xVal;
	int yVal;
	
	public Obstacles(String oname, String odesc, int costLife, int xVal, int yVal) {
		Oname = oname;
		Odesc = odesc;
		this.costLife = costLife;
		this.xVal = xVal;
		this.yVal = yVal;
	}

	
}
