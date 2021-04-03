package ro.ase.cts.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class ReaderAngajati extends ReaderAplicant {

	public ReaderAngajati(String numeFisier) {
		super(numeFisier);
	}

	public List<Aplicant> readAplicanti() throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(super.numeFisier));
		input2.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<Aplicant>();

		while (input2.hasNext()) {

			int salariu = input2.nextInt();
			String ocupatie = input2.next();
			Angajat a = new Angajat(nume, prenume, varsta, punctaj, nr, vect, salariu, ocupatie);
			angajati.add(a);
		}
		input2.close();
		return angajati;
	}

	@Override
	public List<Aplicant> readAplicanti(String numeFisier) throws FileNotFoundException {
		super();
	}
}
