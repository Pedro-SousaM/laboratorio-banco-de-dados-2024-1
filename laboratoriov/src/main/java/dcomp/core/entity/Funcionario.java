package dcomp.core.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@Table(name = "funcionario")
public class Funcionario extends PessoaFisica {

    @Getter @Column(nullable = false)
    private int matricula;

    @Getter @Setter @OneToMany(mappedBy = "tutor",cascade = CascadeType.ALL)
    private Set<Dependente> dependentes = new LinkedHashSet<>();

    @Getter @Setter @ManyToOne @JoinColumn(name = "id_filial")
    private Filial filial;

    public Funcionario (String nome, String cpf, String email, String telefone , int matricula, Set<Dependente> dependentes,Filial filial){
        super(nome,cpf,email,telefone);
        this.matricula = matricula;
        this.dependentes.addAll(dependentes);
        this.filial = filial;
    }

}
