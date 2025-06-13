package ch06.sec11;

public class FinalObject {
    // 지역변수일때 초기화안해도되지만, 멤버필드일때 초기화해야한다 static도 넣어주면 활용도 굳
    private final String NAME = "홍길동";

    //그러나 생성자로 값을 넣는다는 내용이 있을 경우 선언만 가능하다.
    private final int AGE;

    public FinalObject(int age){
        this.AGE = age;
    }

    public void myAge(){
        System.out.println("age: " + this.AGE);
    }
}
