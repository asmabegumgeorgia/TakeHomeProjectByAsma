package Practical1;

import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		
		int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int number = 0;
        Random  randNumber= new Random();
        
        for (int i = 0; i <= 500; i++) {            
            number = 1+randNumber.nextInt(500);
            
            System.out.println(number);
            

            if (number > highest) {
                highest = number;
            }

            if (number < lowest) {

                lowest = number;
            }

        }

        System.out.println("Highest number is: " + highest);
        System.out.println("Lowest number is: " + lowest);
		
		
	}

}
