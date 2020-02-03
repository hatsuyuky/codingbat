package com.company;

public class Main {

  public static void main(String[] args) {
    // write your code here

    String str = "redxx";
    //  System.out.println(seeColor(str));
    System.out.println(str.substring(str.length()-2,str.length()));

    //forLoog();
int [] num={1,2,3,5};
  }

  private static void forLoog() {
    int s;
    for (s = 5; s > 0; --s) {
      System.out.println(s);
      //      if(s<3)
      //          break;
      //      }
    }
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
/*

Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
The string may be any length. If there are fewer than 2 chars, use whatever is there.
extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"
* */
  public static String extraFront(String str){
    String result="";

    if(str.length()<2)
        result=str;
   else{
       result=str.substring(0,2);
    }
   return result+result+result;
  }
/*Given a string, if a length 2 substring appears at both its beginning and end,
return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
 The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
* without2("HelloHe") → "lloHe"
without2("HelloHi") → "HelloHi"
without2("Hi") → ""

*/
public static String withOuth2(String str){
    String front="";
    String back="";
    if(str.length()<2)
        return "";
    front=str.substring(0,2);
    back=str.substring(str.length()-2);
    if (front.equals(back))
        return str.substring(2);
    else
        return str;
}
  // Given a string, return a version without the first 2 chars. Except keep the first char if it is
  // 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
  //
  //
  // deFront("Hello") → "llo"
  // deFront("java") → "va"
  // deFront("away") → "aay"

    static String deFront(String str){
//       if(str.length()<=1)
//           return str;
        if(str.length() == 1 && str.charAt(0) != 'a')
            return "";
        char fristChar=str.charAt(0);
        char secondChar=str.charAt(1);

       if(fristChar!='a'&&secondChar!='b')
           return str.substring(2);
    else if (fristChar!='a')
        return str.substring(1);
       else if(secondChar!='b')
           return fristChar+ str.substring(2);
        return str;
}
  // Given an array of ints, return true if 6 appears as either the first or last element in the
  // array. The array will be length 1 or more.
  //
  //
  // firstLast6([1, 2, 6]) → true
  // firstLast6([6, 1, 2, 3]) → true
  // firstLast6([13, 6, 1, 2, 3]) → false

    boolean firstLast6(int[]nums){
    return nums[0]==6||nums[nums.length-1]==6;
    }
/*
Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.


            sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true*/
boolean sameFirstLast(int nums[]){
    if(nums.length!=0)
    return nums[0]==nums[nums.length-1];
    return false;
}

/*
* Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.


commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true
* */

boolean commonEnd(int[]a, int b[]){
    if(a.length!=0&&b.length!=0)
        return (a[0]==b[0])||(a[a.length-1]==b[b.length-1]);
    return false;
}
/*
* Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.


maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]*/

   int[]maxEnd3(int[]nums){
        if(nums.length!=0){
            int max=Math.max(nums[0],nums[2]);
            nums[0]=max;
            nums[1]=max;
            nums[2]=max;
            return nums;
        }
        return nums;
   }
/*
* Given an array of ints, return the sum of the first 2 elements in the array.
* If the array length is less than 2, just sum up the elements that exist,
* returning 0 if the array is length 0.


sum2([1, 2, 3]) → 3
sum2([1, 1]) → 2
sum2([1, 1, 1, 1]) → 2
*/

int sum2(int []nums){
    int sum=0;
    if(nums.length>=2)
        sum=nums[0]+nums[1];
    return 0;
}
/*
* Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
* The original array will be length 1 or more.


makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]

*
* */

int [] makeEnds(int[]nums){
    if(nums.length==1)
    return nums;
    else
    {
        nums[0]=nums[0];
        nums[1]=nums[nums.length-1];
        return nums;
    }

}
/*
* Given an int array length 2, return true if it contains a 2 or a 3.


has23([2, 5]) → true
has23([4, 3]) → true
has23([4, 5]) → false*/

boolean has23(int nums[]){
    boolean b = (nums[0] == 2 || nums[0] == 3) || (nums[1] == 3 || nums[1] == 2);
    return b;
}
/*
*
Given an int array length 2, return true if it does not contain a 2 or 3.


no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false*/
boolean no23(int nums[]){
    if(nums[0] == 2 || nums[0] == 3)
        return false;
    return !(nums[1] == 2 || nums[1] == 3);
}
/*
* Given an int array, return a new array with double the length where its last element is the same as the original array,
* and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]

* */

int []makeLast(int nums[]){
    int[] arr = new int[2 * nums.length];
    arr[arr.length - 1] = nums[nums.length - 1];
    return arr;
}
/*
* Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.


start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1*/

int start1(int[]a,int b[]){
    int count =0;

    if(a.length>=1&&a[0]==1)
        count++;
    if(b.length>=1&&b[0]==1)
        count++;
    return count;

}
int [] bigger(int[]a, int b[]){
//    int suma=a[0]+a[1];
//    int sumb=b[0]+b[1];
//    if(suma>=sumb)
//        return a;
//    return b;
int sum=a[0]+a[1]-b[0]-b[1];
if(sum>=0)
    return a;
return b;
}
/*
* Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.


makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]*/

int []makeMiddle(int nums[]){
    if (nums.length==2)
        return nums;
    int middle = nums.length/2;

    nums= new int[]{nums[middle - 1], nums[middle]};
    return nums;
}
/*
*
Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.


swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]*/
int []swapEnds(int nums[]){
    int temp =nums[0];//first
    nums[0]=nums[nums.length-1];//last
    nums[nums.length-1]=temp;//swap
    return nums;
    }
    /*
    * Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.


midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]*/
int []midThree(int nums[]){
    if(nums.length==3)
        return nums;

    int middle=nums.length/2;
    nums= new int[]{nums[middle-1],nums[middle],nums[middle+1]};
    return nums;
}
/*
Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.


maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5*/

 int maxTriple(int nums[]){
     int max=nums[0];
     if(max<=nums[1])
         max=nums[1];
     if(max<=nums[2])
         max=nums[2];
     return max;
 }
/*
*
Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.


frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]*/
int [] frontPiece(int nums[]){
    if(nums.length<=2)
        return nums;
    nums = new int[]{nums[0],nums[1]};
    return nums;
}
/*
*
Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.


countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, 5]) → 0*/


public int countEvens(int[]nums){
    int event=0;
    for (int i =0;i<nums.length;i++){
        if(nums[i]%2==0)
            event++;
    }
    return event;
}
/*
*
Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
*  Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.


bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8*/
public int bigDiff(int nums[]){

    int max = nums[0];
    int min = nums[0];
    for(int i = 1; i < nums.length; i++)
    {
        if(nums[i] > max)
            max = nums[i];
        else if(nums[i] < min)
            min = nums[i];
    }
    return (max-min);
}

}
