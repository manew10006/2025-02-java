package ch06.sec10;

public class SamsungTv {

    // static이 붙었기에 공유된다
    public static String brand;
    public String model;
    public int inch;

    public void pirntValues(){
        System.out.printf("%s, %s, %d\n", brand,model,inch);
    }

    public static void staticMethod(){
        // brand는 static이라 객체화가 되어있고 model과 inch는 객체화하지않아서 못씀
        //System.out.printf("%s, %s, %d\n", brand, model, inch);
    }

    // static 메소드는 static 멤버필드, 파라미터만 사용하는 경우에만
    public static void staticMethod(int n1, int n2){
        System.out.printf("%s, %s, %d\n", brand,n1,n2);
    }
}
