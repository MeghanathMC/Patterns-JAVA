public class pattern15 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            char let=(int)65;
            for(int j=1;j<=i;j++){

                System.out.print(let+ " ");
                let++;

            }
            System.out.println();
        }
    }
}
