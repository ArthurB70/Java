import java.util.Scanner;

class Main {

  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String palavra1;
    palavra1 = "PalaPra";
    String palavra2;
    palavra2= "";
    int j = palavra1.length();
    for(int i = 0; i<j; i++){
      char aux = palavra1.charAt(i);
      aux+=3;
      palavra2+=aux;
    }
    
    System.out.println(palavra1);
    System.out.println(palavra2);
  }
}