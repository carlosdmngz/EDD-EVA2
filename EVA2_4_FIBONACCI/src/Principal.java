public class Principal {

    public static void main(String[] args) {
        System.out.println(Fibito(22));
    }
    public static int Fibito(int iPos){
        if(iPos==0){
        return 0;
            }else if(iPos==1){
            return 1;
        }else{
      return Fibito(iPos-1) + Fibito(iPos-2);
  }
    
    }
}
