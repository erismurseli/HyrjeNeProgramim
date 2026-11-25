// WORKSHOP 1 - ERIS MURSELI//
void main() {

    /* Printimi i Roleve */
    IO.println("1. admin");
    IO.println("2. user");
    IO.println("3. guest");
    IO.println("4. Operator");

    var roli = Integer.parseInt(IO.readln("Roli (1-4): ").trim());

    /*Inicializimi i variables niveli ne baz te vlerave qe merr ne input variabla roli*/
    var niveli = switch (roli) {
        case 1 -> 3;
        case 2 -> 2;
        case 3 -> 1;
        case 4 -> 2;
        default -> 0;
    };
    
    /* Kontrollimi i nivelit me if, if else, else */
    if (niveli > 3 || niveli < 1) {
        IO.println("Rol i panjohur.");
    } else if (niveli == 1) {
        IO.println("Mysafir: vetëm lexim, pa fjalëkalim.");
    } else {
        String perdoruesi = IO.readln("Përdoruesi: ").trim().toLowerCase();
        String fjalekalimi = IO.readln("Fjalëkalimi: ");

        /* Nese fjalekalimi bosh printo mesazhin */
        if (fjalekalimi.length() == 0) {
            IO.println("Fjalëkalimi s'mund të jetë bosh.");
        } else {
            boolean llogariaSakte;

            if (roli == 1) {
                llogariaSakte = perdoruesi.equals("admin") && fjalekalimi.equals("S3kret!2026");
            } else if (roli == 2) {
                llogariaSakte = perdoruesi.equals("arta") && fjalekalimi.equals("arta2026");
            } else {
                llogariaSakte = perdoruesi.equals("operator") && fjalekalimi.equals("Op3r!2026");
            }

            String mesazhi = llogariaSakte ? "Hyrje e suksesshme." : "Përdorues ose fjalëkalim i gabuar.";
            IO.println(mesazhi);
            if (llogariaSakte) {
                double hapesira = niveli * 2.5;
                System.out.printf("Hapësira juaj: %.2f GB%n", hapesira);
            }
        }
    }    
}