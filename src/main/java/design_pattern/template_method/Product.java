package design_pattern.template_method;

public class Product extends Record {
    @Override
    public void validate() {
        System.out.println("custom validation for product");
    }

    @Override
    public void beforeSave() {
        System.out.println("custom before save logic for product");
    }

    @Override
    public void afterSave() {
        System.out.println("custom after save logic for product");
    }
}
