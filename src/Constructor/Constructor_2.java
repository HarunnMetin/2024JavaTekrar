package Constructor;

public class Constructor_2 {

    private int sayi = 12;
    private String deger = "";

    public Constructor_2(){

        this.deger = "hayal kur";
        System.out.println("pes etmezsen basaracaksin bunu unutma === " +this.deger);
    }
    public Constructor_2(int sayi , String deger){
        this();
        this.deger = "11";
        System.out.println("kendime inaniyorum");
        System.out.println("== "+sayi*sayi);
    }
    public int getSayi(){
        return sayi;
    }
    public String getDeger(){
        return deger;
    }

    public static void main(String[] args) {

        Constructor_2 constructor2 = new Constructor_2();

        System.out.println(constructor2.getDeger());
        System.out.println("*************************");
        System.out.println(constructor2.getSayi());
        System.out.println("*************************");
        Constructor_2 constructor_2 = new Constructor_2(2,"22");

    }
}
