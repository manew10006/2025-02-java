package ch08.sec11.exam02;

// 운송수단
public interface Vehicle {
    /*
인터페이스는 인스턴스 멤버필드를 가질 수 없다 (nonstatic을 가질 수 없다)

static final 멤버필드는 가질 수 있다.

무조건 추상메소드만 가질 수 있다.
public abstract 가 자동으로 생성되있어서 생략가능

     */
     void run();
     void stop();

}
