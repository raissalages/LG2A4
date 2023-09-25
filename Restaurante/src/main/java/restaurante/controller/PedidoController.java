package restaurante.controller;

import br.igor.Restaurante.dto.*;
import restaurante.model.Pedido;
import restaurante.model.Prato;
import restaurante.repository.CardapioRepository;
import restaurante.repository.ClienteRepository;
import restaurante.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restaurante.dto.PedidoRequestDTO;
import restaurante.dto.PedidoResponseDTO;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("pedido")
public class PedidoController {
    @Autowired
    private PedidoRepository repository;

    @Autowired
    private ClienteRepository repositoryCliente;

    @Autowired
    private CardapioRepository repositoryPratos;

    @GetMapping
    public List<PedidoResponseDTO> getAll(){
        return repository.findAll().stream().map(PedidoResponseDTO::new).toList();
    }

    @PostMapping
    public void savePedido(@RequestBody PedidoRequestDTO data){
        List<Prato> p = new ArrayList<>();
        for (Long id: data.pratos()) {
            p.add(repositoryPratos.findById(id).get());
        }
        repository.save(new Pedido(data.title(), repositoryCliente.findById(data.cliente()).get(), p));
    }

    @PutMapping("/{id}")
    public void editarPedido(@PathVariable Long id, @RequestBody PedidoRequestDTO data){
        Pedido pedido = new Pedido(data);
        pedido.setId(id);
        repository.save(pedido);
    }

    @DeleteMapping("/{id}")
    public void deletarPedido(@PathVariable Long id){
        repository.deleteById(id);
    }
}
