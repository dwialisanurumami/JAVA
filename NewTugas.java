import java.util.Scanner;

public class NewTugas {
  public static void main(String[] args) {
      String[] nama = new String[10];
      Scanner scan = new Scanner(System.in);

      for ( int i = 0; i < nama.length; i++){
          System.out.print("Nama ke-" + i + ": ");
          nama[i] = scan.nextLine();
      }
      System.out.println("----------------------------------------");
      for( String n : nama ){
          System.out.println(n);
      }
  }  
}