/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservaevento;

/**
 *
 * @author Estenio Zau
 */
class Cliente {
    private String nome;
    private Endereco endereco;
    private Contacto contacto;

    public Cliente(String nome, Endereco endereco, Contacto contato) {
        this.nome = nome;
        this.endereco = endereco;
        this.contacto = contacto;
    }

    // Getters e Setters

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", contato=" + contacto +
                '}';
    }
}
