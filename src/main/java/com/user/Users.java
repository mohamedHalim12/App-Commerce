package com.user;

import com.exception.MaBanqueException;

import java.util.HashMap;

public class Users {
  private static final Users user = new Users();

  private final HashMap<String, Client> clients;

  private Users() {
    clients = new HashMap<>();
    Client[] client = {
      new Client("ahmed", "password1"),
      new Client("ali", "password2"),
      new Client("ahi", "password3"),
      new Client("akram", "password4"),
      new Client("afree", "password5")
    };
    for (Client c : client) {
      clients.put(c.name, c);
    }
  }

  public static Users getInstance() {
    return user;
  }

  public Client findClient(String name, String passwd) throws MaBanqueException {
    if (clients.containsKey(name)) {
      Client client = clients.get(name);
      if (client.password.equals(passwd)) {
        return client;
      }
      throw new MaBanqueException("mot de passe incorrect");
    }
    throw new MaBanqueException("client non trouve");
  }
}
