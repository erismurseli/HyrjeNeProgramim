// WORKSHOP 1 - ERIS MURSELI//
void main() {

    // Printimi i Roleve
    IO.println("1. admin");
    IO.println("2. user");
    IO.println("3. guest");

    var roli = Integer.parseInt(IO.readln("Roli (1-3): ").trim());

    //Inicializimi i variables niveli ne baz te vlerave qe merr ne input variabla roli
    var niveli = switch (roli) {
        case 1 -> 3;
        case 2 -> 2;
        case 3 -> 1;
        default -> 0;
    };
    
    // Kontrollimi i nivelit me if, if else, else
    if (niveli == 0) {
        System.out.println("Rol i panjohur.");
    } else if (niveli == 1) {
        System.out.println("Mysafir: vetëm lexim, pa fjalëkalim.");
    } else {
        String perdoruesi = IO.readln("Përdoruesi: ").trim().toLowerCase();
        String fjalekalimi = IO.readln("Fjalëkalimi: ");

        boolean llogariaSakte;

        if (niveli == 3) {
            llogariaSakte = perdoruesi.equals("admin") && fjalekalimi.equals("S3kret!2026");
        } else {
            llogariaSakte = perdoruesi.equals("arta") && fjalekalimi.equals("arta2026");
        }

        String mesazhi = llogariaSakte ? "Hyrje e suksesshme." : "Përdorues ose fjalëkalim i gabuar.";
        System.out.println(mesazhi);
        if (llogariaSakte) {
            double hapesira = niveli * 2.5;
            System.out.printf("Hapësira juaj: %.2f GB%n", hapesira);
        }    
    }
}