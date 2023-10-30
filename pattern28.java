/*
 
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *
 */
public class pattern28 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<2*n;i++){
            int noOfSpaces=n-i;
            for(int s=0;s<noOfSpaces;s++){
                System.out.print(" ");
            }
            if((i>=1 && i<=n)){
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
        }


        else{
            int noOfSpaces2=i-n;
                for(int s1=0;s1<noOfSpaces2;s1++){
                    System.out.print(" ");
                    
                }
            for(int j=1;j<=(2*n)-i;j++){
                
                System.out.print("* ");
            }
            System.out.println();
    }
}
    }
}
