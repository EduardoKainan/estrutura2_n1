package teste.src;

public class MergeSort {

  static int comparacoes = 0;
  static int trocas = 0;
  

  public static Resultados mergeSort(int vetor[]){
   
    sort(vetor, 0, vetor.length - 1);

    return new Resultados (vetor, trocas, comparacoes); 

  }

  public static void sort(int vetor[], int inicio, int fim) {
    
    if(inicio < fim) {

          int meio = (inicio + fim) / 2;
          sort(vetor, inicio, meio); 
          sort(vetor, meio + 1, fim);
          merge(vetor, inicio, meio, fim);
          
      }    

  }

  public static void merge(int vetor[], int inicio, int meio, int fim) {

      int secundario[] = new int[vetor.length];

      for(int k = inicio; k <= fim; k++) {
          secundario[k] = vetor[k];
      }
      int indiceEsquerdo = inicio;
      int indiceDireito = meio+1;

      for(int k = inicio; k <= fim; k++) {
          
          comparacoes++;
        if(indiceEsquerdo > meio) {
            vetor[k] = secundario[indiceDireito++];
            trocas++;

        }else{
            comparacoes++;
          if(indiceDireito > fim){
            vetor[k] = secundario[indiceEsquerdo++];
            trocas++;
          }else{
                comparacoes++;
                if(secundario[indiceEsquerdo] < secundario[indiceDireito]){
                  vetor[k] = secundario[indiceEsquerdo++];
                  trocas++;
                }else { 
                  comparacoes++;
                  vetor[k] = secundario[indiceDireito++];
                  trocas++;             
  
        
                }              
             }
          }
       }
     }

  public static void printarVetor(int vetor[]) {
      System.out.print("vetor [ ");
      for(int i = 0; i < vetor.length; i++) {
          System.out.print(vetor[i] + " ");
      }
      System.out.print("]; ");
      System.out.println(" ");
  }

  public static int[] criaVetorOrdenado(int quantidade){

    int vetor[] = new int[quantidade];
    int i;

    for( i= 0; i<vetor.length;i++){
     
     // vetor[i] = (int)(Math.random()*quantidade);
      vetor[i] = i+1;

    }

    return vetor;
  }

  public static int[] criaVetorDescendente(int quantidade){

    int vetor[] = new int[quantidade];
    int i;
    int j=0;

    for( i = vetor.length-1; i >= 0;i--){
     

        vetor[i] = j++;

      }      

    return vetor;
  }

  public static int[] criaVetorRandomico(int quantidade){

    int vetor[] = new int[quantidade];
    int i;

    for( i = vetor.length-1; i>0;i--){
     
     vetor[i] = (int)(Math.random()*quantidade);
      
    }

    return vetor;
  }
   
}

