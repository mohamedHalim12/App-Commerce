package com.mabanque.presentation;
import java.util.HashMap;

public class MaBanque {
	private static final MaBanque banque = new MaBanque();
	
	private HashMap<String, Client> clients;
	
	private MaBanque() {
		clients = new HashMap<String, Client>();
		Client [] client = { 
				new Client("ahmed", "password1"),
				new Client("ali", "password2"),
				new Client("ahi", "password3"),
				new Client("akram", "password4"),
				new Client("afree", "password5")
			};
		for (Client c : client ) {
			clients.put(c.name, c);
		}
	}
	
	public static MaBanque getInstance() {
		return banque;
	}
	public Client findClient(String name, String passwd) throws MaBanqueException {
		if (clients.containsKey(name)) {
			Client client = clients.get(name);
			if (client.password.equals(passwd)) {
				return client;
			}
			throw new MaBanqueException("mot de passe incorect");
		}	
		throw new MaBanqueException("client non trouvé");
	}
}
