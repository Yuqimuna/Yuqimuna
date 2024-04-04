package kondisiIf;

import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class IfClassAksi {
    public static void main (String[]args)
    {
        double tot_beli;
        Scanner input = new Scanner (System.in);
        IfClass fungsiif=new IfClass ();
        
        System.out.print("Total Pembelian Rp. ");
        fungsiif.TotBeli=input.nextDouble();
        
        System.out.println("Besarnya Potongan Rp. " +fungsiif.getPotongan());
        System.out.println("Jumlah Yang harus dibayarkan Rp. "+ fungsiif.JumlahBayar());
        
    }
}
