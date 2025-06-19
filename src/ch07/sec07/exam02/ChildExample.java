package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.method1();
        child.method2();
        child.method3();


        System.out.println("------------------");
        Parent parent = child;

        //타입을 알고 있는 메소드만 호출할 수 있다.
        parent.method1();
        parent.method2();
        // parent.method3();  호출할 수 없다
        // 하지만 method3()메소드를 호출하고 싶다면 해당 메소드가 있는 타입으로 강제형변환을해야한다
        Child child2 = (Child)parent;
        child2.method3();
    }
}
