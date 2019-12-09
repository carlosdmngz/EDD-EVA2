public class Principal {

    public static void main(String[] args) {
        GCD(48, 180);
        System.out.println(mcd(48, 180));
    }
    
    public static void GCD(int iVal1, int iVal2){
        if (iVal2 == 0) {
            System.out.println(iVal1);
        } else {
            GCD(iVal2, iVal1 % iVal2);
        }
    }
    
    public static int mcd(int dividendo, int divisor){
        System.out.println(dividendo + " / " + divisor);
        if (divisor == 0){
            return dividendo;
        } else {
            int iResi = dividendo % divisor;
            return mcd(divisor, iResi);
        }
    }
    
}

    

