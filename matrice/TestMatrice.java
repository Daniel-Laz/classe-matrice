package matrice;
public class TestMatrice{
  public static void main(String[] args){
    int[][] x = {{1,2,3},{4,5,6},{7,8,9}};
    int[][] y = {{1,2,3},{4,5,6},{7,8,9}};
    System.out.println(Matrice.somma(x));
    System.out.println(Matrice.nullo(x));
    System.out.println(Matrice.nulli(x));
    System.out.println(Matrice.max(x));
    System.out.println(Matrice.sommaCornice(x)); // mancante
    System.out.println(Matrice.diagonali(x));
    System.out.println(Matrice.uguali(x));
    System.out.println(Matrice.crescente(x));
    System.out.println(Matrice.uguali(x,y));
    int[][] MatriceSomma=Matrice.somma(x,y);
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x[i].length; j++) {
        System.out.print(MatriceSomma[i][j]+" ");
      }
      System.out.println("");
    }
  }
}