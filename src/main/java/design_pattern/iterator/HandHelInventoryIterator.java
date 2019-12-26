package design_pattern.iterator;

public class HandHelInventoryIterator implements InventoryIterator {
    //NOTE: This is the concrete inventory and not the abstract inventory
    // Because we need to access instance variables of the concrete imp(via getter method) which
    // is not exposed by the abstract interface
    private HandHeldInventory inventory;

    //To track which element we are currently on
    private int index = 0;

    public HandHelInventoryIterator(HandHeldInventory inventory) {
        this.inventory = inventory;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return this.index < 2;
    }

    @Override
    public void next() {
        this.index += 1;
    }

    @Override
    public Item current() {
        switch(index) {
            case 0:
                return this.inventory.getLeft();
            case 1:
                return this.inventory.getRight();
            default:
                return null;
                //We can also throw exception OR
                //Return a NULL Object(Read Null Object Pattern)
        }
    }
}
