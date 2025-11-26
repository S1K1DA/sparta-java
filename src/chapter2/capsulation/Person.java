package chapter2.capsulation;

public class Person {

    //속성
    private String name;
    private String secret;
    private int age;
    private String email;
    private double balance;  // 잔액

    // 생성자
    public Person(String name) {
        this.name = name;
    }

    // 기능
    public void methodA() {
    }
    public void methodB() {
    }

    // 게터
    public String getName() {
        return name;
    }

    // ❌ 무분별한 세터 - 아무 검증 없이 값을 그대로 저장
    public void setName(String name) {
        this.name = name;  // 빈 문자열("")이나 null도 그냥 저장됨!
    }

    // ❌ 무분별한 세터 - 나이에 음수도 들어갈 수 있음
    public void setAge(int age) {
        this.age = age;  // -100살도 가능?!
    }

    // ✅ 의미있는 세터 - 유효성 검증을 추가!
    public void setAgeWithValidation(int age) {
        if (age < 0) {
            System.out.println("❌ 나이는 음수일 수 없습니다!");
            return;  // 잘못된 값은 저장하지 않음
        }
        if (age > 150) {
            System.out.println("❌ 나이가 너무 많습니다!");
            return;
        }
        this.age = age;  // 유효한 값만 저장
        System.out.println("✅ 나이가 " + age + "세로 설정되었습니다.");
    }

    // ✅ 의미있는 세터 - 이메일 형식 검증
    public void setEmail(String email) {
        if (email == null || email.isEmpty()) {
            System.out.println("❌ 이메일이 비어있습니다!");
            return;
        }
        if (!email.contains("@")) {
            System.out.println("❌ 올바른 이메일 형식이 아닙니다! (@가 없음)");
            return;
        }
        this.email = email;
        System.out.println("✅ 이메일이 설정되었습니다: " + email);
    }

    // ✅ 의미있는 세터 - 비즈니스 로직 포함 (돈을 입금)
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("❌ 입금액은 0보다 커야 합니다!");
            return;
        }
        this.balance += amount;  // 단순 대입이 아니라 더하기!
        System.out.println("✅ " + amount + "원 입금 완료! 현재 잔액: " + this.balance + "원");
    }

    // ✅ 의미있는 세터 - 비즈니스 로직 포함 (돈을 출금)
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("❌ 출금액은 0보다 커야 합니다!");
            return;
        }
        if (this.balance < amount) {
            System.out.println("❌ 잔액이 부족합니다! (현재 잔액: " + this.balance + "원)");
            return;
        }
        this.balance -= amount;
        System.out.println("✅ " + amount + "원 출금 완료! 현재 잔액: " + this.balance + "원");
    }

    // 게터들
    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public double getBalance() {
        return balance;
    }
}
