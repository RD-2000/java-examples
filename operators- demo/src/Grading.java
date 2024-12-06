import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

        System.out.println("enter score");
        int score=Integer.parseInt(scanner.nextLine());
        int passingscore=60;

        if(score<passingscore){
            System.out.println("the score is below the passing grade");
        }
        else
        {
            System.out.println(" the score meets the passing grade");
        }





    }

    }

