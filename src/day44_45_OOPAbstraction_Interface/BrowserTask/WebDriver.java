package day44_45_OOPAbstraction_Interface.BrowserTask;

public interface WebDriver extends SearchContext {


    void get(String url);
    void close();
    void quit();
    void getTitle();
}
