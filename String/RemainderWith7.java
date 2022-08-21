/*
Remainder with 7
Given a number as string(n) , find the remainder of the number whe it is divided by 7

Example 1:
Input:
5
Output:
5

Example 2:
Input:
8
Output:
1

Your Task:
You only need to complete the function remainderwith7() that takes string n as parameter and 
returns an integer which denotes the remainder of the number when its divided by 7
*/

class RemainderWith7{
	static int remainder(String num){
		
		// Initialize carryOver
		String rem = "";
		
		// Initialize number, remain
		int number = 0, remain = 0;
		
		// Traverse the string num
		for(int i = 0; i < num.length(); i++){
			
			// concatenate rem with current char
			rem += num.charAt(i);
			
			// convert string rem to integer number
			number = Integer.parseInt(rem);
			
			// if number is greater or equal to 7, find the number%7,
			//then reset the rem and add the remainder in rem
			if(number >= 7){
				remain = number % 7; 
				rem = "";
				rem += remain;
			}
		}
		return(Integer.parseInt(rem));
	}

	public static void main(String[] args){
		String n = "10000000292"; 
		
		System.out.print(remainder(n));
	}
}