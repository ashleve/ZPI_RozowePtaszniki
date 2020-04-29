package app.util;


public class Paths {

    public static class Web {
        public static final String START_PAGE = "/";
        public final static String HELLO = "/hello";
        public static final String PRODUCTS = "/products";
        public static final String CALCULATE = "/calculate/:product/:cost/:category/:final_cost";
    }

    public static class Template {
        public final static String INDEX = "/public/html/index.html";
    }

}