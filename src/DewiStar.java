
public class DewiStar {

    public static void main(String[] args) {
        for (int baris = 1; baris <=7;baris++) 
        {
            for (int kolom = 1;kolom <=27; kolom++)
            { 
                
                if (baris == 1 && kolom >= 1 && kolom <=3 || baris == 1 && kolom >= 8 && kolom <= 11 || baris == 1 && kolom == 14 || baris == 1 && kolom == 20 || baris == 1 && kolom >=23 && kolom <= 27)
                {
                    System.out.print("*");
                } else if (baris == 2 && kolom == 1 || baris == 2 && kolom == 4 || baris == 2 && kolom == 8 || baris == 2 && kolom == 14 || baris == 2 && kolom == 20 || baris == 2 && kolom == 25)
                {
                    System.out.print("*");
                } else if (baris == 3 && kolom == 1 || baris == 3 && kolom == 5 || baris == 3 && kolom == 8 || baris == 3 && kolom == 14 || baris == 3 && kolom == 20 || baris == 3 && kolom == 25 )
                {
                    System.out.print("*");
                } else if ( baris == 4 && kolom == 1 || baris == 4 && kolom == 5 || baris == 4 && kolom >= 8 && kolom <= 11 || baris == 4 && kolom == 14 || baris == 4 && kolom == 20 || baris == 4 && kolom == 25)
                {
                    System.out.print("*");
                } else if (baris == 5 && kolom == 1 || baris == 5 && kolom == 5 || baris == 5 && kolom == 8 || baris == 5 && kolom == 14 || baris == 5 && kolom == 17 || baris == 5 && kolom == 20 || baris == 5 && kolom == 25)
                {
                    System.out.print("*");
                } else if (baris == 6 && kolom == 1 || baris == 6 && kolom == 4 || baris == 6 && kolom == 8 || baris == 6 && kolom == 14 || baris == 6 && kolom == 17 || baris == 6 && kolom == 20 || baris == 6 && kolom == 25 )
                {
                    System.out.print("*");
                } else if (baris == 7 && kolom >= 1 && kolom <= 3 || baris == 7 && kolom >= 8 && kolom <= 12 || baris == 7 && kolom >= 14 && kolom <= 20 || baris == 7 && kolom >= 23 && kolom <= 27)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
