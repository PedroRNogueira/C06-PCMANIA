package br.inatel.pcmania.envio;

import br.inatel.pcmania.maquinas.Computador;

public class ProcessarPedido {
    public static void enviar(Computador[] pcs) {
        if (pcs == null || pcs.length == 0) {
            System.out.println("Nenhum pedido para enviar.");
            return;
        }

        int qtd = 0;
        for (Computador pc : pcs) {
            if (pc != null) {
                qtd++;
            }
        }

        if (qtd < 2) {
            System.out.println("Pedido não pode ser enviado. É necessário pelo menos 2 computadores.");
            return;
        }

        System.out.println("Pedido enviado...");
    }
}
