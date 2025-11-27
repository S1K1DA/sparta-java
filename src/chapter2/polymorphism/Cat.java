package chapter2.polymorphism;

public class Cat implements Animal {

    @Override
    public void MakeSound() {
        System.out.println("야오옹");
    }

    @Override
    public void exist() {
        System.out.println("고양이가 존재합니다.");
    }

    public void scratch() {
        System.out.println("스크래치!");
    }
}
