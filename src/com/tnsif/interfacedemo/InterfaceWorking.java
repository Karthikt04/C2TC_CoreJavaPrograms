package com.tnsif.interfacedemo;

interface PlayGames{
	
	 void Games() ; //declaration
	 }



public class InterfaceWorking implements PlayGames{

		public void Games(){
			System.out.println("Lets play games...");
			}
		
		
		
		public static void main(String[] args){
			
			
			InterfaceWorking infiw = new InterfaceWorking();
			infiw.Games();
			}

	}
