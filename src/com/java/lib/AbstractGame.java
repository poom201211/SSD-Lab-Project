package lib;

import java.util.Observable;

public abstract class AbstractGame extends Observable {

    public boolean running = false;

    public abstract void gameLogic();
    public abstract void handleLeftKey();
    public abstract void handleRightKey();
    public abstract void handleUpKey();
    public abstract void handleDownKey();

    public Thread gameThread = new Thread() {
        @Override
        public void run() {
            super.run();
            while(true) {
                if(running) {
                    singleGameLoop();
                }else{
                    System.out.println();
                }
            }
        }
    };

    public void start() {
        running = true;
        gameThread.start();
    }

    public void end() {
        running = false;
    }

    private void singleGameLoop() {
        gameLogic();
        setChanged();
        notifyObservers();
        delay();
    }

    private void delay() {
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
