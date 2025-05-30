package ch05.sec04;

public class GarbageObjectExample {
    public static void main(String[] args) {
        String hobby = "여행"; //String 객체의 주소값이 hobby 변수에 대입
        hobby = null;  // 여행문자열을 가지고있는 String 객체는 낙동강 오리알 신세

        String kind1 = "자동차";
        String kind2 = kind1;
        kind1 = null; // 여기서는 자동차 문자열 주소값을 아직 유지하고있기때문에 GC가 작동하지않는다

    }
}
