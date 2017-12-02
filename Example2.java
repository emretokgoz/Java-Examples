
import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int birinci;
        int ikinci;
        
        System.out.println("birinci sayıyı girin:");
        birinci = scanner.nextInt();
        
        System.out.println("ikinci sayıyı girin:");
        ikinci = scanner.nextInt();
        
        System.out.println("birinci sayı:"+birinci+"\nikinci sayı:"+ikinci);
        System.out.println("Sayılar değiştiriliyor lütfen bekleyiniz");

        int gecici = birinci;
        birinci = ikinci;
        ikinci = gecici;
                
                
        System.out.println("birinci sayı:"+birinci+"\nikinci sayı:"+ikinci);

        
                
                

    }
    
}
