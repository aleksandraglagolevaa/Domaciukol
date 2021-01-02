package glagoleva;


public final class PiskvorkyTools {

    private PiskvorkyTools() {}
    
    /**
     * 
     * @param a
     * @param r
     * @param s
     * @return 
     */
    public static int pocetStejnychVRadkuOdDanePozice(int[][] a, int r, int s) {
        int cislo = a[r][s];
        int pocet = 1;
        
        for (int i = s-1; i >= 0; i--) {
            if (a[r][i] == cislo) {
                pocet++;
            }
            else break;
        }
      
        for (int i = s+1; i <= a[r].length - 1; i++) {
            if (a[r][i] == cislo) {
                pocet++;
            }
            else break;
        } 
        return pocet;
    }
    
    public static int pocetStejnychVSloupciOdDanePozice(int[][] a, int r, int s) {
        int cislo = a[r][s];
        int pocet = 1;
     
        for (int i = r-1; i >= 0; i--) {
            if (a[i][s] == cislo) {
                pocet++;
            }
            else break;
        }
       
        for (int i = r+1; i <= a.length - 1; i++) {
            if (a[i][s] == cislo) {
                pocet++;
            }
            else break;
        } 
        return pocet;
    }
    
    public static int pocetStejnychVDiag1OdDanePozice(int[][] a, int r, int s) {
        int cislo = a[r][s];
        int pocet = 1;
        int i = r - 1;
        int j = s - 1;
        
        while (i >= 0 && j >= 0) {
            if (a[i][j] == cislo) pocet++;
            else break;
            i--;
            j--;
        }
        
        i = r + 1;
        j = s + 1;
        while (i < a.length && j < a[r].length) {
            if (a[i][j] == cislo) pocet++;
            else break;
            i++;
            j++;
        }
        return pocet;
    }
    
    public static int pocetStejnychVDiag2OdDanePozice(int[][] a, int r, int s) {
        int cislo = a[r][s];
        int pocet = 1;
        int i = r+1;
        int j = s-1;
        // vlevo dolu
        while (i < a.length && j >= 0) {
            if (a[i][j] == cislo) pocet++;
            else break;
            i++;
            j--;
        }
        // vpravo nahoru
        i = r-1;
        j = s+1;
        while (i >= 0 && j < a[r].length) {
            if (a[i][j] == cislo) pocet++;
            else break;
            i--;
            j++;
        }
        return pocet;
    }
}
