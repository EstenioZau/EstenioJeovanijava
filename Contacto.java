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
class Contacto {
    private String telefone;

    public Contacto(String telefone) {
        this.telefone = telefone;
        
    }
 
    // Getter e Setter

    @Override
    public String toString() {
        return telefone;
    }
}
