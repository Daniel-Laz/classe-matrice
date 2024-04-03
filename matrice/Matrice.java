package matrice;
public class Matrice{

  public static int somma(int[][] x) {
    int somma = 0;
    for (int i = 0; i < x.length; i++) {
        for (int j = 0; j < x[i].length; j++) {
            somma += x[i][j];
        }
    }
    return somma;
  }

  public static boolean nullo(int[][] x) {
    for (int i = 0; i < x.length; i++) {
        for (int j = 0; j < x[i].length; j++) {
            if (x[i][j] == 0) {
                return true;
            }
        }
    }
    return false;
  }

  public static boolean nulli(int[][] x) {
    for (int i = 0; i < x.length; i++) {
        for (int j = 0; j < x[i].length; j++) {
            if (x[i][j] != 0) {
                return false;
            }
        }
    }
    return true;
  }

  public static int max(int[][] x) {
    int max = x[0][0];
    for (int i = 0; i < x.length; i++) {
        for (int j = 0; j < x[i].length; j++) {
            if (x[i][j] > max)
              max = x[i][j];
        }
    }
    return max;
  }

  public static int sommaCornice(int[][] x) {
    //non sono riuscito
      return -1;
  }

  public static boolean diagonali(int[][] x) {
    int digonalePrinc = 0;
    int diagonaleSec = 0;
    for (int i = 0; i < x.length; i++) {
      digonalePrinc += x[i][i];
      diagonaleSec += x[i][x.length - 1 - i];
    }
    if (digonalePrinc == diagonaleSec)
      return true;
    else
      return false;
  }

  public static boolean uguali(int[][] x) {
    for (int i = 0; i < x.length; i++) {
        for (int j = 0; j < x[i].length; j++) {
            if (x[i][j] != x[0][0]) {
                return false;
            }
        }
    }
    return true;
  }

  public static boolean crescente(int[][] x) {
    for (int i = 0; i < x.length - 1; i++) {
        for (int j = 0; j < x[i].length - 1; j++) {
            if (x[i][j] > x[i + 1][j + 1]) {
                return false;
            }
        }
    }
    return true;
  }

  public static boolean uguali(int[][] x, int[][] y) {
    for (int i = 0; i < x.length; i++) {
        for (int j = 0; j < x[i].length; j++) {
            if (x[i][j] != y[i][j]) {
                return false;
            }
        }
    }
    return true;
  }

  public static int[][] somma(int[][] x, int[][] y) {
    int[][] z = new int[x.length][x[0].length];
    for (int i = 0; i < x.length; i++) {
        for (int j = 0; j < x[i].length; j++) {
            z[i][j] = x[i][j] + y[i][j];
        }
    }
    return z;
  }
}