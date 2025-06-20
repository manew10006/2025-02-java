package ch08.sec11.exam02;

public class Taxi implements Vehicle, Trunk {
    @Override
    public void run() {
        System.out.println("택스가 달린다.");
    }

    @Override
    public void stop() {
        System.out.println("택스가 멈춘다");
    }

    @Override
    public void load(String str) {
        System.out.println("짐을 싣는다");
    }
}