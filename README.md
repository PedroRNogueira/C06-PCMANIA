# Projeto PCMania
---
**Aluno:** Pedro Ribeiro Nogueira  
**Matrícula:** 629
**Curso:** Engenharia de Software
**Sala:** C06-A
---

## Estrutura do sistema
 
Contém as classes relacionadas aos computadores e seus componentes:  
- `HardwareBasico` → Representa peças como processador, memória RAM, HD.  
- `MemoriaUSB` → Representa mídias externas (pen-drives, HDs externos).  
- `SistemaOperacional` → Guarda informações sobre o SO instalado.  
- `Computador` → Representa o computador completo. Possui método `addMemoriaUSB` para adicionar memória externa e `mostraPCConfigs` para exibir as configurações.  

Contém as classes relacionadas ao cliente e ao pedido:  
- `Cliente` → Possui nome, CPF e uma lista de computadores comprados.  
  - O cliente só pode finalizar a compra se adquirir **2 ou mais computadores**.  
- `ProcessarPedido` → Responsável por validar e enviar o pedido.  

- `Principal` → Classe com o método `main`, responsável por executar o programa e controlar o fluxo de compras.  

---

## Como funciona

1. O sistema exibe **as 3 promoções disponíveis** com suas configurações.  
2. O cliente escolhe digitando:  
   - `1` → Promoção 1  
   - `2` → Promoção 2  
   - `3` → Promoção 3  
   - `0` → Finalizar a compra  
3. Cada escolha adiciona um computador ao carrinho.  
4. Ao finalizar:  
   - Se o cliente comprou **menos de 2 computadores**, o pedido é inválido.  
   - Se comprou **2 ou mais**, o total é mostrado e o pedido é enviado.  

---
