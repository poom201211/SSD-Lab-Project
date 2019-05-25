package lib;

import java.util.ArrayList;
import java.util.List;

public class Map {

    protected int size;
    protected List<Block> blocks = new ArrayList<Block>();

    public Map(int size){
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public List<Block> getBlocks() {
        return blocks;
    }

    public void addBlock(Block block) {
        blocks.add(block);
    }

}
