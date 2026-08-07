package com.capgemini;

import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static final Logger logger = Logger.getLogger(Main.class.getName());

    static int count;

    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        logger.log(java.util.logging.Level.INFO, "Hello and welcome!");

        boolean flag = true;
        while (flag) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
                    // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
                    logger.info("Count is: " + getCount());
                    if (count > 5) flag = false;
        }
    }

    static int getCount() { return count++; }
}
