package main;

import lib.Block;
import lib.Map;
import java.util.ArrayList;
import java.util.List;

public class Memento {

    public List<Block> snakeBlock = new ArrayList<>();
    public int saveDx;
    public int saveDy;
    public int saveAppleX;
    public int saveAppleY;

    public Memento(Map map, Snake snake, Apple apple) {
        for (Block b : snake.getBody()) {
            snakeBlock.add(new Block(b.getX(), b.getY()));
        }
        this.saveDx = snake.getDx();
        this.saveDy = snake.getDy();
        this.saveAppleX = apple.getX();
        this.saveAppleY = apple.getY();
    }


}
