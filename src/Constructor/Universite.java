package Constructor;

import java.util.ArrayList;
import java.util.List;

public class Universite {

    private String universiteAdi ;
    private List<String> ogrenciListesi = new ArrayList<>();
    private List<String> ogretmenListesi = new ArrayList<>();

    public  Universite(){

        this.universiteAdi = "bilinmiyor";
        this.ogrenciListesi = new ArrayList<>();
        this.ogretmenListesi = new ArrayList<>();
    }
    public void universiteBilgileri(){

        System.out.println("universite adi :"+universiteAdi);
        System.out.println("ogrenci listesi :"+ogrenciListesi.size());
        System.out.println("ogretmen listesi :"+ogretmenListesi.size());
    }
    public void ogrenciEkle(Ogrenci ogrenci){

        ogrenciListesi.add(ogrenci.toString());
    }
    public void ogretmenEkle(Ogretmen ogretmen){

        ogretmenListesi.add(ogretmen.toString());
    }

    public static void main(String[] args) {

        Universite universite = new Universite();
        universite.universiteBilgileri();
        universite.ogrenciEkle(new Ogrenci(123,"hamza ters"));
        universite.ogretmenEkle(new Ogretmen(123,"ayse kulin"));
        universite.ogretmenEkle(new Ogretmen(34 ,"burak tas"));
        universite.ogrenciEkle(new Ogrenci(678,"derya yilmaz"));
        universite.universiteBilgileri();



    }
    static class Ogrenci{

        private int ogrenciNo ;
        private String ogrenciAdSoyad;

        public Ogrenci(int ogrenciNo ,String ogrenciAdSoyad){

            this.ogrenciNo = ogrenciNo;
            this.ogrenciAdSoyad = ogrenciAdSoyad;
        }
    }
    static class Ogretmen{

        private int sicilNo ;
        private String ogretmenAdSoyad;

        public Ogretmen(int sicilNo , String ogretmenAdSoyad){

            this.sicilNo = sicilNo;
            this.ogretmenAdSoyad = ogretmenAdSoyad;
        }
    }



}
