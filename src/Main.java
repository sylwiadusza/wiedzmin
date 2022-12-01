import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Wiedzmin wiedzmin = new Wiedzmin("Sylwia", "wojownik", 30, 40, true);
        System.out.println("Witam w grze Wiedźmin \nStwórz swoją postać");
        System.out.println("Podaj imię");
        wiedzmin.setName(scanner.next());
        System.out.println("Podaj klasę");
        wiedzmin.setKlasa(scanner.next());
        System.out.println("Nowa postać?");
        wiedzmin.setNowaPostac(scanner.hasNextBoolean());
        System.out.println("Twoja postać:" + wiedzmin);
        System.out.println("Moc uderzeniowa:" + wiedzmin.mocuderzeniowa());
    }
}