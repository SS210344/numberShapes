package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = "";
        System.out.println("what is your number:");
        int userNumber = input.nextInt();



        for(int i =1; i < userNumber+1; i++){

            String number = String.valueOf (i);
            line = line + number;
            System.out.println(line);


        }
        for(int i =userNumber; i != 0 ; i--){
            line = "";
            for(int j = 1; j != 2*i-1; j++){
                String number = String.valueOf (j);
                line = line + number;
            }
            System.out.println(line);

        }
    }
}
