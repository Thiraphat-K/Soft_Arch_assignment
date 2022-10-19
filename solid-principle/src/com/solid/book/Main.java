package com.solid.book;

import java.util.List;

public class Main {
    public static void main(String[] args){
        BookPublisher bookPublisher = new BookPublisher("Tyland", List.of("I", "moved", "here", "recently", "too"));
        bookPublisher.printToFile();

        BookReader bookReader = new BookReader("Tyland", List.of("I", "moved", "here", "recently", "too"));
        bookReader.printToScreen();
    }
}