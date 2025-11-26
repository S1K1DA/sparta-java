package chapter2.capsulation.v2;

public class Robot {
    private boolean leftLeg;
    private boolean rightLeg;

    private boolean leftArm;
    private boolean rightArm;

    // .................
    // 무분별한 세터 남발
//    public void setLeftLeg(boolean leftLeg) {
//        LeftLeg = leftLeg;
//    }
//    public void setRightLeg(boolean rightLeg) {
//        RightLeg = rightLeg;
//    }
//    public void setLeftArm(boolean leftArm) {
//        LeftArm = leftArm;
//    }
//    public void setRightArm(boolean rightArm) {
//        RightArm = rightArm;
//    }

    // ...................

    // 의미있는세터
    public void walk(boolean power) {
        this.leftLeg = power;
        this.rightLeg = power;
        this.leftArm = power;
        this.rightArm = power;
    }
}
