package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int steps = Integer.parseInt(input);
        int newSteps = 0;
        while(true){
            newSteps += steps;
            if (newSteps >= 10000){
                System.out.printf("Goal reached! Good job! %n");
                System.out.printf("%d steps over the goal!", newSteps - 10000);
                break;
            }
            input = scan.nextLine();
            if (input.equals("Going home")){
                break;
            }
            steps = Integer.parseInt(input);

        }
        input = scan.nextLine();
        steps = Integer.parseInt(input);
        newSteps += steps;
        if (newSteps >= 10000){
            System.out.printf("Goal reached! Good job! %n");
            System.out.printf("%d steps over the goal!", newSteps - 10000);
        }else{
            System.out.printf("%d more steps to reach goal.", 10000 - newSteps);
        }
    }
}
