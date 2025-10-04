public class Arbol {

    Nodo raiz; //Nodo raiz del arbol
    public Arbol(){ //Constructor
        raiz = null;
    }
    //Insertar un nuevo nodo en la llave
    public void insertar(int i){ //Object objeto
        Nodo n = new Nodo(i);
        //Si el árbol está vacío, el nuevo nodo se convierte en la raíz
        if(raiz == null){
            raiz = n;
        } else {
            Nodo aux = raiz; // Si ya existe una raíz, se recorre el árbol para encontrar dónde insertar el nuevo nodo
            while (aux != null){
                n.padre = aux;
                if (n.llave >= aux.llave){ // Si la llave del nuevo nodo es mayor o igual, avanza por la derecha
                    aux = aux.derecha;
                } else {
                    aux = aux.izquierda; //Si la llave es menor, avanza por la izquierda
                }
            }
            if (n.llave < n.padre.llave){
                n.padre.izquierda = n;
            } else {
                n.padre.derecha = n;
            }
        }
    }
    //Funcion para recorrer el arbol inorden
    public void recorrer(Nodo n){
        if (n != null){
            recorrer(n.izquierda); //Recorre por la izquierda
            System.out.println("Indice = " + n.llave); //Muestra el valor
            recorrer(n.derecha); //Recorre por la derecha
        }
    }
    //Clase para representar cada nodo del arbol
    private class Nodo {
        public Nodo padre;
        public Nodo derecha;
        public Nodo izquierda;
        public int llave; //Valor del nodo
        public Object contenido;
        //Constructor de nodo
        public Nodo (int indice){
            llave = indice;
            derecha = null;
            izquierda = null;
            padre = null;
            contenido = null;
        }
    }
    //Metodo público que inicia la búsqueda de un valor desde la raíz
    public boolean buscar(int valor) {
        return buscarNumero(raiz, valor);
    }
    //Metodo para buscar el numero ingresado por consola
    private boolean buscarNumero(Nodo nodo, int valor) {
        if (nodo == null) {
            return false; // Nodo no encontrado
        }
        if (valor == nodo.llave) {
            return true; // Nodo encontrado
        }
        if (valor < nodo.llave) {
            return buscarNumero(nodo.izquierda, valor); //Si es menor, busca en la izquierda
        } else {
            return buscarNumero(nodo.derecha, valor); //Si es mayor, busca en la derecha
        }
    }
}
