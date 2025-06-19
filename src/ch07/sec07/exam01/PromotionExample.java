package ch07.sec07.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        // 부모타입은 자식객체 주소값 담을 수 있다. 자손은 안됨 (다형성)
        A a1 = b;

        A a2 = e;  // A a2 = (A)e  자동형변환일어남

        E e2 = (E)a2; // a2에 E의 주소값을 가지고있기때문에 E의 강제형변환이 먹히는 것
        // D d2 = e;  컴파일 에러!

        //D d3 = (D)b;  런타임 에러!  자식타입은 부모객체주소값 담을 수 없다

    }
}

class A { }
class B extends A { }
class C extends A { }

class D extends B { }
class E extends C { }

