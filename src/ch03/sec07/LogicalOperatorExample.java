package ch03.sec07;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        int charCode = 'A';
        System.out.println("charCode: " + charCode);

        if(65 <= charCode && charCode <= 90) { //대문자
            System.out.println("대문자이군요!");
        }

        int value = 6;
        if(value % 2 == 0 || value % 3 == 0){
            System.out.println("2또는 3의 배수군요!");
        }
    }
}
