import java.util.Scanner;
public class H2ders2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("1. sayiyi giriniz-->");
        a = input.nextInt();
        System.out.print("2. sayiyi giriniz-->");
        b = input.nextInt();
        if(a>b){
            System.out.println(a+" sayisi "+b+" sayisindan buyuktur");
        }
        else if(a<b){
            System.out.println(a+" sayisi "+b+" sayisindan kucuktur");
        }
        else{
            System.out.println("Birbirine eşittirler...");
        }
    }
}
