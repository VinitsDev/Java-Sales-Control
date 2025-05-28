package br.com.vinicius.Sales_Control.controllers;

import br.com.vinicius.Sales_Control.entities.Client;
import br.com.vinicius.Sales_Control.services.ClientService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
@AllArgsConstructor
@NoArgsConstructor
public class ClientController {

    @Autowired
    private ClientService clientService;


    @PostMapping
    @Operation(summary = "Create a new client")
    public List<Client> create(@RequestBody Client client) {
        return clientService.create(client);
    }

    @GetMapping
    @Operation(summary = "Returns a list with all clients")
    public List<Client> list(){
        return clientService.list();
    }

    @DeleteMapping("{id}")
    @Operation(summary = "Delete a client by Id")
    public List<Client> delete(@PathVariable("id") Long id){
        return clientService.delete(id);
    }

}
