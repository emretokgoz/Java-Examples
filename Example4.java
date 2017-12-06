
import java.util.Scanner;


public class Example4 {
    public static void main(String[] args) {


        String islemler = "1. İşlem : Bakiye öğrenme\n"
                + "2. İşlem : Para çekme\n"
                + "3. İşlem : Para yatırma\n"
                + "4. İşlem : çıkış";
        
        System.out.println("-------------------------------------");
        System.out.println(islemler);                
        System.out.println("-------------------------------------");
        
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
 
        
        while (true) {         
            System.out.print("İşlem Seçin : ");
            String islem = scanner.nextLine();
            if (islem.equals("1")){
                
                System.out.println("Bakiyeniz : " + bakiye);
            }
            else if (islem.equals("2")){
                
                System.out.println("Nekadar para çekeceksiniz : ");
                int miktar = scanner.nextInt();
                scanner.nextLine();
                
                if (miktar > bakiye){
                    System.out.println("Yetersiz bakiye!");    
                }
                
                else if (miktar <=0){
                    System.out.println("Lütfen 0'dan yüksek bir değer girin!");
                }
    
                else{
                bakiye -= miktar;
                System.out.println("Yeni bakiyeniz : " + bakiye);
                }
                
            }
            else if (islem.equals("3")){
                System.out.println("Nekadar para yatıracaksınız : ");
                int miktar = scanner.nextInt();
                scanner.nextLine();
                
                if(miktar <= 0){
                    System.out.println("Lütfen 0'dan yüksek bir değer girin!");
                }
                else{
                bakiye += miktar;
                System.out.println("Yeni bakiyeniz : "+ bakiye);
                }
              
            }
            else if (islem.equals("4")){
                System.out.println("Programdan çıkılıyor lütfen bekleyin!");
                break;
            }
            else {
                System.out.println("Geçersiz İşlem!");
            }
            
        }
		

	}

}