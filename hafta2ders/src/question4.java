public class question4 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if(i%2 == 0) {
                for (int j = 1; j < 17; j++) {
                    if (j % 2 != 0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
            else{
                for(int k=1;k<17;k++){
                        if (k % 2 != 0)
                            System.out.print(" ");
                        else
                            System.out.print("*");
                }
                System.out.println();

            }
        }
    }
}
