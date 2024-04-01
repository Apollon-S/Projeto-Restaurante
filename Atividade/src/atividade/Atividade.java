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
        Restaurante restaurante = new Restaurante("Apollo Yamazaki", "Número do Item: 1 | Nome do prato: Yakisoba de camarão com lula | Preço: 39.90R$\nNúmero do Item: 2 | Nome do prato: Yakisoba de carne | Preço: 32.90R$\nNúmero do Item: 3 | Nome do prato: Yakisoba de frango | Preço: 36.70R$\nNúmero do Item: 4 | Nome do prato: Gyoza (Porção de 12 unidades) | Preço: 10.50R$\nNúmero do Item: 5 | Nome do prato: Temaki de camarão | Preço: 17.70R$\nNúmero do Item: 6 | Nome do Item: Temaki de Salmão | Preço: 14.90R$\nNúmero do Item: 7 | Nome do Item: Missoshiru | Preço: 7.99R$\nNúmero do item: 8 | Nome do Item: Teppan de salmão | Preço: 26.50R$\nNúmero do item: 9 | Nome do Item: Lámen | Preço: 44.90R$\nNúmero do item: 10 | Nome do Item: Sushi 40 peças | Preço: 109.90R$");
        Caixa caixa01 = new Caixa("Matheus", 6, "+55 (41) 11111-1111", "109.876.543-21", 1859, "Vale refeição, vale transporte e GymPass", "Feriados nacionais", "Das 8 às 18h");
        caixa01.mostrarinfo();
        Cliente clienteteste = caixa01.cadastrodocliente();
        clienteteste.mostrarinfo();

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
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nTelefone: " + telefone + "\nCpf: " + cpf);
    }

    Pessoa(String nome, int idade, String telefone, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.cpf = cpf;
    }
}

class Cliente extends Pessoa {

    public float gastos;
    public int numerodamesa;

    public void pagar() {
        gastos = 0;
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

    public Supervisor(String nome, int idade, String telefone, String cpf, float salário, String benefícios, String Folga, String horáriodetrabalho) {
        super(nome, idade, telefone, cpf, salário, benefícios, Folga, horáriodetrabalho);
    }
}

class Garçom extends Funcionário {

    public String cardápiodogarçom = "Número do Item: 1 | Nome do prato: Yakisoba de camarão com lula | Preço: 39.90R$\nNúmero do Item: 2 | Nome do prato: Yakisoba de carne | Preço: 32.90R$\nNúmero do Item: 3 | Nome do prato: Yakisoba de frango | Preço: 36.70R$\nNúmero do Item: 4 | Nome do prato: Gyoza (Porção de 12 unidades) | Preço: 10.50R$\nNúmero do Item: 5 | Nome do prato: Temaki de camarão | Preço: 17.70R$\nNúmero do Item: 6 | Nome do Item: Temaki de Salmão | Preço: 14.90R$\nNúmero do Item: 7 | Nome do Item: Missoshiru | Preço: 7.99R$\nNúmero do item: 8 | Nome do Item: Teppan de salmão | Preço: 26.50R$\nNúmero do item: 9 | Nome do Item: Lámen | Preço: 44.90R$\nNúmero do item: 10 | Nome do Item: Sushi 40 peças | Preço: 109.90R$";

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

    float vercontadocliente(Cliente cliente) {
        System.out.println(cliente.gastos);
        return cliente.gastos;
    }

    public Caixa(String nome, int idade, String telefone, String cpf, float salário, String benefícios, String Folga, String horáriodetrabalho) {
        super(nome, idade, telefone, cpf, salário, benefícios, Folga, horáriodetrabalho);
    }

}

