package proxy;

import designpatterns.Osoba;

public class OsobaProxy implements PobierzDaneOsoby {
	private Osoba osoba;

	public OsobaProxy(Osoba osoba) {
		this.osoba = osoba;
	}
	//Proxy od Delegate
	//proxy to jest dodanie jakiejs funkcjnalności w obrębie konkretnej metody danego obiektu
	//delegate jest od "oddanie akcji" do innego obiektu celem realizacji jakiejś metody.
	public String getData() {
		//sprawdzenie czy uzytkownik ma uprawnienia do wyspisania danych danej osoby
		System.out.println("Pobieram dane osoby: " + osoba.getNazwisko());
		return osoba.getData();
	}

}
