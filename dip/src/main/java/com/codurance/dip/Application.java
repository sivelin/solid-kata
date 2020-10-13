package com.codurance.dip;

public class Application {

    public static void main(String[] args) {
        IQuoteList list = new FileQuoteList();
        RandomQuoteService randQ = new RandomQuoteService(list);
        System.out.println(randQ.getRandomQuote());
    }
}