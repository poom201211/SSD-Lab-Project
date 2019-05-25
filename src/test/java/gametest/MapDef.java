package gametest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import lib.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapDef {
    private Map map;

    @Given("a game map with size (.+).")
    public void createMap(int size) {
        map = new Map(size);
    }

    @Then("the size of the map should be (.+).")
    public void testMapSize(int size) {
        assertEquals(size,map.getSize());
    }
}
