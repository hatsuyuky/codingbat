package com.company;

public class Main {

  public static void main(String[] args) {
    // write your code here

    String str = "redxx";
    System.out.println(seeColor(str));
  }

  /*Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
  seeColor("redxx") → "red"
  seeColor("xxred") → ""
  seeColor("blueTimes") → "blue"
  * */

  static String seeColor(String str) {
      String red="red";
      String blue="blue";

      if(str.length()>=3 && str.substring(0,3).equals(red))
          return "red";
      if(str.length()>=4&&str.substring(0,4).equals(blue))
          return "blue";
      return str;
  }
  /*Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited"*/
   static boolean frontAgain(String str){
 if(str.length()<2)
     return false;
 return str.substring(0,2).equals(str.substring(str.length()-2));

    }
}
