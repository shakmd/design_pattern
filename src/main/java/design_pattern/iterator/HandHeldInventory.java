package design_pattern.iterator;

public class HandHeldInventory implements Inventory {
    private Item left;
    private Item right;

    public HandHeldInventory(Item left, Item right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public InventoryIterator getIterator() {
        return new HandHelInventoryIterator(this);
    }

    public Item getLeft() {
        return left;
    }

    public Item getRight() {
        return right;
    }
}
