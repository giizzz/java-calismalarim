import java.util.Scanner;
public class odevler {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int sec,sayi1,sayi2,tercih;
        do {
            System.out.println("İşlem yapacağınız işlemi seçiniz");
            System.out.println("1--TOPLAMA");
            System.out.println("2--ÇIKARMA");
            System.out.println("3--ÇARPMA");
            System.out.println("4--BÖLME");
            System.out.print("Hangi işlemi yapmak istersiniz->");
            sec = inp.nextInt();
            switch(sec) {
                case 1:
                System.out.print("1. sayıyı giriniz-> ");
                sayi1 = inp.nextInt();
                System.out.print("2. sayıyı giriniz-> ");
                sayi2 = inp.nextInt();
                System.out.println("Sayilarin toplami = " + (sayi1 + sayi2));
                break;
                case 2:
                    System.out.print("1. sayıyı giriniz-> ");
                    sayi1 = inp.nextInt();
                    System.out.print("2. sayıyı giriniz-> ");
                    sayi2 = inp.nextInt();
                    System.out.println("Sayilarin farkı = " + (sayi1 - sayi2));
                    break;
                case 3:
                    System.out.print("1. sayıyı giriniz-> ");
                    sayi1 = inp.nextInt();
                    System.out.print("2. sayıyı giriniz-> ");
                    sayi2 = inp.nextInt();
                    System.out.println("Sayilarin carpımı = " + (sayi1 * sayi2));
                    break;
                case 4:
                    System.out.print("1. sayıyı giriniz-> ");
                    sayi1 = inp.nextInt();
                    System.out.print("2. sayıyı giriniz-> ");
                    sayi2 = inp.nextInt();
                    System.out.println("Sayilarin bölümü = " + (double) (sayi1) / sayi2);
                    break;
                default:
                    System.out.println("Hatali girdi!..");
            }
            System.out.println("Devam? 1 evet 2 hayır");
            tercih = inp.nextInt();
        }while(tercih==1);
    }
}
//kod aslında hatalıdır metodlar kısmında tekrar üstüne düşülecek sebebi aynı kodların tekrar tekrar yazılmasıdır
