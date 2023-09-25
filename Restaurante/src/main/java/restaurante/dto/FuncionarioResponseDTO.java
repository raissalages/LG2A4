package restaurante.dto;

import restaurante.model.Funcionario;

public record FuncionarioResponseDTO(Long id, String nome, String cpf){
    public FuncionarioResponseDTO(Funcionario funcionario){
        this(funcionario.getId(), funcionario.getNome(), funcionario.getCpf());
    }

}
