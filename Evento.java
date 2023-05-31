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
class Evento {
    private Cliente cliente;
    private String data;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "tipoEvento{" +
                "cliente=" + cliente +
                ", data='" + data + '\'' +
                '}';
    }
}