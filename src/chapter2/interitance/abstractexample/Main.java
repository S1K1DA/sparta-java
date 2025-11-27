package chapter2.interitance.abstractexample;

public class Main {

    public static void main(String[] args) {



        // 추상클래스는 인스턴스화 할수 없습니다.
//        Animal animal = new Animal();

        Cat cat=new Cat();
        cat.name = "고양이";
        cat.sleep();

        // 자식에서 강제로 구현한 메서드
        cat.eat();
    }
}
