/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myiteratorpattern;

import java.util.Iterator;

/**
 *
 * @author arash
 */
public class Collections {
    
    IIterator uniformArray;
    IIterator uniformArrayList;
    IIterator uniformHashtable;

    public Collections(IIterator uniformArray, IIterator uniformArrayList, IIterator uniformHashtable) {
        this.uniformArray = uniformArray;
        this.uniformArrayList = uniformArrayList;
        this.uniformHashtable = uniformHashtable;
    }
    
    	public void printOutput(){

		
		Iterator array = uniformArray.data();
		Iterator arrayList = uniformArrayList.data();
		Iterator hashTable = uniformHashtable.data();
		
                // uniform treatment to different collections
                while (array.hasNext()){
                    String str = (String) array.next();
                    System.out.println(str);
                }
                
                while (arrayList.hasNext()){
                    String str = (String) arrayList.next();
                    System.out.println(str);
                }

                while (hashTable.hasNext()){
                    String str = (String) hashTable.next();
                    System.out.println(str);
                }
                
	}
    
}
