package com.chornobai.maryna;

/**
 * Created by Марина on 21.10.2019.
 */
public abstract class Hobby {
    public String name;
    public int age;
    abstract void tellAboutHobby();

    public Hobby(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public Hobby() {
        super();
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
