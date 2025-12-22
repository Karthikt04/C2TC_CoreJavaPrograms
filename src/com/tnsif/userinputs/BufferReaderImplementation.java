package com.tnsif.userinputs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BufferReaderImplementation{
	
	public static void main(String[] args) throws IOException{


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		System.out.println("Enter Street: ");
		String Street = br.readLine();
		
		System.out.println("Enter door.no: ");
		int doorno = Integer.parseInt(br.readLine());
		
		
		
		System.out.println("The door no is: "+ doorno + " and the street name is: "+Street);

	}


}
