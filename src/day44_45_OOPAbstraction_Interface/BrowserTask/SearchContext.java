package day44_45_OOPAbstraction_Interface.BrowserTask;
/*1. Create an interface named SearchContext
				Abstract methods:
					findElement(String locator);
					findElements(String locator);*/
public interface SearchContext {

    void findElement(String locator);

    void findElements(String locator);


}
