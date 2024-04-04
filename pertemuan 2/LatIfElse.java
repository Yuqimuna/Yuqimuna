import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class LatIfElse {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        String keterangan,nama;
        int nilai;
        
        System.out.print("Masukan Nama Siswa :");
        nama = input.nextLine ();
        System.out.print("Masukan Niali Akhir : ");
        nilai = input.nextInt();
            if(nilai > 70){
                keterangan = "lulus";
            }else{
                keterangan="gagal";
            }
        System.out.println("Hasil Akhir");
        System.out.println("================================");
        System.out.println("Nama Siswa                :"+nama);
        System.out.println("Nilai Akhir Yang di dapat :"+nilai);
        System.out.println("keterangan                :"+keterangan);
        System.out.println("================================");
    }
    
}
