package InteractiveGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

	}
	
	
	
	public String getInput(String input) {
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		return input;
	}
	public int getInput(int input) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		input = Integer.parseInt(in);
		return input;
	}

}
