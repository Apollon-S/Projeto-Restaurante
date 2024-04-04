/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;

import javax.swing.JOptionPane;

/**
 *
 * @author Matheus Varistelo Mezzomo
 */
public class Atividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante("Apollo Yamazaki", "Número do Item: 1 | Nome do prato: Yakisoba de camarão com lula | Preço: 39.90R$\nNúmero do Item: 2 | Nome do prato: Yakisoba de carne | Preço: 32.90R$\nNúmero do Item: 3 | Nome do prato: Yakisoba de frango | Preço: 36.70R$\nNúmero do Item: 4 | Nome do prato: Gyoza (Porção de 12 unidades) | Preço: 10.50R$\nNúmero do Item: 5 | Nome do prato: Temaki de camarão | Preço: 17.70R$\nNúmero do Item: 6 | Nome do Item: Temaki de Salmão | Preço: 14.90R$\nNúmero do Item: 7 | Nome do Item: Missoshiru | Preço: 7.99R$\nNúmero do item: 8 | Nome do Item: Teppan de salmão | Preço: 26.50R$\nNúmero do item: 9 | Nome do Item: Lámen | Preço: 44.90R$\nNúmero do item: 10 | Nome do Item: Sushi 40 peças | Preço: 109.90R$\nNúmero do Item: 11 | Nome da bebida: Água Mineral (500ml) | Preco: 3.50R$\nNúmero do Item: 12 | Nome da bebida: Refrigerante (Lata) | Preco: 5.00R$\nNúmero do Item: 13 | Nome da bebida: Suco Natural (250ml) | Preco: 7.50R$\nNúmero do Item: 14 | Nome da bebida: Chá Gelado (300ml) | Preco: 4.50R$\nNúmero do Item: 15 | Nome da bebida: Café Expresso | Preco: 4.00R$");
        Caixa Arthur = new Caixa("Arthur Veiga", 16, "(41) 99999-9999", "111.111.111-11", 1894, "Vale alimentação, refeição, transporte e Gympass", "Todo feriado nacional", "Das 8h às 18h");
        Garçom Luiz = new Garçom("Luiz Brum", 16, "(41) 11111-1111", "222.222.222-22", 1474, "Vale alimentação, refeição e transporte", "Todo feriado nacional e todo dia 5 do mês", "Das 8h às 22h" );
        Supervisor Matheus = new Supervisor("Matheus Varistelo", 16, "(41) 55555-5555", "555.555.555-55", 8977, "Vale alimentação, refeição, transporte, acesso à plano de saúde e psicológico, cursos gratuitos no sistema 'Apollo', Gympass e cartão de desconto na compra de automóveis da linha Toyota", "Todo feriado nacional, 4 dias ao mês de escolha do funcionário", "Das 11h às 19h");
        Cliente cliente01 = Arthur.cadastrodocliente();
        cliente01.fazerpedido();
        Arthur.vercontadocliente(cliente01);
        Matheus.alterarcontadocliente(cliente01);
        Matheus.vercontadoclientesupervisor(cliente01);
    }

}

class Restaurante {

    public String NomeDoRestaurante;
    public String cardápio;

    public Restaurante(String NomeDoRestaurante, String cardápio) {
    }
}

class Pessoa {

    public String nome;
    public int idade;
    public String telefone;
    public String cpf;

    public void mostrarinfo() {
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade + "\nTelefone: " + telefone + "\nCpf: " + cpf);
    }

    Pessoa(String nome, int idade, String telefone, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.cpf = cpf;
    }
}

class Cliente extends Pessoa {

    public double gastos;
    public int numerodamesa;
    int escolhadocliente = 999;
    int quantidadeescolhadocliente = 999;

    public void pagar() {
        gastos = 0;
    }

    public void fazerpedido() {
        while (escolhadocliente != 0) {
            escolhadocliente = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do Item do Cliente: (0 para terminar a compra)"));
            quantidadeescolhadocliente = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de unidades do item que o cliente quer: "));
            switch (escolhadocliente) {
                case 0:
                    break;
                case 1:
                    gastos = gastos + (39.90 * quantidadeescolhadocliente);
                    break;
                case 2:
                    gastos = gastos + (32.90 * quantidadeescolhadocliente);
                    break;
                case 3:
                    gastos = gastos + (36.70 * quantidadeescolhadocliente);
                    break;
                case 4:
                    gastos = gastos + (10.50 * quantidadeescolhadocliente);
                    break;
                case 5:
                    gastos = gastos + (17.70 * quantidadeescolhadocliente);
                    break;
                case 6:
                    gastos = gastos + (14.90 * quantidadeescolhadocliente);
                    break;
                case 7:
                    gastos = gastos + (7.99 * quantidadeescolhadocliente);
                    break;
                case 8:
                    gastos = gastos + (26.50 * quantidadeescolhadocliente);
                    break;
                case 9:
                    gastos = gastos + (44.90 * quantidadeescolhadocliente);
                    break;
                case 10:
                    gastos = gastos + (109.90 * quantidadeescolhadocliente);
                    break;
                    case 11:
                    gastos = gastos + (3.50 * quantidadeescolhadocliente); 
                    break;
                case 12:
                    gastos = gastos + (5.00 * quantidadeescolhadocliente); 
                    break;
                case 13:
                    gastos = gastos + (7.50 * quantidadeescolhadocliente); 
                case 14:
                    gastos = gastos + (4.50 * quantidadeescolhadocliente); 
                    break;
                case 15:
                    gastos = gastos + (4.00 * quantidadeescolhadocliente); 
                default:
                    JOptionPane.showMessageDialog(null, "Número do Item inválido.");
                    break;
            }
            }
        }

    

