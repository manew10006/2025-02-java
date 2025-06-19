package ch15;

import java.util.Arrays;

public class MyArrayList {
    //기존배열
 private String[] arr = new String[0];

 public int size(){
     return arr.length;
 }

 public void add(String item){
     String[] temp = new String[size() + 1];
     temp[size()] = item;
     for(int i=0; i<size(); i++){
         // 기존배열(arr)을 새로운 배열(temp)로 딥 카피
         temp[i] = arr[i];
     }
        // 기존배열에 새로운 배열 주소값 복사
     this.arr = temp;

 }

 public void add(int index, String item){

     // 임시공간만들기
     String[] temp = new String[size()+1];

     temp[index] = item;

     //자료 밀리게 밀어넣기
     for(int i = 0; i<size(); i++){
         temp[i < index ? i : i+1] = arr[i];

     }

     this.arr = temp;

 }

 public String remove(){
    String[] temp = new String[size() - 1];
    String etc = arr[temp.length];

    for(int i = 0; i < temp.length ; i++){
        temp[i] = arr[i];
    }

     this.arr = temp;
     return etc ;

 }


    public String remove(int index){
        String[] temp = new String[size() - 1];
        String etc = arr[index];

        for(int i = 0; i < temp.length ; i++){
                temp[i] = arr[i < index ? i : i+1];
        }

        this.arr = temp;
        return etc ;

    }


 public String get(int index){
     return this.arr[index];
 }



 public void checkValues(){
     System.out.println(Arrays.toString(this.arr));

 }

}
