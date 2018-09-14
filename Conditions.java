// Conditions.java by Kaitlin Tan
// 09/14/18

import java.util.*;
import java.io.*; //useful for reading files

public class Conditions {

  public static void main(String[] args) {

    StringBuilder myStr = new StringBuilder();

    try {

      File randtxt = new File("OliverTwist.txt");
      Scanner sc = new Scanner (randtxt);

      while (sc.hasNext()){
      myStr.append(sc.next());
      }
    }
    catch (FileNotFoundException e){
      e.printStackTrace();
    }

    System.out.println(myStr);
  }
}
