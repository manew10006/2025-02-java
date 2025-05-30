package ch05.sec05;

public class Mission02 {
    public static void main(String[] args) {
        String fileName = "가나다라.haha.jpg";

        String ext = fileName.substring(fileName.lastIndexOf(".")+1);
        System.out.println(ext);
    }
}
