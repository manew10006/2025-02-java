package ch05.sec05.method;

public class Mission02Method {
    public static void main(String[] args) {
        String ext = getExt("sadf.sdkf.jpg"); // jpg 리턴
        String ext2 = getExt("sad222f.sdkf111.jpeg"); // 리턴


        System.out.println(ext);
        System.out.println(ext2);
    }


    public static String getExt(String ext){
        ext = ext.substring(ext.lastIndexOf(".")+1);
        return ext;
    }
}
