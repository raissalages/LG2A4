package restaurante.dto;

import restaurante.model.Cliente;
import restaurante.model.Endereco;

import java.util.List;

public record ClienteResponseDTO(Long id, String nome, Endereco endereco, List<PedidoResponseDTO> pedidos) {
    public ClienteResponseDTO(Cliente cliente){
        this(cliente.getId(), cliente.getNome(), cliente.getEndereco(), cliente.getPedidos().stream().map(PedidoResponseDTO::new).toList());
    }
}
