public class App {
    public static void main(String[] args) throws Exception {
        
        metodoBurbuja();
        MetodoBurbujaAvanzado();

         
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
