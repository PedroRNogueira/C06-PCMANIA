package br.inatel.pcmania.comprador;


import br.inatel.pcmania.maquinas.Computador;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computadores;

    public Cliente(String nome, String cpf) {
        nome = "Pedro Ribeiro Nogueira";
        cpf = "394.444.180-06";
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[10]; // tamanho fixo
    }

    public void comprarPC(Computador pc) {
        if (pc == null) {
            System.out.println("Computador inválido, não pode ser adicionado.");
            return;
        }

        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] == null) {
                computadores[i] = pc;
                System.out.println("Computador adicionado com sucesso!");
                return;
            }
        }

        System.out.println("Não é possível comprar mais computadores. Carrinho cheio!");
    }

    public void mostraPedido() {
        System.out.println("Cliente: " + nome + " | CPF: " + cpf);

        float total = 0;
        int qtd = 0;

        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null) {
                computadores[i].mostraPCConfigs();
                total += computadores[i].getPreco();
                qtd++;
            }
        }

        if (qtd == 0) {
            System.out.println("Nenhum computador comprado.");
        } else if (qtd < 2) {
            System.out.println("Compra inválida: é necessário adquirir pelo menos 2 computadores.");
        } else {
            System.out.println("Total da compra: R$" + total);
        }
    }

    public Computador[] getComputadores() {
        return computadores;
    }
}
