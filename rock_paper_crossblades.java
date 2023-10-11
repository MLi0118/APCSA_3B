import java.util.Locale;
import java.util.Scanner;

public class rock_paper_crossblades {
    public static void main(String[] args) {
        System.out.println("Human, let’s have an epic game of Rock, Paper, Crossblades!");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase(Locale.ROOT);
        int b = a.length();
        int my = (int)(Math.random() *3 +1);
        int user;
        if(a.substring(b - 4, b).equals("rock")){
            user = 1;
        }
        else if(a.substring(b - 5, b).equals("paper")){
            user = 3;
        }
        else if (a.substring(b-11,b).equals("crossblades")){
            user = 2;
        }
        else{
            user=0;
            System.out.println("You have failed to adhere to the ancient traditions of Rock, Paper, Crossblades! You have lost by disqualification! Disgraceful!");
        }
        if(a.length()<50){
            if(user==3){
                my = 2;
            }
            else if (user == 1){
                my = 3;
            }
            else if (user == 2){
                my = 1;
            }
        }
        if(user ==0){
            System.out.println(" ");
        }
        else if(my == 1){//rock
            System.out.println("Does he know my strategy? Two stones in a row... what are the chances? Did he steal my notes? Did he follow me into the archives? No, stay the course: ROCK!");
        }
        else if(my == 2){ // crossblades
            System.out.println("Pathetic. You cannot hope to beat me without the passion of a thousand suns, without the dedication of a Pleistocene glacier! I choose CROSSBLADES!");
        }
        else{// paper my=3
            System.out.println("The tension mounts as two mighty minds clash! With nerves of steel, the choice is made..It's PAPER!");
        }
        if(user == my){
            System.out.println("tied");
        }
        else if(user == 3 && my == 2){
            System.out.println("I winned!");
        }
        else if(user == 1 && my == 3){
            System.out.println("I winned");
        }
        else if(user == 2 && my == 1){
            System.out.println("I winned");
        }
        else if(user ==0){
            System.out.println("I winned");
        }
        else{
            System.out.println("You winned");
        }
    }
}