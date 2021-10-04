package com.kelaniya.uni.v5.ui;

import org.junit.Assert;
import org.junit.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;


public class CmdLineUITest {

    @Test
    public void should_print_the_message() throws Exception {
        CmdLineUI cmdLineUI = new CmdLineUI();
        String text = tapSystemOut(() -> {
            cmdLineUI.showMessage("Hello!!");
        });

        Assert.assertEquals("Hello!!", text.trim());
    }

}