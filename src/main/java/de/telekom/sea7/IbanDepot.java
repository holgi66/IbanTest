package de.telekom.sea7;

public class IbanDepot {
	private Iban[] ibandepotArray = new Iban[9];
	private int size;

	public IbanDepot() {
	}

	// Fügt eine Objektinstanz an die nächste freie Stelle des Arrays
	public void add(Iban iban) {
		ibandepotArray[size++]=iban;
	}

	// Gibt das Objekt von der angegebenen Stelle (index) zurück
	public Iban get(int index) {
		if ((index < 0) | (ibandepotArray.length <= index)) {
			System.out.println("No Iban" + index);
			return null;
		} else {
			return ibandepotArray[index];
		}
	}

	// Gibt die Anzahl der belegten Stellen des Arrays zurück
	public int size() {

		return size;
	}

}
