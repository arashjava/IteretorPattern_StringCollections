/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myiteratorpattern;

import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author arash
 */
public class MyArray implements IIterator{

	
	String[] myString;
	
	public MyArray() {
		
		myString = new String[10];
		for (int i=0; i< 10; i++){
          		myString[i]="This is string # " + i + " in Array";
                }

		
	}

	public String[] getMySTring(){
		
		return myString;
		
	}


    @Override
    public Iterator data() {
		return Arrays.asList(myString).iterator();	
    }
	
}

    

