package ch03.sec04;

public class AccuracyExample01 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result = apple - number * pieceUnit;
        System.out.println("사과 1개에서 남은 양: " + result);

        // 정밀한 계산은 실수로 하지 않는다. 자바에서는 실수가 더 넓은 값을 저장할 수 있게되면서 정확도가 떨어졌다.
        // 0.3을 정확히 나오게하는 식은 없다. (올림 반올림 처리를 하던지 해야함)
    }
}
