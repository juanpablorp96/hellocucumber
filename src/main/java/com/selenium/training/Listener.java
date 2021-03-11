package com.selenium.training;


import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;

public class Listener extends RunListener {

    @Override
    public void testStarted(Description description) throws Exception {
        System.out.println("Test started");
    }

    @Override
    public void testFinished(Description description) throws Exception {
        System.out.println("Test finished");
    }

}
