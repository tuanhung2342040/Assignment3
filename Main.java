import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your current earth weight: ");
        int weight = scan.nextInt();
        System.out.println("I have information for the following planets:");
        System.out.println("\t1.Venus\t\t2.Mars\t\t3.Jupiter\n\t4.Saturn\t5.Uranus\t6.Neptune");
        System.out.println("which planet are you visiting");
        int planet = scan.nextInt();
        if(planet == 1) {
            System.out.println("Your weight would be " + (weight * 0.78) + " pounds on that planet");
        }
        else if (planet == 2){
            System.out.println("Your weight would be " + (weight*0.39) + " pounds on that planet");
        }
        else if (planet == 3){
            System.out.println("Your weight would be " + (weight*2.65) + " pounds on that planet");
        }
        else if (planet == 4){
            System.out.println("Your weight would be " + (weight*1.17) + " pounds  that planet");
        }
        else if (planet == 5){
            System.out.println("Your weight would be " + (weight*1.05) + " pounds on that planet");
        }
        else{
            System.out.println("Your weight would be " + (weight*1.23) + " pounds on that planet");
        }
    }
}
