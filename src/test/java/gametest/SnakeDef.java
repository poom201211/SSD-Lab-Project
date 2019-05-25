package gametest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import main.Snake;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnakeDef {

    private Snake snake;

    @Given("a snake exist with size 4 block at position x = (.+) and y = (.+).")
    public void createSnake(int x, int y) {
        snake = new Snake(x,y);
    }

    @Then("after eating (.+) apples the size should be (.+) blocks.")
    public void testSnakeExpand(int expand, int size) {
        for(int i = 0; i < expand; i++){
            snake.expand();
        }
        assertEquals(size,snake.getBody().size());
    }

    @Then("it's position would be at x = (.+) and y = (.+).")
    public void testPosition(int x, int y) {
        assertEquals(x,snake.getX());
        assertEquals(y,snake.getY());
    }

}
