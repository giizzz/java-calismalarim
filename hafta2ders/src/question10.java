public class question10 {
    public static void main(String[] args) {
        // A
        for(int i=0;i<10;i++){
            for(int j=0;j<i+1;j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();
        // B
        for(int i=0;i<10;i++){
            for(int j=i;j<10;j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();
        // C
        for(int i=0;i<10;i++){
            for(int j=10;j>i;j--)
                System.out.print("*");
            System.out.println();
        }
        // D
    }
}
