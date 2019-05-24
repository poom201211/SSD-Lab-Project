package main;

import lib.Block;
import lib.Map;
import java.util.ArrayList;
import java.util.List;

public class Memento {

    public List<Block> snakeBlock = new ArrayList<>();
    public int saveDx;
    public int saveDy;
    public int saveFoodX;
    public int saveFoodY;

    public Memento(Map map, Snake snake, Apple apple) {

        for (Block b : snake.getBody()) {
            snakeBlock.add(new Block(b.getX(), b.getY()));
        }
        this.saveDx = snake.getDx();
        this.saveDy = snake.getDy();
        this.saveFoodX = apple.getX();
        this.saveFoodY = apple.getY();
    }


}
