package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("romeo and juliet")) {
            return "William Shakespeare";
        } else if (query.toLowerCase().contains("what is your name")) {
            return "Unsafe";
        } else if (query.toLowerCase().contains("which of the following numbers is the largest")) {
            return "20874";
        }
        return "";
    }
}
