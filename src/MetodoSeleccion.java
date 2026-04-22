public class MetodoSeleccion {
    
    public int arr;

    public void runMetodoSeleccion(int[] arr) {

        this.arr = arr;
        
    }

    public void sort(int[] arr) {

        int n = arr.length;

        for( int i =0; i < n -1; i++ ){

            int indiceDeMenor = i;
            for ( int j=i +1; j < n ; j++){

                if (arr[indiceDeMenor] > arr[j]){

                    indiceDeMenor = j;
                }
            }
            if (i != indiceDeMenor){
                int aux =arr [i];
                arr [i] = arr [indiceDeMenor];
                arr [indiceDeMenor] = aux;
            }
        }
    }

    public void printArreglo(){

        for (int num : arr) {
                
            System.out.print(num  + ", ");

        }
        System.out.println();
    }
    
        
}