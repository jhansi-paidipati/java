class pat4{
    public static void main(String args[]){
        int i;
        int j;
        int n=4;
        int m=4;
        for(i=n;i>=1;i--){
            for(j=1;j>=i;j++)
            {
                System.out.print("*");

            }
            System.out.print("\n");
        }

    }
}