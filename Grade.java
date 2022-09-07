import java.util.Scanner; //Scanner class is imported.
public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //A Scanner object named input is created.

        System.out.print("Matematik notunuzu giriniz. ");
        int matematik = input.nextInt(); //Math grade is entered.

        System.out.print("Fizik notunuzu giriniz. ");
        int fizik = input.nextInt(); //Math grade is entered.

        System.out.print("Kimya notunuzu giriniz. ");
        int kimya = input.nextInt(); //Chemistry grade is entered.

        System.out.print("Türkçe notunuzu giriniz. ");
        int turkce = input.nextInt(); //Turkish grade is entered.

        System.out.print("Tarih notunuzu giriniz. ");
        int tarih = input.nextInt(); //History grade is entered.

        System.out.print("Müzik notunuzu giriniz. ");
        int muzik = input.nextInt(); //Music grade is entered.

        double average = (matematik + fizik + kimya + turkce + tarih + muzik) / 6; //Average grade of all lessons.
        System.out.println(average);

        String passOrFail = (average >= 60) ? "Sınıfı geçti." : "Sınıfta kaldı."; //Conditional operator (like if else statement)

        System.out.println(passOrFail);
    }

}
