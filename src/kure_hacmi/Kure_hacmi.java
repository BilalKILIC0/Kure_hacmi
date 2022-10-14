// Klavyeden yarıçapı girilen kürenin hacmini veren program.

/*
Adım 1: Başla.
Adım 2: Kullanıcıdan bir değer al.
Adım 3: hacim=(4/3)*pi*(r^3) formülü ile bul.
Adım 4: Bulduğun değeri ekrana yazdır.
Adım 5: Dur.

*/
package kure_hacmi;
import java.util.Scanner;

public class Kure_hacmi {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Kürenizin Yarıçapını Giriniz :");
        double r=input.nextDouble();
        
        double pi =3.141592;
        double hacim = (4/3)*pi*(r*r*r);
        
        System.out.println("Kürenizin hacmi :" +hacim);
           
    }
    
}
