/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myiteratorpattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author arash
 */
public class tempArrayCollection {
    private String[] array;
    
    public String[] getData(Object text){
        String [] retArray=null;
        Class arrayType = text.getClass(); //.getComponentType();
        System.out.println(arrayType);
        if (text.getClass().toString().contains(".ArrayList")){
                ArrayList<String> temp= (ArrayList)text;
                retArray= new String[temp.size()];
                for(int i=0; i< temp.size(); i++){
    //                System.out.println(temp.get(i));
                    retArray[i]=temp.get(i);
                }
            }
        else
        if (text.getClass().toString().contains(".String")){
                String[] temp1= (String[])text;
                retArray=temp1;
//                for(int i=0; i< temp1.length; i++){
//                    System.out.println(temp1[i]);
//                }
            }else
       if (text.getClass().toString().contains(".HashMap")){
            Map temp2= (HashMap)text;
            retArray= new String[temp2.size()];
            int i=0;
            for (Object t : temp2.values()) {
//                System.out.println(t);
                retArray[i]=t.toString();
                i++;
            }
       }
        return retArray;
    }  
    
        
}
        
          

