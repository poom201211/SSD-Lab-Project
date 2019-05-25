package main;

import java.util.ArrayList;
import java.util.List;

import lib.Block;

public class Snake {

	private List<Block> body = new ArrayList<Block>();
	private int dx = 0;
	private int dy = -1;
	private int x,y;

	public Snake(int x, int y) {
		this.x = x;
		this.y = y;
		body.add(new Block(x, y));
		body.add(new Block(x, y + 1));
		body.add(new Block(x, y + 2));
		body.add(new Block(x, y + 3));
	}

	public void reset() {
		body = new ArrayList<Block>();
		body.add(new Block(10, 10));
		body.add(new Block(10, 10 + 1));
		body.add(new Block(10, 10 + 2));
		body.add(new Block(10, 10 + 3));
	}

	public List<Block> getBody() {
		return body;
	}

	public void move() {
		Block lastBlock = body.remove(body.size() - 1);
		Block firstBlock = body.get(0);
		lastBlock.setX(firstBlock.getX() + dx);
		lastBlock.setY(firstBlock.getY() + dy);
		body.add(0, lastBlock);
	}

	public int getDx() {
		return dx;
	}

	public int getDy() {
		return dy;
	}

	public void setDx(int dx) {
		this.dx = dx;
	}

	public void setDy(int dy) {
		this.dy = dy;
	}

	public int getX(){ return x; }

	public int getY(){ return y; }

	public Block expand() {
		Block lastBlock = body.get(body.size() - 1);
		Block last2Block = body.get(body.size() - 2);
		int ddx = lastBlock.getX() - last2Block.getX();
		int ddy = lastBlock.getY() - last2Block.getY();

		Block newBlock = new Block(lastBlock.getX() + ddx, lastBlock.getY() + ddy);
		body.add(newBlock);

		return newBlock;
	}

	public boolean hitItSelf() {
		Block head = body.get(0);
		for (int i = 1; i < body.size(); i++) {
			if (head.overlapped(body.get(i))) {
				return true;
			}
		}
		return false;
	}
}
