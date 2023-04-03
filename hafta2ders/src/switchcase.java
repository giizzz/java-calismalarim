import java.util.Scanner;
public class switchcase {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int gun;
        System.out.print("Sayi giriniz->");
        gun=input.nextInt();

        switch(gun){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Haftanın böyle bir günü yok");
                    /* if(gun<1 || gun>7){
                    System.out.println("Hata! 1 ve 7 arasında sayilar girilmeli"); }*/


        }

    }
}
