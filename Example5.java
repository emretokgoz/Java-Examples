
import java.util.Scanner;


public class Example5 {
		public static int toplama(int a,int b){
			return (a+b);
		}
		public static int toplama(int a,int b,int c){
			return (a+b+c);
		}
		public static int cikarma(int a,int b){
			return (a-b);
		}
		public static int carpma(int a,int b){
			return (a*b);
		}    
		public static int carpma(int a,int b,int c){
			return (a*b*c);
		}
		public static double bolme(double a,double b){
			return (a/b);
		}    
    public static void main(String[] args){
        
                String islemler = "1. İşlem : Toplama\n"
                + "2. İşlem : Çıkarma\n"
                + "3. İşlem : Çarpma\n"
                + "4. İşlem : Bölme\n"
                + "5. İşlem : Programdan Çıkma";
        
        System.out.println("-------------------------------------");
        System.out.println(islemler);                
        System.out.println("-------------------------------------");
        
        Scanner scanner = new Scanner(System.in);
        while (true) {            
            System.out.print("İşlem Seçin ");
        
        String islem = scanner.nextLine();
        if (islem.equals("1")){
            System.out.println("Kaç sayı toplayacaksınız? (2 veya 3)");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            

            if (sayi == 2){
                
                System.out.print("Birinci Sayıyı Girin: ");
                int a = scanner.nextInt();
                System.out.print("İkinci Sayıyı Girin: ");
                int b = scanner.nextInt();
                scanner.nextLine();                
                System.out.println("Sayıların Toplamı: " + toplama(a, b));        
            }
            else if (sayi == 3){                
                System.out.print("Birinci Sayıyı Girin: ");
                int a = scanner.nextInt();
                System.out.print("İkinci Sayıyı Girin: ");
                int b = scanner.nextInt();
                System.out.print("Üçüncü Sayıyı Girin: ");
                int c = scanner.nextInt();
                scanner.nextLine();                
                System.out.println("Sayıların Toplamı: " + toplama(a,b,c));
            }
        }
        else if (islem.equals("2")){
                System.out.print("Birinci Sayıyı Girin: ");
                int a = scanner.nextInt();
                System.out.print("İkinci Sayıyı Girin: ");
                int b = scanner.nextInt();
                scanner.nextLine();                
                System.out.println("Sayıların Farkı: " + cikarma(a, b));           
            }
        else if (islem.equals("3")){
            System.out.println("Kaç sayı Çarpacaksınız? (2 veya 3)");
            int sayi = scanner.nextInt();
                       scanner.nextLine();
            if (sayi == 2){ 
                System.out.print("Birinci Sayıyı Girin: ");
                int a = scanner.nextInt();
                System.out.print("İkinci Sayıyı Girin: ");
                int b = scanner.nextInt();
                scanner.nextLine();               
                System.out.println("Sayıların Çarpımı: " + carpma(a, b));       
            }
            else if (sayi == 3){  
                System.out.print("Birinci Sayıyı Girin: ");
                int a = scanner.nextInt();
                System.out.print("İkinci Sayıyı Girin: ");
                int b = scanner.nextInt();
                System.out.print("Üçüncü Sayıyı Girin: ");
                int c = scanner.nextInt();
                scanner.nextLine();                
                System.out.println("Sayıların Çarpımı: " + carpma(a,b,c));      
            }
    }
        else if (islem.equals("4")){
                System.out.print("Birinci Sayıyı Girin: ");
                double a = scanner.nextInt();
                System.out.print("İkinci Sayıyı Girin: ");
                double b = scanner.nextInt();
                scanner.nextLine();                
                System.out.println("Sayıların Bölümü: " + bolme((double)a, b));           
            }        
        else if (islem.equals("5")){
            System.out.println("Programdan Çıkılıyor...");
            break;
        }
    }
        
}
}
    
