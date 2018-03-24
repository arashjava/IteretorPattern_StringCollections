/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myiteratorpattern;

import java.util.Hashtable;
import java.util.Iterator;

/**
 *
 * @author arash
 */
public class MyHashtable implements IIterator{

	Hashtable<Integer, String> myString;
	
	public MyHashtable() {
		
		myString = new Hashtable<Integer, String>();
		for (int i=0; i< 10; i++){
          		myString.put(i,"This is string # " + i + " in Hashtable");
                }
	}

	public Hashtable<Integer, String> getMySTring(){
		
		return myString;
		
	}


    @Override
    public Iterator data() {
	return myString.values().iterator();	
    }
	
}

    

