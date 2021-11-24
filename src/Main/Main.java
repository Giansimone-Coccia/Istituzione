package Main;
import Istituzione.*;
import java.util.InputMismatchException;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Input's object creation
		Scanner input = new Scanner(System.in);

		//Staff's object creation
		Staff mic = new Staff("Microsoft", "Washington");

		int scelta;
		do {
			System.out.println("MENU");
			System.out.println("0) Per uscire");
			System.out.println("1) Aggiungi personale");
			System.out.println("2) Stampa personale");
			System.out.print("Scelta: ");
			scelta = input.nextInt();

			switch(scelta) {
			case 1:
				System.out.println("Inserisci tipologia personale");
				System.out.println("1-Impiegato, 2-Giornaliero");
				System.out.println("3-Volonario");
				int n = input.nextInt();
				if(n == 1) {
					System.out.println("Inserisci nome: ");
					String name = input.next();
					System.out.println("Inserisci via: ");
					input.next();
					String v = input.nextLine();
					System.out.println("Inserisci numero: ");
					String num = input.next();
					System.out.println("Inserisci codice fiscale: ");
					String cf = input.next();
					boolean b;
					double ret = 0;
					do {
						b = true;
						try {
							System.out.println("Inserisci retribusione base: ");
							ret = input.nextDouble();
						}
						catch(InputMismatchException e) {
							System.out.println("Qualcosa è andato storto, riprova");
							b = false;
						}
					}while(!b);
					System.out.println("Inserisci bonus impiegato: ");
					double bonus = input.nextDouble();
					Impiegato i = new Impiegato(name, v, num, cf, ret);
					mic.addPerson(i);
					i.setBonus(bonus);
				}
				else if(n == 2) {
					System.out.println("Inserisci nome: ");
					String name = input.next();
					System.out.println("Inserisci via: ");
					input.next();
					String v = input.nextLine();
					System.out.println("Inserisci numero: ");
					String num = input.next();
					System.out.println("Inserisci codice fiscale: ");
					String cf = input.next();
					boolean b;
					double ret = 0;
					do {
						b = true;
						try {
							System.out.println("Inserisci retribusione base: ");
							ret = input.nextDouble();
						}
						catch(InputMismatchException e) {
							System.out.println("Qualcosa è andato storto, riprova");
							b = false;
						}
					}while(!b);
					System.out.println("Inserisci numero giorni lavorativi: ");
					int numD = input.nextInt();
					Giornaliero g = new Giornaliero(name, v, num, cf, ret);
					mic.addPerson(g);
					g.setDays(numD);
				}
				else if(n == 3) {
					System.out.println("Inserisci nome: ");
					String name = input.next();
					System.out.println("Inserisci via: ");
					input.next();
					String v = input.nextLine();
					System.out.println("Inserisci numero: ");
					String num = input.next();
					Volontari vol = new Volontari(name, v, num);
					mic.addPerson(vol);
				}
				break;
			case 2:
				mic.printPeople();
				break;
			case 0:
				System.out.println("Arrivederci!");
				return;
			default: System.out.println("Carattere errato, riprova");
			}
		}while(scelta != 0);
	}
}

