package com.jgmonteiro;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@QuarkusMain
public class Main {

    public static void main(String ... args) {
        System.out.println("Running main method");
        Quarkus.run(args);
    }
}