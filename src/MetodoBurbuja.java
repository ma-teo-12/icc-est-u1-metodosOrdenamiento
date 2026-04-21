public class MetodoBurbuja {

    int[] arreglo;

    //constructor vacio
    public MetodoBurbuja(int [] arreglo){

        System.out.println(" se creo la clase met burbuja ");

        //primera forma
         //instanciar con valor creado en constructor
        // this.arreglo = new int[]{10,5 ,8 , 0 , 7};
         //segunda forma
          //instanciar con valor desde parametro
        this.arreglo = arreglo;
        
        }
        public void OrdenarAcendente() {
            
            for (int i = 0 ; i < arreglo.length; i++){

                for (int j = i+1; j < arreglo.length; j++){

                    if ( arreglo [i] > arreglo[j]){
                        
                        int auxi = arreglo[i];
                        arreglo[i]= arreglo[j];
                        arreglo[j] = auxi;
                        
                    }
                }
            }
        }
        
        public void OrdenarDescendente(){
            for (int i = 0; i< arreglo.length; i++){
                for(int j = i+1; j < arreglo.length; j++){
                    //Comparación
                    if(arreglo[i] < arreglo[j]){
                        // Sí se cumple -> intercambio
                        int aux = arreglo[i];
                        arreglo[i] = arreglo[j];
                        arreglo[j] = aux;
                    }
                }
            }
        }

        
        public void ImprimirArreglo(){

            for (int num : arreglo) {
                
                System.out.print(num + ", ");

            }
            System.out.println();
        }
        
}
