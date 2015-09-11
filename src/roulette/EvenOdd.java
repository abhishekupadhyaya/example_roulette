package roulette;

import util.ConsoleReader;

public  class EvenOdd extends Bet {

	public EvenOdd(String description, int odds) {
		super("even or odd", odds);
		// TODO Auto-generated constructor stub
	}

	public String placeBet(int whichBet) {
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}



}
