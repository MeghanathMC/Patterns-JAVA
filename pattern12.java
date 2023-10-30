public class pattern12 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            if(i>=1 && i<=5){
                //to print 1st set of spaces
                 for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<=n;k++){
                System.out.println("* ");

            }

            }
        }
            else{
                for (int p = 0; p < n; p++) {
                    // Print leading spaces
                    for (int m = 0; m < n - 1 - p; m++) {
                        System.out.print(" ");
                    }
        
                    // Print asterisks
                    for (int t= 0; t <= p; t++) {
                        System.out.print("* ");
                    }
        
                    System.out.println(); // Move to the next line
                }
            }
        }
            }

