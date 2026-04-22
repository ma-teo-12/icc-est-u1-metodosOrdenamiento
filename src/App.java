public class App {
    public static void main(String[] args) throws Exception {
        
        metodoBurbuja();
        MetodoBurbujaAvanzado();
        runMetodoSeleccion();

         
    }
    public static void runMetodoSeleccion() {

        MetodoSeleccion mSeleccion = new MetodoSeleccion();
        int[] arr = new int[]{1, 10, 7, 9, 0, 1, 3, 4};
        mSeleccion.printArreglo(arr);
        mSeleccion.sort(arr);
        mSeleccion.printArreglo(arr);
        mSeleccion.sortDes(arr);
        mSeleccion.printArreglo(arr);

        
    }
    public static void metodoBurbuja(){

        System.out.println("METODO BURBUJA");

        int[] arreglo = new int[] {10, -5, 0, 2, 7};
        MetodoBurbuja metodoBurbuja = new MetodoBurbuja(arreglo);
        metodoBurbuja.ImprimirArreglo();
        metodoBurbuja.OrdenarAcendente();
        metodoBurbuja.ImprimirArreglo();
        metodoBurbuja.OrdenarDescendente();
        metodoBurbuja.ImprimirArreglo();   
    }
    public static void MetodoBurbujaAvanzado() {

        System.out.println("METODO BURBUJA AVANZADO");
        //instanciar la clase
        int[] arreglo = new int[] {50, 5, 20, 0, -10, 15};

        MetodoBurbujaAvanzado burbujaAsc = new MetodoBurbujaAvanzado(arreglo);
        MetodoBurbujaAvanzado burbujaDesc = new MetodoBurbujaAvanzado(arreglo);

        System.out.println("Ascendente:");
        burbujaAsc.sort(true);
        burbujaAsc.printArreglo();

        System.out.println("Descendente:");
        burbujaDesc.sort(false);
        burbujaDesc.printArreglo();
    }
}
