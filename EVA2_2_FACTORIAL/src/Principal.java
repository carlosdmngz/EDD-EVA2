public class Principal {


    public static void main(String[] args) {
        System.out.println("Factorial de 5 = " +nFactorial(5));
    }
    public static int nFactorial(int iVal){
        System.out.println("Inicio " + iVal);
        //Si iVal == 0 Debemos detener la recursividad
        if(iVal == 0){
            System.out.println("Fin");
            return 1;
        }else{
            return iVal * nFactorial(iVal - 1);
        }
    }
    
}

