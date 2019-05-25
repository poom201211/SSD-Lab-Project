package gametest;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import main.Snake;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnakeDef {
    private Snake snake;

    @Before
    public void setup() {
        snake = new Snake(10,10);
    }

    @Given("a snake exist with size 4 block")
    public void a_snake_exist() {
        snake.reset();
    }

    @Then("after eating (.+) apples the size should be (.+) blocks")
    public void after_eating_apples_the_size_should_be_blocks(int expand, int size) {
        for(int i = 0; i < expand; i++){
            snake.expand();
        }
        assertEquals(size,snake.getBody().size());
    }
}
