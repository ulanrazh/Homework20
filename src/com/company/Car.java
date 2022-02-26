package com.company;

public class Car implements AutoCloseable{

    public void drive() {
        System.out.println("Машина журуп жатат");
    }

    @Override
    public void close() throws RuntimeException {
        System.out.println("Машина жабылып жатат");

    }
}
