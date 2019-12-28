package design_pattern.adapter;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Turkey is gobbling");
    }

    @Override
    public void jump() {
        System.out.println("Turkey is flying");
    }
}
