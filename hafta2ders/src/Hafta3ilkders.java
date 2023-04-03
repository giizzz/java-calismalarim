public class Hafta3ilkders {
    public static void main(String[] args) {
        String str,str2,str3;
        str = " Bir berbr bir berbere gel beraber bir berbr dükkanı açalım demiş ";
        str2= "Başarının yolu, konuşmayı bırakmak ve yapmaya başlamaktır.";
        str3=str2.substring(16);//alt stringi demek bu metod 16 dersek 10 dan başla sonuna kadar git ve al demek ve bunu str3 e atar
        int suzunluk;
        System.out.println(str.replace("berbr","berber"));
        System.out.println(str.replace(" ",""));//boşlukları silmek için
        System.out.println(str.replaceAll("([a-z])",""));//regex kısmının açıklaması: küçük a dan z ye kadar olan sayıları al demek ascii koduna goredir türkçe karakterler desteklenmez. kalıp->([])
        System.out.println(str.trim());//başındaki ve sonundaki boşlukları atar
        System.out.println(str3);
        str3=str2.substring(10,13);//10dan 13 e kadar olanı alıp alt bir string oluşturur 13. yü almaz
        System.out.println(str3);
        suzunluk=str2.length();//int bir değere atamam gerekir
        //System.out.println(suzunluk);
        System.out.println(str2.substring(10,58));//eğer 10 dan sona kadar alınmasını istersek ilk önce uzunluk bilinmeli
    }
}
