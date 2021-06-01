import java.util.Arrays;

public class Challenges {
    /** Create a function which returns the number of true values there are in an array.
     */
    public static int countTrueFalse(boolean[] arr) {
      int count = 0;
      
      for (boolean each : arr){
          if (each) count++;
      }
        // you will need to change the return statement
        return count;
        /*
        first have our array of true and false.
        then count the true only in the array and hold it in memory
        return as int
         */
     }

    /** Create a function that takes an array and returns the absolute difference between the biggest and smallest numbers.*/
    public static int differenceMinMax1(int[] nums){
        Arrays.sort(nums);
        
        int min = nums[0];
        int max = nums[nums.length - 1];
        
       return Math.abs(min - max);
        /* Find the Smallest Number in the Array and hold the value and the same for the Largest Number
           Caculate the Absolute Differance between the two
         */
    }

    /**
     * Stutter
     * Write a function that stutters a word as if someone is struggling to read it.
     * The first two letters are repeated twice with an ellipsis ... and space after each,
     * and then the word is pronounced with a question mark ?
     */
    public static String stutter(String str){
        String first = str.substring(0 , 2) + "... ";
        
        return first + first + str + "?";
    }

    /** Write a function that takes an array of numbers and returns the second largest number.*/
    public static int secondLargestNumber(int[] nums){
        // write your code here
        Arrays.sort(nums);
        
        int max = nums[nums.length - 2];
        
        // you will need to change the return statement
        return max;
    }

    /**
     FizzBuzz
     Create a function that takes a number as an argument and returns "Fizz", "Buzz" or "FizzBuzz".
     If the number is a multiple of 3 the output should be "Fizz".
     If the number given is a multiple of 5, the output should be "Buzz".
     If the number given is a multiple of both 3 and 5, the output should be "FizzBuzz".
     If the number is not a multiple of either 3 or 5, the number should be output on its own as shown in the examples below.
     The output should always be a string even if it is not a multiple of 3 or 5.
     **/
    public static String fizzBuzz(int num){
        // write your code here
        // you will need to change the return statement
        return "";
    }

    /**
     * Skip Counting
     * Write a program that gets three integers from the user.
     * Count from the first number to the second number in increments of the third number.
     */
    public static String skipCount(int countFrom, int countTo, int countBy){
        //Count from first to second number in increments of the third number and if its possible we will have
        //Try again with better numbers!
        
       // Valid User input
        if (countTo < countFrom) {
            return "Try again with better numbers!";
        }
        StringBuilder answer = new StringBuilder();
        // Create Pattern based on user input numbers
        for (int currentInt = countFrom; currentInt <= countTo; currentInt += countBy){
            answer.append(currentInt).append(".. ");
        }
        
        //return pattern as a string
        answer.setLength(answer.length() - 3);
        return answer.toString();
    }

    /** The "Reverser"
     * takes a string as input and returns that string in reverse order, with the opposite case.*/
    public static String reverser(String reverseMe) {
        // write your code here
        String reverse = new StringBuffer(reverseMe).reverse().toString(); //this reverses the string
    
        for (int i = 0; i < reverse.length(); i++) {
        
            if (Character.isUpperCase((i))) ;
            {
                Character.toLowerCase(10);
            
                if (Character.isUpperCase((i))) ;
                {
                    Character.toLowerCase(5);
                }
            
            }
        }
        return reverse.toUpperCase();
    }// you will need to change the return statement
        /*
        find a way to reverse. next try to make the letters match while swapped around.
         */
        /**
         * Reverse An Array
         * Write a function that reverses the order of an array
         */
        public static int[] reverseArray ( int[] arr){
            // write your code here
            //find a way to reverse the array
        
            //
            for (int array = 0; array < arr.length / 2; array++) {
                int reverse = arr[array];
                arr[array] = arr[arr.length - array - 1];
                arr[arr.length - array - 1] = reverse;
            }
        /*
        Using I for index just for my test i wanted to use reverse keyword but solved!
         */
            return arr;
        }
    
    /**
     * Write a function that finds the word "bomb" in the given string (not case sensitive).
     * Return "DUCK!" if found, otherwise,"Relax, there's no bomb.".
     */
    public static String duckTheBomb(String checkMe){
        // write your code here
        //i didnt get to this but what im assuming what would be needed is a if else followed for strings
        // you will need to change the return statement
        return "";
    }

    /** Sort in Ascending Order
     * Create a method that takes an array of integers and returns a new array, sorted in ascending order (smallest to biggest).
     * If the function's argument is null, an empty array or undefined, return an empty array
     */
    public static int[] sortNumsAscending(int[] nums){
        // write your code here
       /* int Array[] = new int[] ;
        Arrays.sort(nums);
        */
        
        //i didnt get to this but what im assuming what would be needed but like sort array like i did for secondlargest
        // you will need to change the return statement
        return new int[0];
    }

    /**
     * Remove Duplicates
     * Create a method that takes an array of strings,removes all duplicate items
     * and returns a new array in the same sequential order as the old array (minus duplicates).
     */
    public static String[] removeDups(String[] str){
        // write your code here
        //i didnt get to this either but same as counttrue but for arrays
        // you will need to change the return statement
        return new String[0];
    }
}