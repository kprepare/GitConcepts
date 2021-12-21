package com.supersoft;

import static org.apache.commons.lang3.StringUtils.isBlank;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BookPrinter {
    public static void main(String[] args) {
        printBooks();
    }
    public static void printBooks() {
        log.info("Printing books......");
        log.info("Is the book name blank? " + isBlank("BookName"));
    }
}