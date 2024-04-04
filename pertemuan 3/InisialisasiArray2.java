package com.mycompany.pertemuaan3;

/**
 *
 * @author Lenovo
 */
public class InisialisasiArray2 {
    public static void main(String[] args)
    {
        int i, j;
        int[][] nil_akhir = {{150, 159, 230},{100, 125, 150},{210,125,156}};
        
        System.out.println("Data Yang Diinput ke Elemen Array \n");
        //menampilkan data dari elemen array
        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                System.out.print("Niali Akhir ["+i+"]{"+j+"]=");
                System.out.println(" = " + nil_akhir[i][j]);
            }
        }
    }
}
