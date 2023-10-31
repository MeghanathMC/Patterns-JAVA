public class pattern19 {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            //to print spaces
            for(int s=1;s<n-i;s++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print((char)((int)('A'+j))+"");
            }
            for(int k=i-1;k>=1;k--){
                System.out.print((char)(int)('A'+k)+"");
            }
             System.out.println();
       
    }
    }
    
}
