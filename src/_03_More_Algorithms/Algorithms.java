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
    
    public static int countPearls(List<Boolean> oysters) {
    	int counter = 0;
    	for (int i = 0; i< oysters.size();i++) {
    		if (oysters.get(i)) {
    			counter+=1;
    		
    			
    		}
    	}
    	return counter;
    }
    
    public static double findTallest(List<Double> heights) {
    	double max = 0;
    	for (int i = 0; i< heights.size();i++) {
    		if (heights.get(i)>max) {
    			max =heights.get(i);
    		
    			
    		}
    	}
    	return max;
    }

	public static String findLongestWord(List<String> words) {
		int max = 0;
		String index = "";
		for (int i = 0; i< words.size();i++) {
    		if (words.get(i).length()>max) {
    			max = words.get(i).length();
    			index = words.get(i);
    		
    			
    		}
    	}
		System.out.println(index);
		return index;
		
			}

	public static boolean containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		String sos = "... --- ...";
		boolean containsSOS = false;
		for(int i = 0; i<message1.size();i++) {
			if(message1.get(i).equals(sos)) {
				containsSOS = true;
			}
			
		}
		System.out.println(containsSOS);
		return containsSOS;
		
	}

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		boolean isSorted = false;
    	int counter = 0;
    	while (isSorted == false) {
    		counter = 0;
    		for(int i = 0; i< results.size()-1;i++) {
    			
    			if (results.get(i) > results.get(i+1)) {
    				Double temp = results.get(i);
    				Double nextTemp = results.get(i+1);
    				results.set(i,nextTemp);
    				results.set(i+1,temp);
    				counter = 1;
    			}
    			
    		}
    		if (counter != 0) {
    			isSorted = false;
    		}
    		else {
    			isSorted = true;
    		}
	   
    	}System.out.println(results);
    	return results;
}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		boolean isSorted = false;
    	int counter = 0;
    	while (isSorted == false) {
    		counter = 0;
    		for(int i = 0; i< unsortedSequences.size()-1;i++) {
    			
    			if (unsortedSequences.get(i).length() > unsortedSequences.get(i+1).length()) {
    				String temp = unsortedSequences.get(i);
    				String nextTemp = unsortedSequences.get(i+1);
    				unsortedSequences.set(i,nextTemp);
    				unsortedSequences.set(i+1,temp);
    				counter = 1;
    			}
    			
    		}
    		if (counter != 0) {
    			isSorted = false;
    		}
    		else {
    			isSorted = true;
    		}
		
	}
    	System.out.println(unsortedSequences);
    	return unsortedSequences;
	
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		boolean isSorted = false;
    	int counter = 0;
    	while (isSorted == false) {
    		counter = 0;
    		for(int i = 0; i< words.size()-1;i++) {
    			
    			if (words.get(i).compareTo(words.get(i+1))>0) {
    				
    				String temp = words.get(i);
    				System.out.println(temp);
    				String nextTemp =words.get(i+1);
    				System.out.println(nextTemp);
    				words.set(i,nextTemp);
    				words.set(i+1,temp);
    				counter = 1;
    			}
    			
    		}
    		System.out.println(words);
    		if (counter != 0) {
    			isSorted = false;
    		}
    		else {
    			isSorted = true;
    		}
		
	}
		return words;
	}
}
