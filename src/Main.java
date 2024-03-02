import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        while (true) {
            System.out.println("|---------------------------------------------------------|");
            System.out.println("|--Premi 1 per creare un nuovo rettangolo-----------------|");
            System.out.println("|--Premi 2 per stampare la lista dei rettangoli creati----|");
            System.out.println("|--Premi 3 per cancellare un rettangolo inserendo l'id----|");
            System.out.println("|--Premi 4 per chiudere il programma----------------------|");
            System.out.println("|---------------------------------------------------------|");
            int scelta = Integer.parseInt(tastiera.nextLine());
            switch (scelta) {
                case 1:
                    RettangoloArray.creaNuovoRettangolo(tastiera);
                    break;
                case 2:
                    RettangoloArray.stampaLista();
                    break;
                case 3:
                    System.out.println("Inserisci l'id del rettangolo che vuoi eliminare");
                    int id = Integer.parseInt(tastiera.nextLine());
                    RettangoloArray.id--;//scalo l id di uno per creare uno vuoto
                    RettangoloArray rettangoloArray = new RettangoloArray(0, 0, 0, 0, "", "", 0, 0); // Crea un oggetto RettangoloArray
                    rettangoloArray.delRettangolo(id);
                    break;
                case 4:
                    System.out.println("Arrivederci!");
                    System.exit(0);
                default:
                    System.out.println("Inserisci un valore..");
            }
        }

    }
}