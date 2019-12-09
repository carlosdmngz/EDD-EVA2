
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lista {
    private Nodo inicio;
    private Nodo fin;

    public Lista() {
        this.inicio = null;
        this.fin = null;
    }
//DEVUELVE TRUE SI LA LISTA ESTA VACIA
    public boolean isEmpty(){
        if(inicio == null)
            return true;
        else
            return false;
    }
//AGREGAR UN NODO AL FINAL DE LA LISTA
    public void add(Nodo nuevo){
        //PRIMERO VERIFICAR SI LA LISTA ESTA VACIA
        if (isEmpty()){
            inicio = nuevo;
            fin = nuevo;
        }else{
//            Nodo temp = inicio;
//            while (temp.getSiguiente()!= null){
//                temp=temp.getSiguiente();
//            }
//            temp.setSiguiente(nuevo);
              fin.setSiguiente(nuevo);
              fin = nuevo;
        }
    }
    
    public void addBeginning(Nodo nuevo){
         //PRIMERO VERIFICAR SI LA LISTA ESTA VACIA
        if (isEmpty()){
            inicio = nuevo;
            fin = nuevo;
        }else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }
    
//IMPRIMIR LISTA
    public void print(){
        Nodo temp = inicio;
        while(temp != null){
            System.out.print(temp.getValor() + " - ");
            temp = temp.getSiguiente();
        }
                    System.out.println("");

    }
//CANTIDAD DE ELEMENTOS EN LA LISTA
    public int size(){
        int iCont=0;
        Nodo temp = inicio;
        while(temp != null){
            iCont++;
            temp = temp.getSiguiente();
        }
        return iCont;
    }
    public void insertAt(int pos, Nodo nuevo) throws Exception{
        int iTama = size();
        if((pos < 0) || (pos >= iTama)){
            throw new Exception("Posicion invalida");
        }else{
            if(pos == 0){
                addBeginning(nuevo);
            }else{
            int iCont = 0;
            Nodo temp = inicio;
            while(iCont < (pos - 1)){
                temp = temp.getSiguiente();
                iCont++;
            }
            nuevo.setSiguiente(temp.getSiguiente());
            temp.setSiguiente(nuevo);
        }
    }
}
    public void clear(){
        inicio = null;
        fin = null;
    }
    public void clearAt(int pos) throws Exception{
        //LISTA ESTA VACIA
        if(isEmpty())
                throw new Exception("La lista esta vacia");
        int iTama = size();
        if((pos < 0) || (pos >= iTama ))
            throw new Exception("Posicion invalida");
        
        if(iTama == 1){ //SOLO HAY UN NODO
            clear();
        }else{ //MUCHOS NODOS
            if(pos == 0){ //BORRAR EL PRIMER NODO
                inicio = inicio.getSiguiente();
            }else{
            int iCont = 0;
            Nodo temp = inicio;
            while(iCont < (pos - 1)){
                temp = temp.getSiguiente();
                iCont++;
            }
            temp.setSiguiente(temp.getSiguiente().getSiguiente());
            
            if(pos == (iTama - 1))
                fin = temp;
            }
        }
    }
    
    public int getAt(int pos){
        //VERIFICAR
        int iCont = 0;
        Nodo temp = inicio;
          while(iCont < pos){
                temp = temp.getSiguiente();
                iCont++;
            }
          return temp.getValor();
    }
}


