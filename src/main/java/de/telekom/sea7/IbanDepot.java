package de.telekom.sea7;

public class IbanDepot {
private Object[] ibandepotArray = new Object[9];
	
	public IbanDepot() {}
	
	
	// Fügt eine Objektinstanz an die nächste freie Stelle des Arrays
	public String add(String iban) {
		for (int i = 0; i < ibandepotArray.length; i++) {
			if (ibandepotArray[i] == null) {
				ibandepotArray[i] = iban;
				return iban;
			}
		}
		System.out.println("Array full.");
		return iban;
	}
	
	// Setzt alle Stellen des Arrays auf null
	public void clear() {
		for (int i = 0; i < ibandepotArray.length; i++) {
			ibandepotArray[i] = null;
		}
	}
	
	// Gibt das Objekt von der angegebenen Stelle (index) zurück
	public Object get(int index) {
		if ((index < 0) | (ibandepotArray.length <= index)) {
			System.out.println("Out of bounce " + index);
			return null;
		} else {
			return ibandepotArray[index];
		}
	}
	
	// Prüft, ob das Array voll belegt ist
	public boolean isFull() {
		for (int i = 0; i < ibandepotArray.length; i++) {
			if (ibandepotArray[i] == null) {
				return false;
			}
		}
		return true;
	}
	
	// Gibt die Gesamtlänge des Arrays zurück
	public int getCapacity() {
		return ibandepotArray.length;
	}
	
	// Gibt die Anzahl der belegten Stellen des Arrays zurück
	public int size() {
		int counter = 0;
		for (int i = 0; i < ibandepotArray.length; i++) {
			if (ibandepotArray[i] != null) {
				counter++;
			}
		}
		return counter;
	}
	
	// Prüft, ob das Array leer ist. Keine Stelle ist belegt.
	public boolean isEmpty() {
		for (int i = 0; i < ibandepotArray.length; i++) {
			if (ibandepotArray[i] != null) {
				return false;
			}
		}
		return true;
	}
	
	// Prüft, ob die Objektinstanz gleich einer anderen Objektinstanz ist. 
	// Nutzt die equals-Methoden der jeweiligen Objektinstanz nicht die von Depot!
	public boolean contains(Object object) {
		for (int i = 0; i < ibandepotArray.length; i++) {
			if (ibandepotArray[i].equals(object)) {
				return true;
			}
		}
		return false;
	}
	
	// Wie contains, gibt die Position zurück, an der sich das angegebenen Objekt im Array befindet.
	public int indexOf(Object object) {
		for (int i = 0; i < ibandepotArray.length; i++) {
			var element = ibandepotArray[i];             // Zeile 78 und 79 ist die Langversion Zeile 88
			if (element.equals(object)) {
				return i;
			}
		}
		return -1;
	}
	
	// Wie contains, entfernt das Objekt aus dem Array, wenn dies gleich dem angegebenen Objekt ist.
	public boolean remove(Object object) {
		for (int i = 0; i < ibandepotArray.length; i++) {
			if (ibandepotArray[i].equals(object)) {
				ibandepotArray[i] = null;
				return true;
			}
		}
		return false;
	}
	
	// Entfernt das Objekt von der angegebenen Arrayposition
	public boolean remove(int index) {
		if ((index < 0) | (ibandepotArray.length <= index)) {
			System.out.println("Out of bounce " + index);
			return false;
		} else {
			ibandepotArray[index] = null;
			return true;
		}
	}
	
	// Entfernt das Objekt von der letzten genutzten Arrayposition
	public boolean remove() {
		for (int i = (ibandepotArray.length - 1); i >= 0; i--) {
			if (ibandepotArray[i] != null) {
				ibandepotArray[i] = null;
				return true;
			}
		}
		return false;
	}
	
	// Vergleich zwei Objekte miteinander
	// Ist das angegebene Objekt kein "Depot", wird false ausgegeben
	// Ist das angegebene Objekt ein "Depot", wird die Länge des enthaltenen Arrays verglichen.
	@Override
	public boolean equals(Object object) {
		if (object instanceof IbanDepot) {
			IbanDepot depot = (IbanDepot)object;
			if (ibandepotArray.length == depot.ibandepotArray.length) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			System.out.println("This object is not a Depot. You can't compare it with another Depot.");
			return false;
		}
	}
}
