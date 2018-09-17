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

    int num0 = 0;
    for (int i = 0; i < myStr.capacity() - 6; i++) {

      if(myStr.substring(i,i +6).equals("Oliver")) {
        System.out.println(myStr.substring(i, i +6));
        num0++;
      }
      else if (myStr.substring(i,i +6).equals("eBooks")) {
        break;
      }
    }
    System.out.println("Number of 'Oliver' in OliverTwist: " + Integer.toString(num0));
  }
}
