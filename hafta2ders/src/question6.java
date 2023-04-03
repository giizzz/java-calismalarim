import java.util.Scanner;
public class question6 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.print("1.kenar->");
        a= input.nextInt();
        System.out.print("2.kenar->");
        b= input.nextInt();
        System.out.print("3.kenar->");
        c= input.nextInt();
        if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2) || Math.pow(a,2)+Math.pow(c,2)==Math.pow(b,2) ||Math.pow(c,2)+Math.pow(b,2)==Math.pow(a,2) )
            System.out.println("Diktir");
        else
            System.out.println("Dik degildir");
    }
}
