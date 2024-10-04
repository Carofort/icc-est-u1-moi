public class App {
    public static void main(String[] args) throws Exception {
        MetodoOrdenamiento ordenar = new MetodoOrdenamiento();
        int[] arreglo = {32, 3, 4, 16};
        int[] arregloInsercion = ordenar.sortInsercion(arreglo, false);
        ordenar.printInsercion(arregloInsercion);
    }
}
