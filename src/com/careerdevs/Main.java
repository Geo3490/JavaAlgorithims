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
        if(b == true){
            return false;
        }
        else{
            return true;
        }
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
        for (int i : arr) {
        if (arr.length == 0) return false;
            if (i >= n) return true;
        }
        return false;
    }
}

        //9
//Create a function that takes a string and returns the number (count) of vowels contained within it.

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

            //10.Return the Sum of Two Numbers

public class SumOfTwoNumbers {
    public static int sum(int a, int b) {
        int total = a + b;
        return total.sum()
    }
}


        //11.Are the Numbers Equal?

public class Program {
    public static boolean isSameNum(int x, int y) {
        if (x == y){
            return true;
        }
        else {
            return false;
        }
    }
}

        //12.Convert Age to Days

public class Age {
    public static int calcAge(int age) {
        int days = 365;
        int result = age * days;
        return result;
    }
}

        //13.Name Greeting!

public class Challenge {
    public static String helloName(String name) {
        return helloname + name;
    }
}

        //14.Reverse String

class ReverseString {
    public static void main(String[] args)
    {
        String input = "name";

        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(input);

        // reverse StringBuilder input1
        input1.reverse();

        // print reversed String
        System.out.println(input1);
    }
}