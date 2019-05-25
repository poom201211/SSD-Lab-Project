package main;

import lib.*;
import java.util.List;
import java.util.Random;

public class Game extends AbstractGame {

	private Random random = new Random();
	private Apple apple = new Apple(5, 5);
	private Snake snake = new Snake(10, 10);
	private Map map = new Map(20);
	private static final Game instance = new Game();

	public static Game getInstance(){
		return instance;
	}

	private Game() {
		for (Block b : snake.getBody()) {
			map.addBlock(b);
		}
		map.addBlock(apple);

	}

	public void resetGame(){
		map = new Map(20);
		apple.reset();
		snake.reset();
		for (Block b : snake.getBody()) {
			map.addBlock(b);
		}
		map.addBlock(apple);
		running = true;
	}

	public Snake getSnake(){
		return snake;
	}

	public int getMapSize() {
		return map.getSize();
	}

	public List<Block> getBlocks() {
		return map.getBlocks();
	}

	public Block getApple() {
		return apple;
	}

	@Override
	public void gameLogic() {
		snake.move();
		for (Block b : snake.getBody()) {
			if (b.overlapped(apple)) {
				Block newBlock = snake.expand();
				map.addBlock(newBlock);
				apple.setX(random.nextInt(map.getSize()));
				apple.setY(random.nextInt(map.getSize()));
				break;
			}
		}

		if (snake.hitItSelf()) {
			end();
		}
	}


	@Override
	public void handleLeftKey() {
		if (snake.getDx() != 1) {
			snake.setDx(-1);
			snake.setDy(0);
		}
	}

	@Override
	public void handleRightKey() {
		if (snake.getDx() != -1) {
			snake.setDx(1);
			snake.setDy(0);
		}
	}

	@Override
	public void handleUpKey() {
		if (snake.getDy() != 1) {
			snake.setDx(0);
			snake.setDy(-1);
		}
	}

	@Override
	public void handleDownKey() {
		if (snake.getDy() != -1) {
			snake.setDx(0);
			snake.setDy(1);
		}
	}

	public void load(Memento memento) {
		map.getBlocks().removeAll(map.getBlocks());

		snake.getBody().removeAll(snake.getBody());
		for(Block b : memento.snakeBlock) {
			snake.getBody().add(b);
		}
		
		snake.setDx(memento.saveDx);
		snake.setDy(memento.saveDy);
		apple.setX(memento.saveAppleX);
		apple.setY(memento.saveAppleY);

		for (Block b : snake.getBody()) {
			map.addBlock(b);
		}
		map.addBlock(apple);
	}

	public Memento save() {
		return new Memento(map, snake, apple);
	}

}
