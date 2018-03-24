/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myiteratorpattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author arash
 */
public class MyArrayList implements IIterator{

	
	ArrayList<String> myString;
	
	public MyArrayList() {
		
		myString = new ArrayList<String>();
		for (int i=0; i< 10; i++){
          		myString.add("This is string # " + i + " in ArrayList");
                }
		
	}

	public ArrayList<String> getMySTring(){
		
		return myString;
		
	}


    @Override
    public Iterator data() {
        return myString.iterator();
    }
	
}

    

