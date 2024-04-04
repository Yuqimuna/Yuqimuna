import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class IfElseClass {
    public String nama,ket;
    public int nilaiAkhir;
    Scanner input =new Scanner(System.in);
    
    public void setInputData(){
        System.out.print("Masukan Nama Siswa:");
        nama = input.nextLine();
        System.out.print("Masukan Nilai Akhir:");
        nilaiAkhir = input.nextInt();
    }
    public String getKeterangan(){
        if(nilaiAkhir > 70){
        ket="lulus";
        }else{
            ket="gagal";
        }
        return ket;
    }
    }

