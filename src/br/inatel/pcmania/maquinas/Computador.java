package br.inatel.pcmania.maquinas;

public class Computador {
    private String marca;
    private float preco;
    private HardwareBasico[] hardwares;
    private SistemaOperacional sistema;
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, HardwareBasico[] hardwares,
                      SistemaOperacional sistema, MemoriaUSB memoriaUSB) {
        this.marca = marca;
        this.preco = preco;
        this.hardwares = hardwares;
        this.sistema = sistema;
        this.memoriaUSB = memoriaUSB;
    }

    public float getPreco() {
        return preco;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);

        if (hardwares != null) {
            for (HardwareBasico hw : hardwares) {
                if (hw != null) {
                    System.out.println("Hardware: " + hw.getNome() +
                            " - " + hw.getCapacidade());
                }
            }
        }

        if (sistema != null) {
            System.out.println("Sistema Operacional: " + sistema.getNome() +
                    " (" + sistema.getTipo() + " bits)");
        }

        if (memoriaUSB != null) {
            System.out.println("Acompanha: " + memoriaUSB.getNome() +
                    " - " + memoriaUSB.getCapacidade() + "Gb");
        }
        System.out.println("----------------------------");
    }
}
