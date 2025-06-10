package ch06.sec04;

public class Student {
    String name;

    //기본생성자 (생략가능)
    public Student() {  System.out.print("기본생성자 호출!"); }

    //메소드
    void introduce() {
        int num;
        System.out.printf("안녕 내 이름은 %s이라고 해 \n", this.name);
    }
}
