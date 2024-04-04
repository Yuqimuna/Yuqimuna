import java.io.*;
/**
 *
 * @author Lenovo
 */
public class LatBuffered {
    public static void main(String args[])throws Exception
    {
        //membuat object baru
        InputStreamReader keyreader = new InputStreamReader (System.in);
        BufferedReader input = new BufferedReader(keyreader);
        //deklarasi variable
        String kata1, kata2;
        
        System.out.print("Masukan Kata Pertama : ");
        kata1 = input.readLine();
        System.out.print("Masukan Kata Kedua : ");
        kata2 = input.readLine();
        System.out.println("\nHasil Input String "+kata1+" "+ kata2);
    }
    
}
