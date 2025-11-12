package chapter1.loop;

public class GradeCalculator {

    public static void main(String[] args) {

        // 5개 과목 점수 배열 생성
        int[] scores = {91, 81, 88, 93, 92};

        // 총합
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        // 평균
        double average = (double) total / scores.length;

        // 학점 결정
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // 결과
        System.out.println("=== 성적 계산기 ===");
        System.out.println("총합: " + total + "점");
        System.out.println("평균: " + average + "점");
        System.out.println("학점: " + grade + "등급");
    }
}

