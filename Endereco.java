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
class Endereco {
    private String endereco;

    public Endereco(String endereco) {
        this.endereco = endereco;
    }

    // Getter e Setter

    @Override
    public String toString() {
        return endereco;
    }
}
