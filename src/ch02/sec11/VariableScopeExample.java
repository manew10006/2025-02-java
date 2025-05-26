package ch02.sec11;

public class VariableScopeExample {
    public static void main(String[] args) {
        int v1 = 15;
        if(v1 > 10) {
            int v2 = v1 - 10;
        }
// v2가 중괄호 범위가 달라지면서 컴파일에러!
//        int v3 = v1 + v2 + 5;

    }
}
