
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        double number1;double number2;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter 1.Integer:");
        number1 = keyboard.nextInt();
        System.out.println("Enter 2.Integer:");
        number2 = keyboard.nextInt();






        System.out.println("Yapmak istediğiniz işlem:\n1.Toplama\n2.Çarpma\n3.Bölme\n4.Kalan\n");

        int secim;

        secim = keyboard.nextInt();

        switch (secim){
            case 1:
                double summary = number2 + number1;
                System.out.println(number1 + "+" + number2 + "=" + summary);
            break;
            case 2:
                double multip = number2 * number1;
                System.out.println(number1 + "*" + number2 + "=" + multip);
                break;
            case 3:
                if (number2 == 0){
                    System.out.println("Sayının sıfır ile bölümünden sonuç = sonsuz.");
                } else{
                    double divide = number1 / number2;
                    System.out.println(number1 + "%" + number2 + "=" + divide);
                }
                break;
            case 4:
                if (number2 == 0){
                    System.out.println("Hata!\nSayının sıfır ile bölümünden kalan tanımlanamadı.");
                } else{
                    double remainder = number1 % number2;
                    System.out.println(number1 + "%" + number2 + "=" + remainder);
                }
                break;
            default:
                System.out.println("HATA!");

        }

        }





}