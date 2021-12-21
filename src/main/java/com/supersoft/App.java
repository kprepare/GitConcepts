package com.supersoft;

import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 */
@Slf4j
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        log.info("Hello World!");
    }
}
