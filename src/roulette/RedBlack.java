package roulette;

import util.ConsoleReader;

public  class RedBlack extends Bet{
	static final String RB= "Red or Black";
	public RedBlack(String description, int odds) {
		super(RB, odds);

	}
	public String  placeBet(int whichBet){
	return  ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}
}
