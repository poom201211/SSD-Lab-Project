package gametest;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import lib.Block;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlockDef {
    private Block block;

    @Before
    public void setup() {
        block = new Block(0,0);
    }

    @Given("a block with position x = (.+) and y = (.+).")
    public void createBlock(int x,int y) {
        block = new Block(x,y);
    }

    @Then("overlapping blocks at position x = (.+) and y = (.+) will return true.")
    public void overLappingTest(int x, int y) {
        Block testBlock = new Block(x,y);
        assertEquals(true,block.overlapped(testBlock));
    }

}
