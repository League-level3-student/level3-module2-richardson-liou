package _03_More_Algorithms;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    static int two = 2;
	
    public static String multiply(int num1, int num2) {
    	int prod = num1*num2;
    	String product = Integer.toString(prod);
    	String response = num1 + " x " + num2 + " = "+ product;
    	
    	return(response);
        
    }
    
    public static int findBrokenEgg(List<String> eggs) {
    	for (int i = 0; i< eggs.size();i++) {
    		if (eggs.get(i).equals("cracked")) {
    			return i;
    			
    		}
    	}
		return 0;
    }
    
    public static boolean isPrime(int number) {
    	
    	if (number<= 1) {
    		return false;
    		}
    		for (int i = 2; i< number; i++) {
    		if (number % i == 0) {
    		return false;
    		}
    		}
    		return true;
    		}

    	
    
    
    
    public static boolean isSquare(int number) {
    	int root = (int) Math.sqrt(number);
    	System.out.println(root);
    	int check = root*root;
    	System.out.println(check);
    	if (check == number) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public static boolean isCube(int number) {
    	int croot = (int) Math.cbrt(number);
    	System.out.println(croot);
    	int check = croot*croot*croot;
    	System.out.println(check);
    	if (check == number) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
}
