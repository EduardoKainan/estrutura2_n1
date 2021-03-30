package teste.src;

public class QuickSort {

  static int comparacoes = 0;
  static int trocas = 0;
  static int vetor[];
  

     
  public static Resultados sort(int[] v, int inicio, int fim) {
    int i = inicio;
    int j = fim;
    int pivo = v[(inicio + fim)/2];

    while(i <= j) {
          comparacoes++;
        if(v[i] < pivo){
            i++;
        }else{
              comparacoes++;
            if(v[j] > pivo){
                j--;
            }else {
                    comparacoes++;
                if(i <= j) {
                        trocas++;
                    trocar(v,i,j);
                    i++;
                    j--;
                }
            }
        }
    }

    if(inicio < j)
        sort(v, inicio, j);

    if(i < fim)
        sort(v, i, fim);

//       System.out.println("Tempo total: "+(System.currentTimeMillis() - timeInicio) +" MS");
   return new Resultados(v, trocas, comparacoes);
}

 private static void trocar(int[] v, int i, int j) {
     int aux = v[i];
     v[i] = v[j];
     v[j] =  aux;
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
