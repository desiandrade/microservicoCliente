package br.com.mybank.cliente.cliente.domain;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    //TODO criar uma tabela separada para cadastrar vários telefones
    private String telefone;
    private Genero genero;
    private LocalDate nascimento;
    private String cpf;
    private String cep;
    private String numero;
    private String complemente;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    private Boolean ativo;
    private Integer idUsuario;
}
