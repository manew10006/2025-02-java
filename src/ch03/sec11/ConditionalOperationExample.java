package ch03.sec11;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 85;
        char grade = score > 90 ? 'A' : score > 80 ? 'B' : 'C';

        //아래와 같은 표현 if문안에 if문 쓴 것!
        char grade2;
        if(score > 90){ grade2 = 'A';
        }else{ if (score > 80){grade2 = 'B';} else { grade2 = 'C';}
        }


        System.out.println("grade: " + grade);
        System.out.println("grade2: " + grade2);

    }
}
