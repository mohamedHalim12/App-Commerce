package com.user;

import com.exception.ArticleException;

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

  public Client findClient(String name, String passwd) throws ArticleException {
    if (clients.containsKey(name)) {
      Client client = clients.get(name);
      if (client.password.equals(passwd)) {
        return client;
      }
      throw new ArticleException("mot de passe incorrect");
    }
    throw new ArticleException("client non trouve");
  }
}
