
import java.util.Scanner;

import br.inatel.pcmania.comprador.Cliente;
import br.inatel.pcmania.envio.ProcessarPedido;
import br.inatel.pcmania.maquinas.Computador;
import br.inatel.pcmania.maquinas.HardwareBasico;
import br.inatel.pcmania.maquinas.MemoriaUSB;
import br.inatel.pcmania.maquinas.SistemaOperacional;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matricula = 629;

        Computador promo1 = new Computador(
                "Apple",
                matricula,
                new HardwareBasico[] {
                        new HardwareBasico("Pentium Core i3", 2200),
                        new HardwareBasico("Memória RAM", 8),
                        new HardwareBasico("HD", 500)
                },
                new SistemaOperacional("macOS Sequoia", 64),
                new MemoriaUSB("Pen-drive", 16)
        );

        Computador promo2 = new Computador(
                "Samsung",
                matricula + 1234,
                new HardwareBasico[] {
                        new HardwareBasico("Pentium Core i5", 3370),
                        new HardwareBasico("Memória RAM", 16),
                        new HardwareBasico("HD", 1000)
                },
                new SistemaOperacional("Windows 8", 64),
                new MemoriaUSB("Pen-drive", 32)
        );

        Computador promo3 = new Computador(
                "Dell",
                matricula + 5678,
                new HardwareBasico[] {
                        new HardwareBasico("Pentium Core i7", 4500),
                        new HardwareBasico("Memória RAM", 32),
                        new HardwareBasico("HD", 2000)
                },
                new SistemaOperacional("Windows 10", 64),
                new MemoriaUSB("HD Externo", 1024)
        );

        Cliente cliente = new Cliente("Pedro", "123.456.789-00");

        // Mostrar as promoções ANTES da compra
        System.out.println("=== PROMOÇÕES DISPONÍVEIS ===");
        System.out.println("Promoção 1:");
        promo1.mostraPCConfigs();
        System.out.println("Promoção 2:");
        promo2.mostraPCConfigs();
        System.out.println("Promoção 3:");
        promo3.mostraPCConfigs();

        int opcao = 0;
        do {
            System.out.println("Digite 1 para Promoção 1, 2 para Promoção 2, 3 para Promoção 3 ou 0 para finalizar:");

            if (!sc.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número.");
                sc.next();
                continue;
            }

            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    cliente.comprarPC(promo1);
                    break;
                case 2:
                    cliente.comprarPC(promo2);
                    break;
                case 3:
                    cliente.comprarPC(promo3);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        cliente.mostraPedido();
        ProcessarPedido.enviar(cliente.getComputadores());

        sc.close();
    }
}
