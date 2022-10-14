package com.naidiuk;

public class ClientService {
    public boolean addProductToClientCart(Client client, Product product) {
        return client.getProducts().add(product);
    }
}
