public class stringler {
    public static void main(String[] args) {
        String st1 = "Merhaba java"+ " Birleştime";
        int a;
        a=st1.length();
        System.out.println(a);
        System.out.println(st1);
        System.out.println(st1.length());
        System.out.println(st1.toUpperCase());
        System.out.println(st1+" Java öğrenmek kolay değil");

        String st2,st3,st4,st5,st6;
        st2 =" Nesneye ";
        st3 =" Yönelik";
        st4 = st2+st3;// metod olarak kullanılırsa concatile yapılır birleştirme işlemi
        st4 = st1.concat(st3);
        System.out.println(st4);
        st5 = "Garip ";
        st6 = st5.concat(st4).concat(st3).toUpperCase();
        System.out.println(st6);
        System.out.println(st5.indexOf('G')); // metinde olmayan değer varsa -1 döndü bulduğu ilk G harfini dödürüyor
        System.out.println(st2.charAt(3));// atama yapacak isen char mı int mi atadığın değer önemli
        System.out.println(st3.compareTo(st2));//sonuç 0 ise aynı demektir ama sayi 11 iken mesela farklı demektir   comparetoignorecase dersek büyük küçük harf önemsenmez
        System.out.println(st3.contains("ön"));//boolean bir değer döndürür
        System.out.println(st2.replaceAll("Ne","AB"));


    }
}
