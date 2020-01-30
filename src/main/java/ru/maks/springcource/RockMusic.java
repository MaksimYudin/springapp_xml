package ru.maks.springcource;

public class RockMusic implements Music {
    private RockMusic instance;

    @Override
    public String getSong() {
        return "Rock music";
    }

    private RockMusic() {}

    public static RockMusic getRockMusic() {
        return new RockMusic();
    }

    public void myInit() {
        System.out.println("in init method");
    }

    public void myDestroy() {
        System.out.println("in destroy method");
    }
}
