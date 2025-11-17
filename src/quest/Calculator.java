package quest;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();

        while (true) {
            System.out.println("=== Java 계산기 ===");
            System.out.println("=== 계산기 메뉴 ===");
            System.out.println("1. 계산하기");
            System.out.println("2. 계산 이력 보기");
            System.out.println("3. 이력 지우기");
            System.out.println("0. 종료");
            System.out.print("선택: ");
            String menu = scanner.next();

            if(menu.equals("0")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }

            switch(menu) {
                case "1":
                    while (true) {
                        try {
                            System.out.println("첫 번째 숫자를 입력하세요: ");
                            double num1 = scanner.nextDouble();

                            System.out.println("연산자를 입력하세요 (+, -, *, /): ");
                            String operator = scanner.next();

                            System.out.println("두 번째 숫자를 입력하세요: ");
                            double num2 = scanner.nextDouble();

                            double result = 0;
                            boolean valid = true;

                            switch (operator) {
                                case "+":
                                    result = num1 + num2;
                                    break;
                                case "-":
                                    result = num1 - num2;
                                    break;
                                case "*":
                                    result = num1 * num2;
                                    break;
                                case "/":
                                    if (num2 == 0) {
                                        System.out.println("0으로 나눌 수 없습니다.");
                                        valid = false;
                                    } else {
                                        result = num1 / num2;
                                    }
                                    break;
                                case "^":
                                    result = Math.pow(num1, num2);
                                    break;
                                case "sqrt":
                                    if (num1 < 0) {
                                        System.out.println("음수의 사용할 수 없습니다.");
                                        valid = false;
                                    } else {
                                        result = Math.sqrt(num1);
                                    }
                                    break;
                                default:
                                    System.out.println("지원하지 않는 연산자입니다");
                                    valid = false;
                                    break;
                            }
                            if (valid) {
                                System.out.println("결과: " + num1 + operator + num2 + " = " + result);
                                history.add("이전 결과 : " + num1 + operator + num2 + " = " + result);
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("숫자를 입력해주세요.");
                            scanner.nextLine();
                            continue;
                        }

                        System.out.print("계속 계산하시겠습니까? (y/n): ");
                        String again = scanner.next();
                        if (!again.equalsIgnoreCase("y")) {
                            System.out.println("메뉴로 돌아갑니다.");
                            break;
                        }
                    }
                    break;

                case "2":
                    if(history.isEmpty()) {
                        System.out.println("저장 이력 없습니다.");
                    } else {
                        System.out.println("=== 저장 이력 ===");
                        for (String h : history) {
                            System.out.println(h);
                        }
                    }
                    break;
                case "3":
                    history.clear();
                    System.out.println("저장 이력을 삭제했습니다.");
                    break;

                default:
                    System.out.println("없는 메뉴입니다.");
            }
        }
        scanner.close();
    }
}
