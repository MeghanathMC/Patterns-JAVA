
/*
 *pattern-3
 *****
 *****
 *****
 *****
 *****
 */
public class pattern3 {

    public static void main(String[] args) {
        int n = 5; // size of pyramid
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}