package oop;

public class StaticTest {
    public static void main(String[] args) {
        StaticId testId = new StaticId();
        StaticId testId1 = new StaticId();
        testId.increaseId().increaseId();
        System.out.println(testId);
        System.out.println(testId1);
    }
}
