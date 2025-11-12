package chapter1.operator;

public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // 기본적인 사칙연산
        int sum = a + b;
        System.out.println("sum = " + sum);

        int sub = a - b;
        System.out.println("sub = " + sub);

        int mul = a * b;
        System.out.println("mul = " + mul);

        // 나눗셈
        // 10 / 3
        int div = a / b;
        System.out.println("div = "  + div);

        // 모듈러 연산자(나머지 연산) => %
        int mod = 10 % 3;
        System.out.println("mod = " + mod);

        // 대입 연산자
        int num = 5;
        // 복합 대입 연산자
        num += 3; // num = num + 3;
        System.out.println("num = " + num);
        num -= 2;
        System.out.println("num = " + num);
        num *= 2;
        System.out.println("num = " + num);
        num /= 2;
        System.out.println("num = " + num);
        num %= 2;
        System.out.println("num = " + num);

        // 증감 연산자
        num = 1;
        num++;
        num++;
        num--;
        System.out.println("num = " + num);

        // 전위 연산(++i) - 연산 후 값이 활용됩니다.
        int intBox = 5;
        System.out.println("(++intBox) = " + (++intBox));

        // 후위 연산(i++)
        int intBox2 = 5;
        System.out.println("(intBox2++) = " + (intBox2++));
        System.out.println("intBox2 = " + intBox2);


        // 비교연산자
        // 같음연산자(=) 같으면 true, 다르면 false
        System.out.println("10 == 10 : " + (10 == 10));

        // 다름 연산자(!=)
        System.out.println("10 != 5 : " + (10 != 5));

        // 크기비교연산자
        System.out.println("10 < 5 : " + (10 < 5)); //false
        System.out.println("10 >= 10 : " + (10 >= 10)); //true
        System.out.println("10 <= 5 : " + (10 <= 5)); //false

        // 논리연산자
        // AND 연산(&&) - 두 조건이 모두 참일때 true 반환합니다.
        System.out.println("true && true : " + (true && true)); // true
        int age = 20;
        boolean isStudent = true;
        System.out.println(":::" + ((age>18) && isStudent));


        // OR 연산(||) - 두 조건중 하나라도 참이라면 true를 반환
        System.out.println("false || true : " + (false || true)); // true

        // NOT 연산자(!) = true -> false , false -> true
        System.out.println("!true : " + (!true));


        // 연산자 우선순위
        boolean flag = ((10 + 5) > 12) && true;
        System.out.println(flag);
        // 실행 순서: (10 + 5) > 12 && true : 산술
        // → 15 > 12 && true : 비교
        // → true && true : 논리
        // → flag = true 대입

        // 논리 연산자 우선순위(! -> && -> ||)
        boolean result = true || (false && false);
        System.out.println("result = " + result);

        boolean result2 = true || (false && (!false));
        System.out.println("result2 = " + result2);

        // 문자열 비교(.equals)
        String text = "Hello";
        String text2 = "Hello";
        // 나쁜예 : (text = text2)
        boolean isEqual = text.equals(text2);
        System.out.println("isEqual : " + isEqual);

    }
}
