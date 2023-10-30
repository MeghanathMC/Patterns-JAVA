/*
 pattern-5
 *
 * *
 * * *
 * * * *
 * * *
 * *
 * 
 
 */
public class pattern5 {
    public static void main(String[] args) {
        int n = 5; // size of the pyramid
        for(int i=1;i<2*n;i++){
            int colsInRow=i>n ? (2*n)-i : i;
            for(int j=1;j<=colsInRow;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    
}
