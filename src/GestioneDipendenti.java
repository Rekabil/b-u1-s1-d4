package src;

public abstract class GestioneDipendenti {

    public static void Gestione() {
        Dipendente kaan = new Dipendente("485BN6", 5, "OPERAIO", "PRODIZIONE");
        Dipendente remzi= new Dipendente("485895", 5, "OPERAIO", "PRODIZIONE");
        Dipendente bilgen = new Dipendente("48hj74", 5, "IMPIEGATO", "ADMINISTRAZIONE");
        Dipendente rek= new Dipendente("48azx5", 5, "DIRIGENTE", "VENDITE");

        kaan.promuovi();
        bilgen.promuovi();

        Dipendente[] dipendenti = {kaan, remzi, bilgen , rek};
for (Dipendente dip: dipendenti) {
    dip.stampaDatiDipendente();
}

    }
}
