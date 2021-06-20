import java.util.Scanner;

public class bebas {
    public static void main(String[] args){
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Nilai Anda: ");
        nilai = scan.nextInt();

        if (nilai >= 80){
            grade = "Sempurna";
        } else if ( nilai >= 65){
            grade = "Baik";
        } else if ( nilai >= 50){
            grade = "cukup";
        } else if ( nilai >= 40){
            grade = "Jelek";
        } else if ( nilai >= 0){
            grade = "Tidak Naik Kelas";
        } else {
            grade = "Wes Mbohhhh!!!";
        }
        System.out.println("Nilai: " + grade);
    }
}