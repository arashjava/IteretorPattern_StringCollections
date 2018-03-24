/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myiteratorpattern;

/**
 *
 * @author arash
 */
public class MyIteratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                MyArray array = new MyArray();
		MyArrayList arrayList = new MyArrayList();
		MyHashtable hashTable = new MyHashtable();
		
		Collections myCollections = new Collections(array, arrayList, hashTable);
		
	
		myCollections.printOutput();
        
    }
    
}
