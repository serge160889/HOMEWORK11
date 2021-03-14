package academy.belhard;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Address address1 = new Address(1, "Minsk", "Prityckogo", 10, 1, 23);
		Address address2 = new Address(2, "Brest", "Stroitelei", 4, 0, 12);
		Address address3 = new Address(3, "Grodno", "Nemanskaya", 1, 2, 3);
		Address address4 = new Address(4, "Mogilev", "Smolenskaya", 13, 0, 34);
		Address address5 = new Address(5, "Vitebsk", "Moskovskaya", 56, 2, 67);


			AddressConnector.add(address1);
			AddressConnector.add(address2);
			AddressConnector.add(address3);
			AddressConnector.add(address4);
			AddressConnector.add(address5);


		System.out.println(AddressConnector.readAll());
		AddressConnector.update(Address.createToSaving("Moskow","Belorysskaya",12,1,30),2);
		AddressConnector.update(Address.createToSaving("Brest","Stroitelei",4,0,12),3);
		System.out.println(AddressConnector.readAll());
		AddressConnector.delete(1);
		AddressConnector.delete(3);

		System.out.println(AddressConnector.readAll());
	}


	}




