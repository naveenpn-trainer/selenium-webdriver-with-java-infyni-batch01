package org.infyni.hands_on;
abstract class Human {
    abstract void speakingTone();

    public void eyeSight() {
        System.out.println("Eye Sight");
    }
}

class Men extends Human {

    @Override
    void speakingTone() {
        System.out.println("Soft");
    }
}

class Women extends Human {

    @Override
    void speakingTone() {
        System.out.println("Soft");
    }
}
public class _01_AbstractClass {
    public static void main(String[] args) {
        Human human = new Men();
        human.eyeSight();
        human.speakingTone();
    }
}
