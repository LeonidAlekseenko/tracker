package ru.job4j.elementary.oop;

public class Cat {
    private String name;
    private String food;

    public void show() {
        System.out.println(this.food + " " + this.name);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat sparky = new Cat();
        Cat leo = new Cat();
        leo.eat("Meat");
        leo.giveNick("Cat");
        leo.show();
    }
}
