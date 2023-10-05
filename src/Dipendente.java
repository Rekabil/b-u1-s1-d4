package src;

public class Dipendente extends GestioneDipendenti {
    private int stipendioBase = 1000;
    private String matricola;
    private int stipendio;
    public int importoOrarioStraordinario;

    private String Livello;
    public String Dipartimento;

    public Dipendente(String matricola, int importoOrarioStraordinario, String Livello, String Dipartimento ) {
        this.matricola = matricola;
        this.stipendio= stipendioBase;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.Livello = Livello;
        this.Dipartimento = Dipartimento;

    }

    public void modificaDipendente(int importoOrarioStraordinario, String Livello ) {
        this.stipendio= stipendioBase;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.Livello = Livello;
    }

    public void stampaDatiDipendente() {
        System.out.println("Matricola Dipendete: " + this.matricola);
        System.out.println("Stipendio: " +this.stipendio);
        System.out.println("Straordinari: " + this.importoOrarioStraordinario);
        System.out.println("Livello: " +this.Livello);
        System.out.println("Dipartimento: " + this.Dipartimento);
    }

public void promuovi() {
        if (this.Livello == "OPERAIO") {
            this.Livello = "IMPIEGATO";
                    this.stipendio = (int) (stipendioBase * 1.2);

        } else if (this.Livello == "IMPIEGATO" ) {
            this.Livello = "QUADRO";
            this.stipendio = (int) (stipendioBase * 1.5);

        } else if (this.Livello == "QUADRO") {
            this.Livello = "DIRIGENTE";
            this.stipendio = (int) (stipendioBase * 2);
    } else {
            System.out.println("Error");
        }
    System.out.println("Nuovo Livello: " +this.Livello);
    System.out.println("Nuovo Stipendio: " +this.stipendio);
}



}
