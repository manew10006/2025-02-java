package ch07.sec02;

public class SmartPhone extends Phone{
    private boolean wifi;

    public SmartPhone(String model, String color){
        super(model,color); //phone에 기본생성자가 없기에 파라미터가 필요하다
        System.out.println("SmartPhone 생성자 호출!!");
    }

    public void setWifi(boolean wifi){
        this.wifi = wifi;
    }

    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }


    public void bell(){  // 오버라이딩
        System.out.println("스마트폰이 울린다!!!");
    }

}










