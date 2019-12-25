package design_pattern.template_method;

public class User extends Record {
    @Override
    public void validate() {
        System.out.println("custom validation for user");
    }

    @Override
    public void beforeSave() {
        System.out.println("custom before save logic for user");
    }

    @Override
    public void afterSave() {
        System.out.println("custom after save logic for user");
    }
}
