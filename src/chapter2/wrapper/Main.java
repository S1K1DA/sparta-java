package chapter2.wrapper;

public class Main {

    public static void main(String[] args) {
        // 기본형 변수
        int a = 1;
        System.out.println("a = " + a);

        // 참조형 변수
        Person personA = new Person();
        System.out.println("personA = " + personA);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("arr = " + arr);

        // 래퍼 클래스(기본형 변수를 감싸고 있는 클래스)
        // 참조형변수입니다.
        Integer num = 100;
        System.out.println("num = " + num); // 내부적으로 처리
        String numStr = num.toString();

        // 직접 만든 래퍼클래스
        CustomInteger myInteger = new CustomInteger(10);
        String myStrInteger = myInteger.toString();

        // 오토박싱 ( 기본형 -> 래퍼)
        Integer num3 = 10;
//      Integer num3 = Integer.valueOf(10);

        // 오토 언박싱 ( 래퍼 -> 기본형)
        int num4 = num3;
//      int num4 = num.intValue();


    }
}
