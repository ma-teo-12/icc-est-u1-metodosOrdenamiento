public class App {
    public static void main(String[] args) throws Exception {
        
        metodoBurbuja();

         
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
}
