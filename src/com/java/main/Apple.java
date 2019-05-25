package main;

import lib.Block;

public class Apple extends Block{

	public Apple(int x, int y) {
		super(x, y);
	}

	public void reset() {
		this.x = 5;
		this.y = 5;
	}

}
