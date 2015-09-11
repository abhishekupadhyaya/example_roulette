package roulette;

import util.ConsoleReader;

public class Three  extends Bet{

	public Three(String description, int odds) {
		super("three options", odds);
		// TODO Auto-generated constructor stub
	}

	public String placeBet(int whichBet) {
		return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - 3);
	}

}
