package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

    Innlegg[] innleggtabell;
    int nesteledig = 0;

    public Blogg() {
        innleggtabell = new Innlegg[20];
    }

    public Blogg(int lengde) {
        innleggtabell = new Innlegg[lengde];
    }

    public int getAntall() {

        return nesteledig;
    }

    public Innlegg[] getSamling() {

        return innleggtabell;

    }

    public int finnInnlegg(Innlegg innlegg) {

        int indeks = -1;

        for (int i = 0; i < nesteledig; i++) {

            if (innleggtabell[i].erLik(innlegg)) {

                indeks = i;
            }
        }
        return indeks; //returnerer den aktuelle posisjonen
    }

    public boolean finnes(Innlegg innlegg) {


        for(int i = 0; i < nesteledig; i++) {
            if (innleggtabell[i].erLik(innlegg)) {
                 return true;
            }
        }

        return false;
    }

    public boolean ledigPlass() {

        return nesteledig < innleggtabell.length;
        //returnerer true om det er ledigplass
        //og false om det ikke er ledig plass

    }

    public boolean leggTil(Innlegg innlegg) {

        if(finnes(innlegg) || !ledigPlass()) {
            return false;
        }

        else {
            innleggtabell[nesteledig] = innlegg;
            nesteledig++;
            return true;
        }
    }

    public String toString() {
        String a1 = Integer.toString(nesteledig) + "\n";

        for(int i = 0; i < nesteledig; i++) {
            a1 += innleggtabell[i].toString();
        }

        return a1;

    }
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}