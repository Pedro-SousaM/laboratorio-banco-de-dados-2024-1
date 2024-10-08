package dcomp.core.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Table(name = "filial")
public class Filial implements EntidadeBase<Integer> {
    @Getter @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Getter @Column(nullable = false)
    private String nome;

    @Getter @Setter @Column(nullable = false)
    private String endereco;

    @Getter @Setter @Column(nullable = false)
    private String telefone;

    @Override
    public Integer getKey() {
        return this.id;
    }
}
