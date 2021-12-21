package com.careerdevs;

        //1
//Create a function that takes an array containing only numbers and return the first element.

public class Challenge{
    public static int getFirstValue (int[] arr){
        return arr[0];
    }
}

        //2
//Create a function that takes a number as an argument, increments the number by +1 and returns the result.


public class Challenge{
    public static int addition(int[] num){
        return ++num;
    }
}

        //3
//Create a function that searches for the index of a given item in an array. If the item is present, it should return the index, otherwise, it should return -1.


public class Challenge {
    public static int search(int arr[], int item) {
        int index=-1;
        for(int i=0; i < arr.length;i++){
            if(arr[i]==item){
                index = i;
                i+=arr.length+1;
            }
        }
        return index;
    }
}
        //4
//Write a function that takes an integer minutes and converts it to seconds.

public class Challenge {
    public static int convert(int minutes) {
        return minutes * 60;
    }
}

        //5
//Write a function that returns the string "something" joined with a space " " and the given argument a.


public class Program {
    public static String giveMeSomething(String a) {
        return "something " + a;
    }
}

        //6
//Create a function that reverses a boolean value.

public class Challenge {
    public static boolean reverse(boolean b) {
        return !b;
    }
}

        //7
//Create a method that takes a string and returns the word count. The string will be a sentence.

public class Program {
    public static int countWords(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == ' ')
                count++;
        }
        return count + 1;
    }
}

        //8
//Write a function that returns true if there exists at least one number that is larger than or equal to n.

public class ExistsANumberHigher {
    public static boolean existsHigher(int[] arr, int n) {
        if (arr.length == 0) return false;
        for (int i : arr) {
            if (i >= n) return true;
        }
        return false;
    }
}

        //9
//Create a function that takes a string and returns the number (count) of vowels contained within it.

import java.util.*;

public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;

        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                vowelsCount++;
        }

        return vowelsCount;
    }
}