package day11_SwitchScanner;

public class Browser_NestedifEX {
    public static void main(String[] args) {


        String browserName = "Chrome";
        String result = "";

        boolean validBrowser = browserName =="Chrome" || browserName =="firefox" || browserName=="Opera" || browserName=="Safari"
                || browserName=="edge";

        if(validBrowser){

            if(browserName== "Chrome"){
                result = "Chrome is the browser";
            }else if(browserName=="firefox"){
                result = "firefox is browser";
            }else if(browserName=="Opera"){
                result="Opera is selected";
            }else if(browserName=="Safari"){
                result= "Safari is selected";
            }else{
                result = "edge is selected";
            }


        }else{
            result = "Invalid Browser Name";



        }
        System.out.println(result);

    }


}
