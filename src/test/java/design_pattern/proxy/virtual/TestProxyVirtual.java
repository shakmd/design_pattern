package design_pattern.proxy.virtual;

import org.junit.Test;

public class TestProxyVirtual {
    @Test
    public void testBookParser1() {
        //Directly creating book parser is expensive
        IBookParser bookParser = new BookParser("abc");

        //Directly creating proxy book parser is NOT expensive
        IBookParser proxyBookParser = new ProxyBookParser("abc");
    }

    @Test
    public void testBookParser2() {
        //Directly creating book parser is expensive
        //Calling any of its method is NOT expensive
        IBookParser bookParser = new BookParser("abc");
        System.out.println(bookParser.getNumberOfPages());

        //Directly creating proxy book parser is NOT expensive
        //but if any of the methods are called, the actual creation happens(which is costly) and it gets cached
        IBookParser proxyBookParser = new ProxyBookParser("abc");
        System.out.println(proxyBookParser.getNumberOfWords()); //At this point, creation of object takes place
    }

}
