// Pinata.java by Kaitlin Tan
// 09/18/18

import java.util.*;

public class Pinata {

  public static String birthday;
  public static String mood;
  public static String favoriteColor;

  public Pinata() {
    birthday = "May 23"; // almost 4 months ago
    mood = "tired"; // as in I want to go to sleep
    favoriteColor = "blue"; // as in light blue
  }

  public static void main (String[] args) {

    Pinata me = new Pinata (); // call constructor method

    System.out.println ("This is supposed to be about a pinata");
    System.out.println ("My birthday is " + me.birthday);
    System.out.println ("I am feeling " + me.mood);
    System.out.println ("My favorite color is " + me.favoriteColor);

  }
}
