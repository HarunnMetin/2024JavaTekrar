package Constructor;

public class Constructor {


    public int intValue = 1234;
    public String stringValue = "basaracagim";
    public Constructor(){

        int value = this.intValue;
        System.out.println(value);

    }
    public Constructor(int intValue , String stringValue){

        System.out.println("basarinin sirii pratik yapmaktir");

    }

    public static void main(String[] args) {

        //Bir sınıf içinde parametresiz bir constructor oluşturun.
        //Bu constructor, sınıfın özelliklerini belirli bir başlangıç değerine ayarlamalıdır

        Constructor constructor = new Constructor(2,"str");
        System.out.println(constructor);


    }

}
