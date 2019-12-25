package design_pattern.template_method;

public abstract class Record {
    //This is the actual method that has placeholders + actual common logic
    //The placeholders should be implemented by classes extending this class
    public void save() {
        this.validate();
        this.beforeSave();

        //some actual common logic
        System.out.println("doing some common logic");
        //common logic completed

        this.afterSave();
    }

    public abstract void validate();

    public abstract void beforeSave();

    public abstract void afterSave();
}
