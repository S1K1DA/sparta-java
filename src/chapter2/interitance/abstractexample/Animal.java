package chapter2.interitance.abstractexample;

// 추상 클래스 선언
abstract class Animal {

    public String name;

    abstract  void eat();

    public void sleep() {
        System.out.println("쿨쿨..");
    }
}
