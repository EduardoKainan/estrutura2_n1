package teste.src;

public class BubleSort {

  public static void main(String[] args){
    
      long tempoInicial = System.currentTimeMillis();

      bubleSort(criaVetorRandomico(1000000));


      long tempoFinal=System.currentTimeMillis();
      
      System.out.println("Executado em ="+(tempoFinal-tempoInicial)+"ms");
      
  }

  public static void bubleSort(int []vetor){


      int i, j, aux, comparacao=0, trocas=0;

      for(j=0; j < vetor.length; j++){
        for(i=0; i<vetor.length-1; i++){
            comparacao++;
          if(vetor[i]>vetor[i+1]){
            aux = vetor[i+1];
            vetor[i]=vetor[i+1];
            vetor[i+1] = aux;
            trocas++;
          }
        }
      }
      //printarVetor(vetor);
      System.out.println("Quantidade de trocas realizadas:"+trocas);
      System.out.println("Quantidade de comparacao realizadas: "+comparacao);

    }

  public static void printarVetor(int vetor[]){
    System.out.println("vetor[");
      for(int i=0;i<vetor.length;i++){
        System.out.println(vetor[i]+" ");
      }

      System.out.println("];");
        System.out.println("");
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
    int aux;
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
