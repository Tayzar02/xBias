package com.xbias;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws Exception
  {
    Scanner s = new Scanner(System.in);
    System.out.println("What are you searching for?: ");
    String prompt = s.nextLine();
    siteSelector search = new siteSelector();

      search.fox(prompt);
      search.cnn(prompt);
      search.reuters(prompt);
      search.npr(prompt);
      search.nyt(prompt);
      search.et(prompt);
  } 
}