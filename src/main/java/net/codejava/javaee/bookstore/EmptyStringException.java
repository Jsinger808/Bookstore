package net.codejava.javaee.bookstore;

import java.io.IOException;

public class EmptyStringException extends IOException {

    EmptyStringException(){
        super("You have entered a blank entry");
    }
}
