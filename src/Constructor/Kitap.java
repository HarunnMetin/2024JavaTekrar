package Constructor;

public class Kitap {

    /*
    Bir "Kitap" sınıfı tasarlayın. Bu sınıfın özellikleri şunlar olsun: kitapAdi, yazarAdi,
    sayfaSayisi ve yayinYili. Parametresiz bir constructor kullanarak, bu özellikleri mantıklı
    başlangıç değerleriyle başlatan bir sınıf tasarlayınız. Ayrıca, bu sınıfa ait özellikleri ekrana
    yazdıran bir metot ekleyiniz.
     */

    private String kitapAdi;
    private String yazarAdi;
    private int sayfaSayisi;
    private int yayinYili;

    public Kitap(){

        this.kitapAdi = "Asla pes etme";
        this.yazarAdi = "Kinsun";
        this.sayfaSayisi = 255;
        this.yayinYili = 2022;

    }
    public void kitap(){

        System.out.println(this.kitapAdi);
        System.out.println(this.yazarAdi);
        System.out.println(this.sayfaSayisi);
        System.out.println(this.yayinYili);
    }

    public static void main(String[] args) {

        Kitap kitap = new Kitap();
        kitap.kitap();
    }
}
