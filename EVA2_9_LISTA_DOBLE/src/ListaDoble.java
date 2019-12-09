
public class ListaDoble {
    
    private Nodo inicio;
    private Nodo fin;
    
    public ListaDoble() {
        this.inicio = null;
        this.fin = null;
    }
    
    public void add(Nodo nuevo){
        if (isEmpty()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
            fin = nuevo;
        }
    }
    
    public boolean isEmpty(){
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void print(){
        Nodo temp = inicio;
        while(temp != null){
            System.out.print(temp.getValor() + " - ");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }
    
    public void printBckwrds(){
        Nodo temp = fin;
        while(temp != null){
            System.out.print(temp.getValor() + " - ");
            temp = temp.getPrevio();
        }
        System.out.println("");
    }
    
    public int size(){
        int iCont = 0;
        Nodo temp = inicio;
        while(temp != null){
            iCont++;
            temp = temp.getSiguiente();
        }
        return iCont;
    }
    
    public void clear(){
        inicio = null;
        fin = null;
    }
    
    public int getAt(int pos) throws Exception{
        int iTam = size();
        if (isEmpty()){
            throw new Exception("La lista esta vacia");
        } else if (pos < 0 || pos >= iTam) {
            throw new Exception("La posicion es invalida");
        } else{
            Nodo temp = inicio;
            int cont = 0;
            while(cont < pos){
                temp = temp.getSiguiente();
                cont++;
            }
            return temp.getValor();
        }
    }
    
    public void addBeginning(Nodo nuevo){
        if (isEmpty()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio.setPrevio(nuevo);
            inicio = nuevo;
        }
    }
    
    public void insertAt(int pos, Nodo nuevo) throws Exception{
        int iTam = size();
        if (pos < 0 || pos >= iTam) {
            throw new Exception("La posicion es invalida");
        } else if(pos == 0){
            addBeginning(nuevo);
        } else {
            int iCont = 0;
            Nodo temp = inicio;
            while(iCont < pos){
                temp = temp.getSiguiente();
                iCont++;
            }
            nuevo.setPrevio(temp.getPrevio());
            nuevo.setSiguiente(temp);
            temp.getPrevio().setSiguiente(nuevo);
            temp.setPrevio(nuevo);
        }
    }
    
    public void deleteAt(int pos) throws Exception{
        int iTam = size();
        if (isEmpty()){
            throw new Exception("La lista esta vacia");
        } else if (pos < 0 || pos >= iTam) {
            throw new Exception("La posicion es invalida");
        } else if (iTam == 1){
            clear();
        } else { 
            if (pos == 0){
                inicio = inicio.getSiguiente();
                inicio.setPrevio(null);
            } else{
                Nodo temp = inicio;
                int cont = 0;
                while(cont < pos){
                    temp = temp.getSiguiente();
                    cont++;
                }
                if (pos == (iTam - 1)) {
                    temp.getPrevio().setSiguiente(temp.getSiguiente());
                    fin = temp.getPrevio();
                } else { 
                    temp.getPrevio().setSiguiente(temp.getSiguiente());
                    temp.getSiguiente().setPrevio(temp.getPrevio());
                }
            }
        }
    }
    
}
