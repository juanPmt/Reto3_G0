/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.edu.grupo0.ciclo3.servicios;

import co.usa.edu.grupo0.ciclo3.modelo.Client;
import co.usa.edu.grupo0.ciclo3.repositorio.ClientRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author July
 */

@Service
public class ClientService {
    
    @Autowired
    private ClientRepository clientCrud;
    
    public List<Client> getAll(){
        return clientCrud.getAll();
    }
     public Client getClient(int idClient){
        Optional<Client> auxcliente= clientCrud.getClient(idClient);
        return auxcliente.orElse(new Client());
    }
    public Client save(Client client){
        return clientCrud.save(client);
    } 
    
}

