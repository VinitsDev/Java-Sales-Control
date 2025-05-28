package br.com.vinicius.Sales_Control.services;

import br.com.vinicius.Sales_Control.entities.Client;
import br.com.vinicius.Sales_Control.repository.ClientRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> create (Client client){
        client.setClientId(null);
        clientRepository.save(client);
        return list();
    }

    public List<Client> delete (Long id){
        clientRepository.deleteById(id);
        return list();
    }

    public List<Client> list () {
        return clientRepository.findAll(Sort.by("name").ascending());
    }


}
