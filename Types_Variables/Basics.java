package com.martin.Types_Variables;

public class Basics {
	public static void main(String[] args) {
		String word = "Bottles";
		String word2 = "Bottle";
		int count = 99;
		while(count>0) {
		System.out.println("***" + count + " " + word + " " + "of beer on the wall," );
		System.out.println(count + " " + word + " " + "of beer.");
		System.out.println("You take one down and pass it around: ");
		count --;
		if(count !=1) {
		System.out.println(count + " " + word + " " + "of beer on the wall..." );
		}else {
			System.out.println(count + " " + word2 + " " + "of beer on the wall..." );
		}
		
			
		if (count==1) {
			System.out.println("***" + count + " " + word2 + " " + "of beer on the wall," );
			System.out.println(count + " " + word2 + " " + "of beer.");
			System.out.println("You take one down and pass it around: ");
			count--;
			System.out .println("Sorry, we are all out of beer, a glass of water perhaps?");
			
		}
		
		}
		
	}

}
