package teste.src;

public class SelectionSort {  

  public static void main(String[] args){

       System.out.println("-- 1 milhao--");
       long tempoIn = System.currentTimeMillis();
    selectionSort(criaVetorRandomico(1000000));
      long tempoFi=System.currentTimeMillis();      
      System.out.println("Executado em ="+(tempoFi-tempoIn)+"ms");

      long tempoInicial = System.currentTimeMillis();
      System.out.println("-- 100 mil--");
    selectionSort(criaVetorRandomico(100000));
      long tempoFinal=System.currentTimeMillis();      
      System.out.println("Executado em ="+(tempoFinal-tempoInicial)+"ms");

      long tempoIni = System.currentTimeMillis();
      System.out.println("-- 10 mil--");
    selectionSort(criaVetorRandomico(10000));
      long tempoFin=System.currentTimeMillis();
      
      System.out.println("Executado em ="+(tempoIni-tempoFin)+"ms");
      


  }


  public static void selectionSort(int vetorS[]){

    int i, j, min, comparacoes = 0, trocas =0;

    for(i=0;i<vetorS.length-1; i++){
      min=i;

      for(j=i+1;j<vetorS.length; j++){
         
        comparacoes++;
        if(vetorS[j]<vetorS[min]){
            min = j;
      
        }
      }
      int aux = vetorS[i];
      vetorS[i] =vetorS[min];
      vetorS[min] = aux;
          trocas ++;
    }

      System.out.println("trocas: "+ trocas);
      System.out.println("Comparações: "+comparacoes);

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