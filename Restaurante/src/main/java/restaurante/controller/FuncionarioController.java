package restaurante.controller;

import restaurante.dto.FuncionarioRequestDTO;
import restaurante.dto.FuncionarioResponseDTO;
import restaurante.model.Funcionario;
import restaurante.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @GetMapping
    public List<FuncionarioResponseDTO> getAll(){
        return funcionarioRepository.findAll().stream().map(FuncionarioResponseDTO::new).toList();
    }

    @PostMapping
    public void addFuncionario(@RequestBody FuncionarioRequestDTO data){
        funcionarioRepository.save(new Funcionario(data));
    }

    @PutMapping("/{id}")
    public void editFuncionario(@PathVariable Long id, @RequestBody FuncionarioRequestDTO data){
        Funcionario funcionario = new Funcionario(data);
        funcionario.setId(id);
        funcionarioRepository.save(funcionario);
    }

    @DeleteMapping("/{id}")
    public void deletarFuncionario(@PathVariable Long id){
        funcionarioRepository.deleteById(id);
    }
}
