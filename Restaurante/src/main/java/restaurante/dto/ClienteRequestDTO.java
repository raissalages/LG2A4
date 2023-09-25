package restaurante.dto;

import restaurante.model.Endereco;

public record ClienteRequestDTO(String nome, Endereco endereco) {
}
