/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;



/**
 *
 * @author SCHOOL
 */
public class DuplicateElements {
    public static void main(String[] args)
    {
        List<Integer> list=new ArrayList<Integer>();
        list.add(12);
        list.add(13);
        list.add(15);
        list.add(12);
        list.add(17);
        list.add(12);
        System.out.println(list);
        
        Set<Integer> distinct=new LinkedHashSet<Integer>();
        
        System.out.println("The duplicate values are: ");
        for(int i : list)
            if(!distinct.add(i))
            System.out.println(i);
       
        System.out.println("The frequency of duplicate values are: ");
        for(int i : distinct)
        System.out.println(i+":"+Collections.frequency(list,i));
           
    }
    }

