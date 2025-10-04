import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Arbol arbol = new Arbol(); //Instancia

        int seleccionarOpcion;
        do { //inicia el ciclo
            System.out.println("");
            System.out.println("***--> MENU - ARBOLES(BINARIOS) <--***");
            Scanner sc = new Scanner(System.in);
            System.out.println("1). Inserte Un Numero en el Arbol");
            System.out.println("2). Mostrar Recorrido - Inorden");
            System.out.println("3). Buscar Numero");
            System.out.println("4). Salir");
            System.out.println("*********************************");

            System.out.print("Ingrese una opcion: ");
            seleccionarOpcion = sc.nextInt();
            switch (seleccionarOpcion) {
                case 1:
                    System.out.print("Ingrese un numero = ");
                    var valor = sc.nextInt();
                    arbol.insertar(valor);
                    break;
                case 2:
                    System.out.println("Recorrido Inorden");
                    arbol.recorrer(arbol.raiz);
                    break;
                case 3:
                    System.out.print("Ingrese un número a buscar: ");
                    int buscarNumero = sc.nextInt();
                    boolean existe = arbol.buscar(buscarNumero);
                    if (arbol.buscar(buscarNumero)) {
                        System.out.println("El número existe (" + existe + ")");
                    } else {
                        System.out.println("El número NO existe (" + existe + ")");
                    }
                    break;
                case 4:
                    System.out.println("SALIENDO DEL PROGRAMA .....");
                    break;
            }
            try {
                Thread.sleep(2000); //Tiempo de respuesta de 3seg
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while(seleccionarOpcion != 4); //Termine el ciclo
    }
}

