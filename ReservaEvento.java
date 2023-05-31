/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservaevento;

import java.util.ArrayList;
import java.util.Scanner;

class ReservaEvento {
    public static void main(String[] args) {
        ArrayList<Evento> listaReservas = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int op;

        do {
            System.out.println("------- Menu -------");
            System.out.println("1. Fazer Reserva");
            System.out.println("2. Consultar Reserva");
            System.out.println("3. Ver Lista de Reservas");
            System.out.println("4. Atualizar Reserva");
            System.out.println("5. Remover Reserva");
            System.out.println("6. Mostrar Total de Reservas em um Período");
            System.out.println("7. Sair");
            System.out.print("Escolha uma das opçóes menu: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    fazerReserva(listaReservas, scanner);
                    break;
                case 2:
                    consultarReserva(listaReservas, scanner);
                    break;
                case 3:
                    verListaReservas(listaReservas);
                    break;
                case 4:
                    atualizarReserva(listaReservas, scanner);
                    break;
                case 5:
                    removerReserva(listaReservas, scanner);
                    break;
                case 6:
                    mostrarTotalReservasPorPeriodo(listaReservas, scanner);
                    break;
                case 7:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
            }
        } while (op != 7);
    }

    public static void fazerReserva(ArrayList<Evento> listaReservas, Scanner scanner) {
        System.out.println("----- Fazer Reserva -----");

        System.out.print("Digite o tipo de evento (1 - Empresarial, 2 - Religioso): ");
        int tipoEvento = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Evento evento;
        if (tipoEvento == 1) {
            evento = new EventoEmpresarial();
        } else if (tipoEvento == 2) {
            evento = new EventoReligioso();
        } else {
            System.out.println("Tipo de evento inválido.");
            return;
        }

        Cliente cliente = criarCliente(scanner);
        evento.setCliente(cliente);

        System.out.print("Digite a data do evento(exemplo: 'dd/mm/aaaa'): ");
        String dataEvento = scanner.nextLine();
        evento.setData(dataEvento);

        listaReservas.add(evento);
        System.out.println("Reserva efetuada com sucesso!");
    }

    public static void consultarReserva(ArrayList<Evento> listaReservas, Scanner scanner) {
        System.out.println("----- Consultar Reserva -----");

        System.out.print("Eventos encontrados: ");
        String dataEvento = scanner.nextLine();

        int contadorReservas = 0;

        for (Evento evento : listaReservas) {
            if (evento.getData().contains(dataEvento)) {
                System.out.println(evento);
                contadorReservas++;
            } else {
            }
        }

        System.out.println("Total de reservas encontradas: " + contadorReservas);
    }

    public static void verListaReservas(ArrayList<Evento> listaReservas) {
        System.out.println("----- Lista de Reservas -----");

        if (listaReservas.isEmpty()) {
            System.out.println("Não há reservas registradas.");
            return;
        }

        for (Evento evento : listaReservas) {
            System.out.println(evento);
        }
    }
     public static void atualizarReserva(ArrayList<Evento> listaReservas, Scanner scanner) {
        System.out.println("----- Atualizar Reserva -----");

        System.out.print("Digite a data do evento a ser atualizado: ");
        String dataEvento = scanner.nextLine();

        Evento eventoEncontrado = null;

        for (Evento evento : listaReservas) {
            if (evento.getData().contains(dataEvento)) {
                eventoEncontrado = evento;
                break;
            }
        }

        if (eventoEncontrado == null) {
            System.out.println("Reserva não encontrada.");
            return;
        }

        Cliente novoCliente = criarCliente(scanner);
        eventoEncontrado.setCliente(novoCliente);

        System.out.println("Reserva atualizada com sucesso!");
    }

    public static void removerReserva(ArrayList<Evento> listaReservas, Scanner scanner) {
        System.out.println("----- Remover Reserva -----");

        System.out.print("Digite a data do evento a ser removido: ");
        String dataEvento = scanner.nextLine();

        Evento eventoEncontrado = null;

        for (Evento evento : listaReservas) {
            if (evento.getData().contains(dataEvento)) {
                eventoEncontrado = evento;
                break;
            }
        }

        if (eventoEncontrado == null) {
            System.out.println("Reserva não encontrada.");
            return;
        }

        listaReservas.remove(eventoEncontrado);
        System.out.println("Reserva removida com sucesso!");
    }

  
    public static void mostrarTotalReservasPorPeriodo(ArrayList<Evento> listaReservas, Scanner scanner) {
       System.out.println("----- Total de reservas -----");
       
       System.out.print("");
       String periodo = scanner.nextLine();
       
       int contador = 0;
       
       for(Evento evento: listaReservas){
           if(evento.getData().contains(periodo)){
               contador++;
           
           }
           System.out.println("Total de reservas" + periodo + ":" + contador );    
       }      
    }

    public static Cliente criarCliente(Scanner scanner){ 

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.print("Digite o endereco: ");
        String enderecoCliente = scanner.nextLine();
        
        System.out.print("Digite o contacto: ");
        String telefoneCliente = scanner.nextLine();
        
        Endereco endereco = new Endereco(enderecoCliente);
        Contacto contato = new Contacto(telefoneCliente);
        
        return new Cliente(nomeCliente, endereco, contato);
      
    }
}


