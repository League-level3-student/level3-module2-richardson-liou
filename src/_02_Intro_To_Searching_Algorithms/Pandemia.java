package _02_Intro_To_Searching_Algorithms;

public class Pandemia {

	public static double percentInfected(String map) {
		int infected = 0;
		int total =0;
		int counter = 0;
		boolean foundInfected = false;
		for(int i = 0; i< map.length();i++) {
			if (map.charAt(i)!='X') {
			total+=1;
			counter +=1;
			}
			
			if (map.charAt(i) == '1') {
				foundInfected = true;
				System.out.println("found 1");
				}
			if(map.charAt(i)=='X') {
				System.out.println("at X");
				System.out.println(counter);
				System.out.println(total);
				System.out.println(infected);
				System.out.println(foundInfected);
				if(foundInfected == true) {
					
					infected +=counter;
				}
				counter = 0;
				foundInfected = false;
				
			}
				}
					
				
	
				
			
		
		System.out.println(map);
		double percentage = 100*infected/total;
		return percentage;
	}
	public static void main(String[] args) {
		String map = "10X01X01X10X";
		System.out.println(percentInfected(map));
		
	}
}
