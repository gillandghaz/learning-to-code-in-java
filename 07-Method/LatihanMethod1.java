import java.util.Scanner;

public class LatihanMethod1{
    public static void main(String[] args) {
        
        Scanner cekNilai = new Scanner(System.in);

        System.out.println("Masukkan nilai: ");
        int nilai = cekNilai.nextInt();

        boolean hasilCek = cekLulus(nilai);
        
        if (hasilCek){
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }

    }


public static boolean cekLulus(int nilai) {
    return nilai >= 60;
}

}