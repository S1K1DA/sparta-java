package chapter1.condition;

import java.util.Scanner;

public class HungerEun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("현재 배고픔 퍼센트를 입력하세요 (0~100): ");
        int hunger = sc.nextInt();

        // 유효성 검사
        if (hunger < 0 || hunger > 100) {
            System.out.println("0~100 사이의 숫자만 입력하세요.");
        } else if (hunger >= 80) {
            System.out.println("너무 배고픔! 야식 시켜 먹어야 함! 배고픔 = " + hunger + "%");
        } else if (hunger >= 50) {
            System.out.println("배고픔! 간단하게 뭐라도 먹자! 배고픔 = " + hunger + "%");
        } else if (hunger >= 20) {
            System.out.println("애매함! 물 마시고 이따 먹자! 배고픔 = " + hunger + "%");
        } else {
            System.out.println("지금은 안 땡김! 배고픔 = " + hunger + "%");
        }
        sc.close();
    }


    /*
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("현재 배고픔 퍼센트를 입력하세요 (0~100): ");
        int hunger = sc.nextInt();

        // 유효성 검사
        if (hunger < 0 || hunger > 100) {
            System.out.println("0~100 사이의 숫자만 입력하세요.");
            return;
        }

        int group;
        if (hunger >= 80) {
            group = 1;
        } else if (hunger >= 50) {
            group = 2;
        } else if (hunger >= 20) {
            group = 3;
        } else {
            group = 4;
        }

        switch (group) {
            case 1:
                System.out.println("너무 배고픔! 야식 시켜 먹어야 함! 배고픔 = " + hunger + "%");
                break;
            case 2:
                System.out.println("배고픔! 간단하게 뭐라도 먹자! 배고픔 = " + hunger + "%");
                break;
            case 3:
                System.out.println("애매함! 물 마시고 이따 먹자! 배고픔 = " + hunger + "%");
                break;
            case 4:
                System.out.println("지금은 안 땡김! 배고픔 = " + hunger + "%");
                break;
            default:
                System.out.println("알 수 없는 오류가 발생했습니다.");
        }
        sc.close();
    }
    */
}
