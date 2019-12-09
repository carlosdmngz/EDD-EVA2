
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in); 
        System.out.println("Teclea un numero");
        int x = lee.nextInt();
    //    if(PrimoMalvado(x))
    //      System.out.println("Es primo");
    //    else
    //      System.out.println("No es primo");
        if (PrimoBueno(x))
            System.out.println("Es primo");
        else
            System.out.println("No es primo");
    
    }
    public static boolean PrimoMalvado(int valor){
        boolean bResu = true;
        for (int i = 2; i < valor; i++) {
          if((valor%i)==0){
              bResu = false;
              break;
          }
        }          return bResu;

    }
    public static boolean PrimoBueno(int valor){
        boolean bResu = true;
        for (int i = 2; i < (Math.sqrt(valor)); i++) {
        if((valor%i)==0){
              bResu = false;
              break;
          }    
        }
        return bResu;
    }
    
}
