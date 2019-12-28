package design_pattern.proxy.virtual;

public class BookParser implements IBookParser {
    private String book;

    public BookParser(String book) {
        System.out.println("Time expensive operation...");
        this.book = book;
    }

    @Override
    public int getNumberOfPages() {
        return 5;
    }

    @Override
    public int getNumberOfWords() {
        return 127;
    }
}
