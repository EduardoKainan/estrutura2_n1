package teste.src;
  


  public class ShellSort{

    static int comparacoes =0;
    static int trocas =0;


    public static void main(String[] args) {
      
      System.out.println("-- 1 milhao-SHELLSORT-");
      long tempoIn = System.currentTimeMillis();
   sort(criaVetorOrdenado(1000000));
     long tempoFi=System.currentTimeMillis();      
     System.out.println("Executado em ="+(tempoFi-tempoIn)+"ms");
     System.out.println("Trocas em ="+trocas);
     System.out.println(" Comparações="+comparacoes);

     long tempoInicial = System.currentTimeMillis();
     System.out.println("-- 100 mil- SHELLSORT-");
   sort(criaVetorOrdenado(100000));
     long tempoFinal=System.currentTimeMillis();      
     System.out.println("Executado em ="+(tempoFinal-tempoInicial)+"ms");
     System.out.println("Trocas em ="+trocas);
     System.out.println(" Comparações="+comparacoes);

     long tempoIni = System.currentTimeMillis();
     System.out.println("-- 10 mil SHELLSORT--");
   sort(criaVetorOrdenado(10000));
     long tempoFin=System.currentTimeMillis();
     
     System.out.println("Executado em ="+(tempoIni-tempoFin)+"ms");
     System.out.println("Trocas em ="+trocas);
     System.out.println(" Comparações="+comparacoes);


     


     
    }
    public static void shellSort(int vetor[]){

        int vetorOrdenado[] = sort(vetor);

    }
   

    public static int[] sort(int vetor[]) {
         int h = vetor.length / 2;
         int key, j, i;

        comparacoes++;
         while(h > 0) {
             for(i = h; i < vetor.length; i++) {
                 key = vetor[i];
                 j = i;

                 comparacoes++;
                 while(j >= h && vetor[j - h] > key) {
                    vetor[j] = vetor[j - h];
                    j = j - h;
                 }
                 vetor[j] = key;
                 trocas++;
             }
             h = h / 2;
         }
         return vetor;
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
  


