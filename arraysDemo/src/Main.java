public class Main {

    public static void main(String[] args) {
        String ogrenci1 = "ÜNAL";
        String ogrenci2 = "HAMİ";
        String ogrenci3 = "DEMİR";
        String ogrenci4 = "OGÜN";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-----------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0]="ÜNAL";
        ogrenciler[1]="HAMİ";
        ogrenciler[2]="DEMİR";
        ogrenciler[3]="OGÜN";
        //ogrenciler[4]="ABDULLAH";

        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("-----------------------");

        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

    }
}
