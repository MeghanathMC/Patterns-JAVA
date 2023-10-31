public class pattern14 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
           
                if(i%2==0){
                     for(int j=0;j<=i;j++){
                        System.out.print(j+ " ");

                }
                System.out.println();
                else{
                for(int k=1;k<=i;k++){
                    System.out.print(k+ " ");
                }
                System.out.println();
            }

        }
    }
}
    
}
