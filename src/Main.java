import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int birthYear, zodiac;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen doğum yılınızı giriniz: ");
        birthYear = input.nextInt();

        zodiac = birthYear % 12;

        switch (zodiac) {
            // Enhanced switch.
            case 0 -> System.out.print("Çin zodyağı burcunuz: Maymun");
            case 1 -> System.out.print("Çin zodyağı burcunuz: Horoz");
            case 2 -> System.out.print("Çin zodyağı burcunuz: Köpek");
            case 3 -> System.out.print("Çin zodyağı burcunuz: Domuz");
            case 4 -> System.out.print("Çin zodyağı burcunuz: Fare");
            case 5 -> System.out.print("Çin zodyağı burcunuz: Öküz");
            case 6 -> System.out.print("Çin zodyağı burcunuz: Kaplan");
            case 7 -> System.out.print("Çin zodyağı burcunuz: Tavşan");
            case 8 -> System.out.print("Çin zodyağı burcunuz: Ejderha");
            case 9 -> System.out.print("Çin zodyağı burcunuz: Yılan");
            case 10 -> System.out.print("Çin zodyağı burcunuz: At");
            case 11 -> System.out.print("Çin zodyağı burcunuz: Koyun");

            default -> System.out.print("Hata! Geçersiz bir sayı girdiniz.");
        }

    }
}