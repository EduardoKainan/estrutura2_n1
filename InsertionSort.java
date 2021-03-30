package teste.src;

public class InsertionSort{
  
  public static void main(String[] args){
  
      long tempoInicial = System.currentTimeMillis();

      int vetor[] = criaVetorOrdenado(10000);

      int i;
      int key;
      int j;
      int trocas = 0;
      int comparações = 0;
  
  
      for( j = 1; j < vetor.length; j++){
  
        key = vetor[j];
  
        i = j-1;
          comparações++;
  
          while(i >=0 && vetor[i]>key){
  
            vetor[i+1] = vetor[i];
             i--; 
             trocas++;
          }
            vetor[i+1] = key;
             trocas++;
          }
          //printarVetor(vetor);
         
  
         
      long tempoFinal=System.currentTimeMillis();
      
      System.out.println("Executado em ="+(tempoFinal-tempoInicial)+"ms");
      System.out.println("Quantidade de trocas realizadas:"+trocas);
         System.out.println("Quantidade de comparações realizadas:"+comparações);
      //System.out.println(tempoFinal-tempoInicial);
      
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
  
    for( i = 0; i<vetor.length;i++){
     
     vetor[i] = (int)(Math.random()*quantidade);
      
  
    }
  
    return vetor;
  }

    

    }




