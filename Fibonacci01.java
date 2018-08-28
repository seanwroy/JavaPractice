// Program: Prime numbers using Functions

import java.util.Scanner;

public class Fibonacci01 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("How many Fibonacci values to generate:");
    int count = input.nextInt();
    
    printFibonacciValues(count);
    
    input.close();
  }
  public static void printFibonacciValues(int count){
    for(int i = 1; i <= count; i++)
      System.out.print(getFibonacciValueAt(i) + " ");
      
  }
  public static int getFibonacciValueAt(int p){
    switch(p) {
    case 1: 
      return 1;
    case 2:
      return 1;
    default:
      return getFibonacciValueAt(p-1) + getFibonacciValueAt(p-2);
    }
  }
}