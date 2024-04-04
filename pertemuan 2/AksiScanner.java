import java.util.Scanner ;/*
/**
 *
 * @author Lenovo
 */
public class AksiScanner {
    public static void main(String args[])
    {
        //memmbuat obbjek baru
        ClassScanner scan=new ClassScanner();
        
        scan.inputScanner();
        System.out.println("\nNama Anda : " + scan.getnama());
        System.out.println("Nilai Anda : " + scan.rata());
    }           
}

