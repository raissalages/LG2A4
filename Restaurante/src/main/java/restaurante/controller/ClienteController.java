package restaurante.controller;

import restaurante.dto.ClienteRequestDTO;
import restaurante.dto.ClienteResponseDTO;
import restaurante.model.Cliente;
import restaurante.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<ClienteResponseDTO> getAll(){
        return clienteRepository.findAll().stream().map(ClienteResponseDTO::new).toList();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody ClienteRequestDTO data){
        clienteRepository.save(new Cliente(data));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/{id}")
    public void editarCliente(@PathVariable Long id, @RequestBody ClienteRequestDTO data){
        Cliente cliente = new Cliente(data);
        cliente.setId(id);
        clienteRepository.save(cliente);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/{id}")
    public void deletarCliente(@PathVariable Long id){
        clienteRepository.deleteById(id);

    }
}
