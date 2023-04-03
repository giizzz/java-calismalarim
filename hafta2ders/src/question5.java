import java.util.Scanner;
public class question5 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.print("1.kenar->");
        a= input.nextDouble();
        System.out.print("2.kenar->");
        b= input.nextDouble();
        System.out.print("3.kenar->");
        c= input.nextDouble();
        if((a+b)>c && (a+c)>b && (c+b)>a){
            System.out.println("Ucgendir");
        }
        else System.out.println("Ucgen degildir");

    }
}
