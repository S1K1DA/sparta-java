package chapter2.capsulation.v2;

public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot ();

          // 무분별한 세터 예시
//        robot.setLeftLeg(true);
//        robot.setRightLeg(true);
//        robot.setLeftLeg(true);
//        robot.setRightLeg(true);


        // 의미있는 세터
        robot.walk(true);
    }
}
