package org.example;
import java.util.Scanner;
public class Fact {
        public static int factorial(int n){
            if (n == 0)
                return 1;
            else
                return(n * factorial(n-1));
        }
        public static void main(String args[]){
            Scanner myObj = new Scanner(System.in);
            System.out.println("Number: ");
            int num=myObj.nextInt();
            System.out.println(factorial(num));
        }

}