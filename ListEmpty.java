/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author SCHOOL
 */
public class ListEmpty {
    public static void main(String[] args)
    {
        List<String> list= new ArrayList<String>();
        list.add("java");
        list.add("mava");
        list.add("lava");
        list.add("java");
        list.add("mava");
        list.add("lava");
        list.add("java");
        list.add("mava");
        list.add("lava");
        list.add("java");
        list.add("mava");
        for(Object obj1:list)
        {
            System.out.println(obj1);
        }
        
        if(list!=null && !list.isEmpty())
            System.out.println("List is not empty");
        
        System.out.println("Object at index 5:"+list.get(5));
        
        
        Object o=list.set(10, "lava");
        System.out.println("Replaced element is:"+o);
        
        for(Object obj1:list)
        {
            System.out.println(obj1);
        }
        
        
        
    }
}
