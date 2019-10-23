package com.chornobai.maryna;

/**
 * Created by Марина on 21.10.2019.
 */
public class Running extends Hobby {
    private int distance;

    public Running(String name, int age, int distance) {
        super(name, age);
        this.distance = distance;
    }

    @Override
    void tellAboutHobby() {
        System.out.println("Hobby{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}' + "Running{" +
                "distance=" + distance +
                '}');
    }

}
