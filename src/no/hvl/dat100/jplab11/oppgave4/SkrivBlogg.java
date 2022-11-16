package no.hvl.dat100.jplab11.oppgave4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(filnavn));
			writer.write(samling.toString());
			writer.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
		

	}
}
