import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RettangoloArray extends Rettangolo {

    protected static List<RettangoloArray> listaRettangoli = new ArrayList<>();


    public RettangoloArray(int base, int altezza, int x, int y, String coloreSfondo, String coloreBordo, int spessoreBordo, int serial) {
        super(base, altezza, x, y, coloreSfondo, coloreBordo, spessoreBordo, serial);
    }

    @Override
    protected int getId() {
        return serial;
    }


    static RettangoloArray creaNuovoRettangolo(Scanner scanner) {
        int base, altezza, x, y, spessoreBordo;
        String coloreSfondo = "";
        String coloreBordo = "";
        enum ColoriDelRettangolo {BIANCO, ROSSO, VERDE, GIALLO, NERO, BLU, GRIGIO, MARRONE, VIOLA}
        String input = "";

        do {
            System.out.print("Inserisci la base del rettangolo: ");
            input = scanner.nextLine();
            try {
                base = Integer.parseInt(input);
                if (base <= 0) {
                    System.out.println("Inserisci un numero maggiore di 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Inserisci un numero valido.");
                base = 0; // Inizializza base a zero in caso d'ingresso non valido
            }
        } while (base <= 0);

        do {
            System.out.print("Inserisci l'altezza del rettangolo: ");
            input = scanner.nextLine();

            try {
                altezza = Integer.parseInt(input);
                if (altezza <= 0) {
                    System.out.println("Inserisci un numero maggiore di 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Inserisci un numero valido.");
                altezza = 0; // Inizializza altezza a zero in caso d'ingresso non valido
            }
        } while (altezza <= 0);

        do {
            System.out.print("Inserisci la coordinata x dell'angolo top-left: ");
            input = scanner.nextLine();

            try {
                x = Integer.parseInt(input);
                if (x < -7 || x >= 1000) {
                    System.out.println("Inserisci un numero compreso tra -7 e 999.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Inserisci un numero valido.");
                x = -8; // Inizializza x a -8 in caso d'ingresso non valido
            }
        } while (x < -7 || x >= 1000);

        do {
            System.out.print("Inserisci la coordinata y dell'angolo top-left: ");
            input = scanner.nextLine();

            try {
                y = Integer.parseInt(input);
                if (y < -7 || y >= 1000) {
                    System.out.println("Inserisci un numero compreso tra -7 e 999.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Inserisci un numero valido.");
                y = -8; // Inizializza x a -8 in caso d'ingresso non valido
            }
        } while (y < -7 || y >= 1000);


        //variabile booleana per uscire dal while
        boolean coloreScelto = false;
        while (!coloreScelto) {
            System.out.println("Scegli un colore per lo sfondo:");
            System.out.println("1. BIANCO");
            System.out.println("2. ROSSO");
            System.out.println("3. VERDE");
            System.out.println("4. GIALLO");
            System.out.println("5. NERO");
            System.out.println("6. BLU");
            System.out.println("7. GRIGIO");
            System.out.println("8. MARRONE");
            System.out.println("9. VIOLA");

            int scelta = -1;
            try {
                scelta = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Inserisci un numero valido.");
                continue;
            }

            switch (scelta) {
                case 1:
                    coloreSfondo = String.valueOf(ColoriDelRettangolo.BIANCO);
                    System.out.println("Hai scelto il colore: " + ColoriDelRettangolo.BIANCO);
                    coloreScelto = true;
                    break;
                case 2:
                    coloreSfondo = String.valueOf(ColoriDelRettangolo.ROSSO);
                    System.out.println("Hai scelto il colore: " + ColoriDelRettangolo.ROSSO);
                    coloreScelto = true;
                    break;
                case 3:
                    coloreSfondo = String.valueOf(ColoriDelRettangolo.VERDE);
                    System.out.println("Hai scelto il colore: " + ColoriDelRettangolo.VERDE);
                    coloreScelto = true;
                    break;
                case 4:
                    coloreSfondo = String.valueOf(ColoriDelRettangolo.GIALLO);
                    System.out.println("Hai scelto il colore: " + ColoriDelRettangolo.GIALLO);
                    coloreScelto = true;
                    break;
                case 5:
                    coloreSfondo = String.valueOf(ColoriDelRettangolo.NERO);
                    System.out.println("Hai scelto il colore: " + ColoriDelRettangolo.NERO);
                    coloreScelto = true;
                    break;
                case 6:
                    coloreSfondo = String.valueOf(ColoriDelRettangolo.BLU);
                    System.out.println("Hai scelto il colore: " + ColoriDelRettangolo.BLU);
                    coloreScelto = true;
                    break;
                case 7:
                    coloreSfondo = String.valueOf(ColoriDelRettangolo.GRIGIO);
                    System.out.println("Hai scelto il colore: " + ColoriDelRettangolo.GRIGIO);
                    coloreScelto = true;
                    break;
                case 8:
                    coloreSfondo = String.valueOf(ColoriDelRettangolo.MARRONE);
                    System.out.println("Hai scelto il colore: " + ColoriDelRettangolo.MARRONE);
                    coloreScelto = true;
                    break;
                case 9:
                    coloreSfondo = String.valueOf(ColoriDelRettangolo.VIOLA);
                    System.out.println("Hai scelto il colore: " + ColoriDelRettangolo.VIOLA);
                    coloreScelto = true;
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }
        }


        //colore bordo
        //variabile booleana per uscire dal while
        boolean coloreSceltoBor = false;
        while (!coloreSceltoBor) {
            System.out.println("Scegli un colore per il bordo:");
            System.out.println("1. BIANCO");
            System.out.println("2. ROSSO");
            System.out.println("3. VERDE");
            System.out.println("4. GIALLO");
            System.out.println("5. NERO");
            System.out.println("6. BLU");
            System.out.println("7. GRIGIO");
            System.out.println("8. MARRONE");
            System.out.println("9. VIOLA");

            int scelta = -1;
            try {
                scelta = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Inserisci un numero valido.");
                continue;
            }

            switch (scelta) {
                case 1:
                    coloreBordo = String.valueOf(ColoriDelRettangolo.BIANCO);
                    System.out.println("Hai scelto il colore: " + ColoriDelRettangolo.BIANCO);
                    coloreSceltoBor = true;
                    break;
                case 2:
                    coloreBordo = String.valueOf(ColoriDelRettangolo.ROSSO);
                    System.out.println("Hai scelto il colore: " + ColoriDelRettangolo.ROSSO);
                    coloreSceltoBor = true;
                    break;
                case 3:
                    coloreBordo = String.valueOf(ColoriDelRettangolo.VERDE);
                    System.out.println("Hai scelto il colore: " + ColoriDelRettangolo.VERDE);
                    coloreSceltoBor = true;
                    break;
                case 4:
                    coloreBordo = String.valueOf(ColoriDelRettangolo.GIALLO);
                    System.out.println("Hai scelto il colore: " + ColoriDelRettangolo.GIALLO);
                    coloreSceltoBor = true;
                    break;
                case 5:
                    coloreBordo = String.valueOf(ColoriDelRettangolo.NERO);
                    System.out.println("Hai scelto il colore: " + ColoriDelRettangolo.NERO);
                    coloreSceltoBor = true;
                    break;
                case 6:
                    coloreBordo = String.valueOf(ColoriDelRettangolo.BLU);
                    System.out.println("Hai scelto il colore: " + ColoriDelRettangolo.BLU);
                    coloreSceltoBor = true;
                    break;
                case 7:
                    coloreBordo = String.valueOf(ColoriDelRettangolo.GRIGIO);
                    System.out.println("Hai scelto il colore: " + ColoriDelRettangolo.GRIGIO);
                    coloreSceltoBor = true;
                    break;
                case 8:
                    coloreBordo = String.valueOf(ColoriDelRettangolo.MARRONE);
                    System.out.println("Hai scelto il colore: " + ColoriDelRettangolo.MARRONE);
                    coloreSceltoBor = true;
                    break;
                case 9:
                    coloreBordo = String.valueOf(ColoriDelRettangolo.VIOLA);
                    System.out.println("Hai scelto il colore: " + ColoriDelRettangolo.VIOLA);
                    coloreSceltoBor = true;
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }
        }

        do {
            System.out.print("Inserisci lo spessore del bordo: ");
            input = scanner.nextLine();

            try {
                spessoreBordo = Integer.parseInt(input);
                if (spessoreBordo < 0 || spessoreBordo > 100) {
                    System.out.println("Inserisci un numero compreso tra 0 e 100.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Inserisci un numero valido.");
                spessoreBordo = -1; // Imposta spessoreBordo a un valore valido nel caso d'ingresso non numerico
            }
        } while (spessoreBordo < 0 || spessoreBordo > 100);


        RettangoloArray rettangolo = new RettangoloArray(base, altezza, x, y, coloreSfondo, coloreBordo, spessoreBordo, id);
        rettangolo.addRettangolo(rettangolo);
        System.out.println("Rettangolo creato con successo!");

        return rettangolo;
    }

    @Override
    public void visualizzaInfo() {
        System.out.println("Id Rettangolo " + id);
        System.out.println("Base: " + base);
        System.out.println("Altezza: " + altezza);
        System.out.println("Posizione (x, y): (" + x + ", " + y + ")");
        System.out.println("Colore di sfondo: " + coloreSfondo);
        System.out.println("Colore del bordo: " + coloreBordo);
        System.out.println("Spessore del bordo: " + spessoreBordo);
    }

    @Override
    public void addRettangolo(Rettangolo r) {
        listaRettangoli.add((RettangoloArray) r);
    }


    @Override
    public void delRettangolo(int id) {
        for (RettangoloArray rettangolo : listaRettangoli) {
            if (rettangolo.getId() == id) {
                listaRettangoli.remove(rettangolo);
                System.out.println("Rettangolo con ID " + id + " rimosso con successo.");
                return; // Esci dal ciclo una volta trovato l'elemento
            }
        }
        System.out.println("Nessun rettangolo trovato con l'ID specificato.");
    }


    public static void stampaLista() {
        for (RettangoloArray rett : listaRettangoli) {
            System.out.println("L'id è: " + rett.serial);
            System.out.println("Il colore dello sfondo è : " + rett.coloreSfondo);
            System.out.println("Il colore dello bordo è : " + rett.coloreBordo);
            System.out.println("La coordinata sull'asse delle x è : " + rett.x);
            System.out.println("La coordinata sull'asse delle y è : " + rett.y);
            System.out.println("L'altezza è : " + rett.altezza);
            System.out.println("La base è : " + rett.base);
            System.out.println("Lo spessore del bordo è : " + rett.spessoreBordo);
        }
        if (listaRettangoli.isEmpty()) System.out.println("La lista è vuota");
    }
}
