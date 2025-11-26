package chapter2.capsulation;

public class Main {
    public static void main(String[] args) {

        // 생성자 호출
        Person person = new Person("siki");

        // 인스턴스 변수 접근
//        person.name = "siki";
//        person.secret = "??";

        // 인스턴스 메서드 접근
//        person.methodA();
//        person.methodB();


        // 게터
        String name = person.getName();
        System.out.println("이름 : " + name);

        // 세터
        person.setName("Eunsik");
        String name2 = person.getName();
        System.out.println("이름 : " + name2);

        System.out.println("\n=== 무분별한 Setter 테스트 ===");
        person.setAge(-5);  // 음수 나이가 들어감!
        System.out.println("설정된 나이: " + person.getAge());  // -5 출력됨 (이상한 값!)

        person.setAge(200);  // 200살도 들어감!
        System.out.println("설정된 나이: " + person.getAge());  // 200 출력됨 (이상한 값!)

        System.out.println("\n=== 의미있는 Setter 테스트 ===");
        person.setAgeWithValidation(-5);   // 검증에서 막힘!
        person.setAgeWithValidation(200);  // 검증에서 막힘!
        person.setAgeWithValidation(25);   // 정상 작동!
        System.out.println("실제 저장된 나이: " + person.getAge());

        System.out.println("\n=== 이메일 검증 테스트 ===");
        person.setEmail("잘못된이메일");      // @가 없어서 막힘
        person.setEmail("siki@naver.com");  // 정상 작동!

        System.out.println("\n=== 은행 계좌 테스트 (비즈니스 로직) ===");
        person.deposit(10000);   // 1만원 입금
        person.deposit(5000);    // 5천원 입금
        person.withdraw(3000);   // 3천원 출금
        person.withdraw(20000);  // 잔액 부족으로 실패!
        person.withdraw(-1000);  // 음수 출금 시도 - 실패!

        System.out.println("\n최종 잔액: " + person.getBalance() + "원");

    }
}
