package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int goal = 10000;

        int steps = 0;
        while(goal > steps){
            String input = scan.nextLine();
            if (input.equals("Going home")){
                steps += scan.nextInt();
                break;
            }
            steps += Integer.parseInt(input);


        }
        if (steps >= goal){
            System.out.printf("Goal reached! Good job! %n");
            System.out.printf("%d steps over the goal!", steps - goal);
        } else{
            System.out.printf("%d more steps to reach goal.", 10000 - steps);
        }
    }
}
