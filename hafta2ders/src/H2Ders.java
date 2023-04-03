import java.util.Scanner;

public class H2Ders {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String st;
        int yas;
        System.out.print("İsim Giriniz-> ");
        st=input.nextLine();
        System.out.print("Yasınızı giriniz-> ");
        yas = input.nextInt();
        System.out.println("Merhaba "+st+"Yasınız->"+yas);

    }
}



        /*
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Birinci sayiyi giriniz-> ");
        a=input.nextInt();
        System.out.print("İkinci sayiyi giriniz-> ");
        b=input.nextInt();

        System.out.println("Girdiginiz 1. sayi--> "+a+"\t2.sayi--> "+b);
        System.out.println("Sayilarin toplami = "+(a+b));
    }
    */