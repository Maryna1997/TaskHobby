package com.chornobai.maryna;

/**
 * Created by Марина on 21.10.2019.
 */
public class Football extends Hobby {
    private int number;

    public Football(String name, int age, int number) {
        super(name, age);
        this.number = number;
    }

    @Override
    void tellAboutHobby() {
        System.out.println("Hobby{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}' + "Football{" +
                "number=" + number +
                '}');
    }


}
