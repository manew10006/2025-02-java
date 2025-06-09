package ch02.sec11;

public class ScoreMethodExample {
    public static void main(String[] args) {
        int randomScore = getRandomValue(10, 100); //10~100
        int randomScore2 = getRandomValue(1, 5); //1~5

        System.out.println("score1: " + randomScore);
        System.out.println("score2: " + randomScore2);

//        randomScore = 100;

        char grade = getGrade(randomScore);
        //100점 초과 시 혹은 0점 미만 시 ' ' 리턴
        // 90점 이상 'A'리턴
        // 80점 이상 'B'리턴
        // 70점 이상 'C'리턴
        // 나머지 'D'리턴
        System.out.print(grade);

    }
    public static int getRandomValue(int from, int to){
        return (int)(Math.random()*(to-from+1) + from);
    }

    public static char getGrade(int score){
        char grade = 'D';
        if (score < 0 || score > 100 ){
            grade = ' ';
        } else if( 90 < score){
            grade = 'A';
        } else if( 80 < score){
            grade = 'B';
        } else if( 70 < score){
            grade = 'C';
        }

        return grade;
    }

    public static char getGradeSwitchVer(int score){
        char grade = 'D';
        if (score < 0 || score > 100 ){
            return  ' ';
        }
        // 표현식 (값으로 식을 적는 것)
        return switch (score / 10) {    case 10, 9 -> 'A';   case 8 -> 'B';      case 7 -> 'C';       default -> 'D';       };

    }
}

