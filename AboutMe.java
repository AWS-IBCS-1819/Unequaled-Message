// AboutMe.java by Kaitlin Tan
// 9/10/18

import java.util.*;

public class AboutMe{

    public static String lefthandedOrRighthanded;
    public static String lettersInFullName; // first and last
    public static String height; // in centimeters
    public String favoriteClass;
    public static String bestPlaceTraveledTo;
    public static String hobbies;
    public String favoriteFood; //seasonal


    public AboutMe() {
      lefthandedOrRighthanded = "righthanded";
      lettersInFullName = "9";
      height = "160";
      favoriteClass = "bio";
      bestPlaceTraveledTo = "Osaka";
      hobbies = "swimming, playing video games, excersise";
      favoriteFood = "aubergine, in summer";
    }

public static void main(String[] args) {

  AboutMe vivian = new AboutMe(); // call constructor method
  System.out.println("Introducing Vivian");
  System.out.println ("Vivian is " + vivian.lefthandedOrRighthanded);
  System.out.println ("Vivan has " + vivian.lettersInFullName);
  System.out.println ("Vivian is " + vivian.height);
  System.out.println ("Vivian's favorite " + vivian.favoriteClass);
  System.out.println ("Vivian thinks " + vivian.bestPlaceTraveledTo);
  System.out.println ("Vivian's " + vivian.hobbies);
  System.out.println ("Vivian's favorite " + vivian.favoriteFood);


  Scanner favoriteClassInp = new Scanner (System.in); // scanner for mutable
    String favoriteClassIn = favoriteClassInp.next();
    if (favoriteClassIn.equals("a")){
      System.out.println(vivian.favoriteClass);
    }
    else if(favoriteClassIn.equals("b")){
      System.out.println("Math because it has numbers");
    }
  Scanner favoriteFoodInp = new Scanner (System.in); // scanner for mutable
    String favoriteFoodIn = favoriteFoodInp.next();
    if (favoriteFoodIn.equals ("a")){
      System.out.println(vivian.favoriteFood);
    }
    else if(favoriteFoodIn.equals("b")){
      System.out.println("Cow intestines");
    }
  }
}
