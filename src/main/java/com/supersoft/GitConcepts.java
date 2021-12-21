package com.supersoft;

import static com.supersoft.Helper.printDebugInformation;
import static com.supersoft.Helper.printHelp;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GitConcepts{
    public static void main(String[] args) {
        printHelp();
        printDebugInformation();
        
        printDuck();
        printBird();
        printPeacock();
    }

    public static void printDuck(){
        log.info("Duck");
    }

    public static void printPeacock(){
        log.info("Peacock");
    }

    public static void printBird(){
        log.info("Bird");
    }
}