    public Cliente(String nome, int idade, String telefone, String cpf) {
        super(nome, idade, telefone, cpf);
    }
}

class Funcionário extends Pessoa {

    public float salário;
    public String benefícios;
    public String folga;
    public String horáriodetrabalho;

    public Funcionário(String nome, int idade, String telefone, String cpf, float salário, String benefícios, String Folga, String horáriodetrabalho) {
        super(nome, idade, telefone, cpf);
    }
}

class Supervisor extends Funcionário {
    double alterarcontadocliente(Cliente cliente) {
        cliente.gastos = Double.parseDouble(JOptionPane.showInputDialog("Olá, senhor supervisor! Digite o número no qual se deve alterar o valor da conta do cliente: "));
        return cliente.gastos;
    } 
    double vercontadoclientesupervisor(Cliente cliente) {
        JOptionPane.showMessageDialog(null, cliente.gastos);
        return cliente.gastos;
    }
    public Supervisor(String nome, int idade, String telefone, String cpf, float salário, String benefícios, String Folga, String horáriodetrabalho) {
        super(nome, idade, telefone, cpf, salário, benefícios, Folga, horáriodetrabalho);
    }
}

class Garçom extends Funcionário {

    public String cardápiodogarçom = "Número do Item: 1 | Nome do prato: Yakisoba de camarão com lula | Preço: 39.90R$\nNúmero do Item: 2 | Nome do prato: Yakisoba de carne | Preço: 32.90R$\nNúmero do Item: 3 | Nome do prato: Yakisoba de frango | Preço: 36.70R$\nNúmero do Item: 4 | Nome do prato: Gyoza (Porção de 12 unidades) | Preço: 10.50R$\nNúmero do Item: 5 | Nome do prato: Temaki de camarão | Preço: 17.70R$\nNúmero do Item: 6 | Nome do Item: Temaki de Salmão | Preço: 14.90R$\nNúmero do Item: 7 | Nome do Item: Missoshiru | Preço: 7.99R$\nNúmero do item: 8 | Nome do Item: Teppan de salmão | Preço: 26.50R$\nNúmero do item: 9 | Nome do Item: Lámen | Preço: 44.90R$\nNúmero do item: 10 | Nome do Item: Sushi 40 peças | Preço: 109.90R$\nNúmero do Item: 11 | Nome da bebida: Água Mineral (500ml) | Preco: 3.50R$\nNúmero do Item: 12 | Nome da bebida: Refrigerante (Lata) | Preco: 5.00R$\nNúmero do Item: 13 | Nome da bebida: Suco Natural (250ml) | Preco: 7.50R$\nNúmero do Item: 14 | Nome da bebida: Chá Gelado (300ml) | Preco: 4.50R$\nNúmero do Item: 15 | Nome da bebida: Café Expresso | Preco: 4.00R$";

    public void mostrarcardápio() {
        JOptionPane.showMessageDialog(null, cardápiodogarçom);
    }

    public Garçom(String nome, int idade, String telefone, String cpf, float salário, String benefícios, String Folga, String horáriodetrabalho) {
        super(nome, idade, telefone, cpf, salário, benefícios, Folga, horáriodetrabalho);
    }

}

class Caixa extends Funcionário {

    Cliente cadastrodocliente() {
        String nomecliente = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        int idadecliente = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente: "));
        String telefonecliente = JOptionPane.showInputDialog("Digite o telefone do cliente: ");
        String cpfcliente = JOptionPane.showInputDialog("Digite o CPF do cliente: ");
        return new Cliente(nomecliente, idadecliente, telefonecliente, cpf);

    }

    double vercontadocliente(Cliente cliente) {
        JOptionPane.showMessageDialog(null, cliente.gastos);
        return cliente.gastos;
    }

    public Caixa(String nome, int idade, String telefone, String cpf, float salário, String benefícios, String Folga, String horáriodetrabalho) {
        super(nome, idade, telefone, cpf, salário, benefícios, Folga, horáriodetrabalho);
    }

}
