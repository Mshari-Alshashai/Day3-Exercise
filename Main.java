import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//1.Write a program that checks the role of the user If the role is admin print "welcome admin" If the role is superuser print "welcome superuser" If the role is user print "welcome user" (tip: use if else)
        System.out.println("Enter your Role: ");
        String role = input.nextLine();
        if (role.equalsIgnoreCase("admin")){
            System.out.println("welcome admin");
        } else if (role.equalsIgnoreCase("superuser")) {
            System.out.println("welcome superuser");
        }else if(role.equalsIgnoreCase("user")){
            System.out.println("welcome user");
        }

//2.Take three numbers from the user and print the greatest number.
        System.out.println("Enter the first number:");
        int num1 = input.nextInt();
        System.out.println("Enter the second number:");
        int num2 = input.nextInt();
        System.out.println("Enter the third number:");
        int num3 = input.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("greatest: "+num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("greatest: "+num2);
        } else if (num3>num1 && num3>num2) {
            System.out.println("greatest: "+num3);
        }
        else System.out.println("the numbers are equals");

//3.Write a Java program that generates an integer between 1 and 7 and displays the name of the weekday
        int randomNum = (int)(Math.random()*7)+1;

        switch (randomNum){
            case 1: System.out.println("Sunday");break;
            case 2:
                System.out.println("Monday");break;
            case 3:
                System.out.println("Tusday");break;
            case 4:
                System.out.println("Wednesday");break;
            case 5:
                System.out.println("Thursday");break;
            case 6:
                System.out.println("Friday");break;
            case 7:
                System.out.println("Saturday");break;
            default:
                System.out.println("Error");
        }
//4.Write a program that takes a numeric score as input and prints the corresponding letter grade using the following grading scale: A: 90-100 B: 80-89 C: 70-79 D: 60-69 F: 0-59
        System.out.println("Enter your Score: ");
        int score=input.nextInt();
        if(90<score && score<100) {
            System.out.println("A");
        } else if (80<score && score<90) {
            System.out.println("B");
        } else if (70<score && score<80) {
            System.out.println("C");
        } else if (60<score && score<70) {
            System.out.println("D");
        } else System.out.println("F");

//5.Write a Java program that takes a person's age as input and categorizes them into one of three age categories: "Child," "Teenager," or "Adult" using an if statement.
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        if(age<13){
            System.out.println("You are a child");
        } else if (age>13 && age<19) {
            System.out.println("You are a teenager");
        }else System.out.println("You are an adult");

    }
}