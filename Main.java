package methods;

public class Main {

    public static void main(String[] args) {
           calculateScore(true, 1000, 1, 100);

           calculateScore(true, 2000, 2, 100);

           calculateScore(false, 2200, 2, 0);

           int position;

           int one = calcHighScorePosition(1500);
           displayHighCorePosition("Karun", one);
            int two = calcHighScorePosition(900);
            displayHighCorePosition("Alan", two);
            int three = calcHighScorePosition(400);
            displayHighCorePosition("Shruu", three);
            int four = calcHighScorePosition(50);
            displayHighCorePosition("Harshi", four);



    }

    public static int calculateScore(boolean isover, int score, int levelcompleted, int bonus) {
        if (isover) {
            if (levelcompleted == 1) {
                int finals = (score * levelcompleted) + bonus;
                System.out.println("The final score of the contestant is " + finals);
            } else {
                int finals = (score * levelcompleted) + bonus;
                finals = finals + 1000;
                System.out.println("The final score of the contestant is " + finals);
            }
        } else {
            return -1;
        }
        return 0;

    }

    public static void displayHighCorePosition(String name, int position){
        System.out.println(name+" managed to get into position "+ position);

    }

    public static int calcHighScorePosition(int score){
        int position;
        if(score >= 1000){
            position = 1;
        }else if (score>=500){
            position = 2;
        }else if(score>=100 ){
            position = 3;
        }else{
            position = 4;
        }
        System.out.println(position + " is the position of the player on the High Score");

        return position;

    }



}


