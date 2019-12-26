package design_pattern.iterator;

public interface InventoryIterator {
    public boolean hasNext();

    public void next();

    public Item current();
}
