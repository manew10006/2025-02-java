package ch15;

import blackjack.Card;

import java.util.*;

public class ArrayListStudy {
    public static void main(String[] args) {
        // List<String> list = new ArrayList<String>() 도 가능 <> 생략 시 성능저하
        List<String> list = new ArrayList<>(); // 다형성 - 오로지 상속관계만 가능 즉, 상속관계 (List가 부모, ArrayList가 자식이다)
        List<String> list2 = new LinkedList<>();
        //<String> 제네릭(generic) : 제한을 건다, 오로지 String 객체 주소값만 담을 수 있는 컬렉션(생략 시 obj처럼  모든게 담긴다)

        Card card = new Card("","");
        //list.add(card); 안 담긴다

        System.out.println("list.size()" + list.size());  //배열의 크기확인
        list.add("가"); // 0번방에 "가" 주소값
        list.add("나"); // 1번방에 "나" 주소값
        System.out.println("list.size()" + list.size());
        System.out.println("lest.get(0): " + list.get(0));
        System.out.println("lest.get(0): " + list.get(1));

        System.out.println("------------------------------------");

        System.out.println("list2.size()" + list2.size());
        list2.add("가");
        list2.add("나");
        list2.add(1,"다"); //중간삽입도 가능 (나머지 뒤로 밀림)
        System.out.println("list2.size()" + list2.size());
        System.out.println("lest2.get(0): " + list2.get(0));
        System.out.println("lest2.get(1): " + list2.get(1));
        list2.remove(1);  //삭제되고 뒤에게 당겨짐
        System.out.println("lest2.get(1): " + list2.get(1));






    }
}
