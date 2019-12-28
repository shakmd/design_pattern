package design_pattern.proxy.virtual;

public class ProxyBookParser implements IBookParser {
    private BookParser bookParser;
    private String book;

    public ProxyBookParser(String book) {
        this.bookParser = null;
        this.book = book;
    }

    @Override
    public int getNumberOfPages() {
        if (this.bookParser == null) {
            this.bookParser = new BookParser(this.book);
        }
        return this.bookParser.getNumberOfPages();
    }

    @Override
    public int getNumberOfWords() {
        if (this.bookParser == null) {
            this.bookParser = new BookParser(this.book);
        }
        return this.bookParser.getNumberOfWords();
    }
}
