package teste.src;

public class Resultados {

  private int [] vetor;
  private int trocas;
  private int comparacoes;

  
  public Resultados(int[] vetor, int trocas, int comparacoes) {
    this.vetor = vetor;
    this.trocas = trocas;
    this.comparacoes = comparacoes;
  }


  public int[] getVetor() {
    return vetor;
  }


  public void setVetor(int[] vetor) {
    this.vetor = vetor;
  }


  public int getTrocas() {
    return trocas;
  }


  public void setTrocas(int trocas) {
    this.trocas = trocas;
  }


  public int getComparacoes() {
    return comparacoes;
  }


  public void setComparacoes(int comparacoes) {
    this.comparacoes = comparacoes;
  }

  
  
}
