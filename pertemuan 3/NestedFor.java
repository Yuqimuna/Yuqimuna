package com.mycompany.pertemuaan3;

/**
 *
 * @author Lenovo
 */
public class NestedFor {
    public static void main (String[] args)
    {
        int a, b;
        
        for (a= 1; a<=5; a++)
        {
            for (b = a; b <= 5; b++)
            {
                System.out.print (a);
            }
        }
        System.out.println("\n");
    }
}
