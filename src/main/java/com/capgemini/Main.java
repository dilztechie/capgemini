package com.capgemini;

import java.util.logging.Logger;

public class Main {
    static final Logger logger = Logger.getLogger(Main.class.getName());

    static int count;

    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        logger.log(java.util.logging.Level.INFO, "Hello and welcome!");

        boolean flag = true;
        while (flag) {
            logger.info("Count is: " + getCount());
            if (count > 5) flag = false;
        }
    }

    static int getCount() { return count++; }
}