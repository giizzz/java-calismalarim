public class question9 {
    public static void main(String[] args) {
        int carpim=1;
        for(int i=1;i<15;i++)
            if(i%2!=0)
                carpim*=i;
        System.out.println(carpim);
    }
}
