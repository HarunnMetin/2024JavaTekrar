package ForLoop;

public class Soru_2 {

    public static void main(String[] args) {

        //Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
        //dahil) 7 ila bolunebilen sayilari yazdirin.

        int girilenSayi = 89;

        for (int i = 1; i <=girilenSayi ; i++) {
            if (i % 7 == 0){
                System.out.println(i);
            }
        }
    }
}
