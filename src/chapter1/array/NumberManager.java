package chapter1.array;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberManager {

    public static void main(String[] args) {

        int[] numbers = {11, 55, 85, 58, 43, 72, 89, 67, 96, 29};

        // 최대, 최소
        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            sum += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        // 평균
        double average = (double) sum / numbers.length;

        // 짝수 저장
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }

        System.out.println("=== 숫자 관리 프로그램 ===");
        System.out.println("전체 숫자: " + Arrays.toString(numbers));
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
        System.out.println("평균값: " + average);
        System.out.println("짝수 목록: " + evenNumbers);
    }
}
