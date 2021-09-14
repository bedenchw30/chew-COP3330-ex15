import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 beden chew
 */
public class exerciseFifteen {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      System.out.println("What is the password? ");
      String password = input.nextLine();

      if(password.equals("abc$123")){
          System.out.println("Welcome!");
      }
      else{
          System.out.println("I don't know you.");
      }
  }

}
