public class Hafta3Ders3 {
    public static void main(String[] args) {
        int[] not1={50,60,80,85,99,100};
        int[] not2={5,10,15,20,25,30};
        int[] not3=new int[6];
        for(int i=0;i<not1.length;i++)
            not3[i]=not1[i]+not2[i];
        for(int i=0;i<not3.length;i++)
            System.out.println(not3[i]);
 

    }
}
