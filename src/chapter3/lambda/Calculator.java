package chapter3.lambda;

@FunctionalInterface // 람다를 사용할때 함수형 인터페이스를 권장
public interface Calculator {

    int sum(int a, int b); // 오직 하나의 추상 메서드만 선언

}
