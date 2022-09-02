package ru.job4j.elementary.oop;

public class Error {
    private  boolean active;
    private  int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

public static void main(String[]args) {
        Error error = new Error();
        error.printInfo();
        Error error300 = new Error(true, 300, "Error work");
        Error error200 = new Error(true, 200, "Error work");
        Error error100 = new Error(true, 100, "Error work");
        error300.printInfo();
        error200.printInfo();
        error100.printInfo();
        }
}
