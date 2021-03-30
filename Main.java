package teste.src;

public class Main {

  public static void main(String [] args) {
   

    Resultados resultados;
    
    //long tempoIni = System.currentTimeMillis();
    //System.out.println("-- 10 mil--");
    //long tempoFin=System.currentTimeMillis();
    
   // System.out.println("Executado em ="+(tempoFin-tempoIni)+"ms");
    //System.out.println("Trocas="+resultados.getTrocas());
    //System.out.println("Comparações ="+resultados.getComparacoes());



   //long tempoIn = System.currentTimeMillis();
   //System.out.println("-- 100 mil--");
    //resultados = MergeSort.mergeSort(MergeSort.criaVetorRandomico(100000));
   //long tempoFi=System.currentTimeMillis();
   
   //System.out.println("Executado em ="+(tempoFi-tempoIn)+"ms");
   //System.out.println("Trocas="+resultados.getTrocas());
   //System.out.println("Comparações ="+resultados.getComparacoes());

//   long tempoInicio = System.currentTimeMillis();
  // System.out.println("-- 1 milhão --");
    //resultados = MergeSort.mergeSort(MergeSort.criaVetorRandomico(1000000));
   //long tempoFinal=System.currentTimeMillis();
   
  // System.out.println("Executado em ="+(tempoFinal-tempoInicio)+"ms");
   //System.out.println("Trocas="+resultados.getTrocas());
   //System.out.println("Comparações ="+resultados.getComparacoes());

   System.out.println("Resultados QuickSort");
     

   long tempoIni = System.currentTimeMillis();
   System.out.println("-- 10 mil--");
   resultados = QuickSort.sort(QuickSort.criaVetorOrdenado(10000), 0, 9999);
   long tempoFin=System.currentTimeMillis();
   System.out.println("Executado em ="+(tempoFin-tempoIni)+"ms");
   System.out.println("Trocas="+resultados.getTrocas());
   System.out.println("Comparações ="+resultados.getComparacoes());

   long tempoIn = System.currentTimeMillis();
   System.out.println("-- 100 mil--");
   resultados = QuickSort.sort(QuickSort.criaVetorOrdenado(100000), 0, 99999);
   long tempoFi=System.currentTimeMillis();
   System.out.println("Executado em ="+(tempoFi-tempoIn)+"ms");
   System.out.println("Trocas="+resultados.getTrocas());
   System.out.println("Comparações ="+resultados.getComparacoes());


   long tempoInicio = System.currentTimeMillis();
   System.out.println("-- 1 millhão --");
   resultados = QuickSort.sort(QuickSort.criaVetorOrdenado(1000000), 0, 999999);
   long tempoFinal=System.currentTimeMillis();
   System.out.println("Executado em ="+(tempoFinal-tempoInicio)+"ms");
   System.out.println("Trocas="+resultados.getTrocas());
   System.out.println("Comparações ="+resultados.getComparacoes());
  }
  
}
