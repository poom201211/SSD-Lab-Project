package gametest;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import main.Game;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameDef {
    private Game game;

    @Before
    public void setup() {
        game = Game.getInstance();
    }

    @Given("the right key was pressed.")
    public void makeSnakeTurnRight() {
        game.handleRightKey();
    }

    @Then("the snakes head would be pointing right.")
    public void overLappingTest() {
        assertEquals(1,game.getSnake().getDx());
        assertEquals(0,game.getSnake().getDy());
    }
}
