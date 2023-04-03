import java.util.Scanner;
public class Homework2 { // Asal kontrol
    public static void main(String[] args) {
        int sayi;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi giriniz->");
        sayi = inp.nextInt();
        boolean b= false;
        for(int i=2;i<=sayi/2;i++){
            if(sayi%i==0)
                b=true;
                break;
        }
        if(b)
            System.out.println("Asal degil");
        else
            System.out.println("Asal");
    }
}
