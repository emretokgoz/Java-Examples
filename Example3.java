
import java.util.Scanner;


public class Exampe3 {
    public static void main(String[] args) {
        
        String islemler ="1. Toplama İşlemi\n"
                + "2. Çıkarma İşlemi\n"
                + "3. Çarpma İşlemi\n"
                + "4. Bölme İşlemi";
        System.out.println("----------------------------------------------------");
        System.out.println(islemler);
        System.out.println("----------------------------------------------------\n");
        
        System.out.print("İşlem seçiniz: ");
        
        Scanner scanner = new Scanner(System.in);
        String islem = scanner.nextLine();
        int birinci;
        int ikinci;

        
        switch (islem){
                case "1":
                    System.out.print("\nBirinci Sayıyı Girin: ");
                    birinci = scanner.nextInt();
                    System.out.print("İkinci Sayıyı Girin: ");
                    ikinci = scanner.nextInt();
                    System.out.println("Brinici Ve İkinci Sayıların Toplamı: "+ ((int)birinci + ikinci));
                    break;
                case "2":
                    System.out.print("Birinci Sayıyı Girin: ");
                    birinci = scanner.nextInt();
                    System.out.print("İkinci Sayıyı Girin: ");
                    ikinci = scanner.nextInt();
                    System.out.println("Brinici Ve İkinci Sayıların Farkı : "+ ((int)birinci - ikinci));
                    break;
                case "3":
                    System.out.print("Birinci Sayıyı Girin: ");
                    birinci = scanner.nextInt();
                    System.out.print("İkinci Sayıyı Girin: ");
                    ikinci = scanner.nextInt();
                    System.out.println("Brinici Ve İkinci Sayıların Çarpımı : "+ ((int)birinci * ikinci));
                    break;
                case "4":
                    System.out.print("Birinci Sayıyı Girin: ");
                    birinci = scanner.nextInt();
                    System.out.print("İkinci Sayıyı Girin: ");
                    ikinci = scanner.nextInt();
                    System.out.println("Brinici Ve İkinci Sayıların Bölümü : "+ ((double)birinci / ikinci));
                    break;
                default:
                    System.out.println("Geçersiz İşlem!");
             
        }
        
    }
}
