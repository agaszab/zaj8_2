public class Program {

    public static void main(String[] args) {

        Person pers1 = new Person ("Jan", "Kowalski", "6434543321", 45);
        Person pers2 = new Person ("Jan", "Kowalski", "6434543321", 45);
        Person pers3 = new Person ("Paweł", "Nowak", "81765466543", 35);

        System.out.println(pers1.toString());
        System.out.println(pers2.toString());
        System.out.println(pers3.toString());

        if (pers1.equals(pers2)) System.out.println("To ta sama osoba"); else System.out.println("To dwie różne osoby");
        if (pers1.equals(pers3)) System.out.println("To ta sama osoba"); else System.out.println("To dwie różne osoby");
        if (pers2.equals(pers3)) System.out.println("To ta sama osoba"); else System.out.println("To dwie różne osoby");
    }
}
