package main;

public class Main {

    public static void main(String[] args) {
        Game game = Game.getInstance();
        Gui gui = new Gui(game);
        gui.setVisible(true);
        game.start();
    }

}
