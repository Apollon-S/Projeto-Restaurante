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
        Pessoa Pessoa01 = new Pessoa("Matheus", 16, "+55 (41) 99999-9999", "123.456.789-10");
        Pessoa01.mostrarinfo();
        Caixa caixa01 = new Caixa("Caixa teste", 19, "+55 (41) 11111-1111", "109.876.543-21");
        
    }
    
}
    class Pessoa{
    public String nome;
    public int idade;
    public String telefone;
    public String cpf;
    
    public void mostrarinfo() {
        System.out.println("Nome: "+nome+"\nIdade: "+idade+"\nTelefone: "+telefone+"\nCpf: "+cpf);   
    }
        
   Pessoa(String nome, int idade, String telefone, String cpf){
    this.nome = nome;
    this.idade = idade;
    this.telefone = telefone;
    this.cpf = cpf; 
    }
 public class Cliente extends Pessoa{
     public float gastos;
     public int numerodamesa;
     public void pagar(){
         gastos = 0;
     }
            public Cliente(String nome, int idade, String telefone, String cpf) {
                super(nome, idade, telefone, cpf);
            }
 public class Funcionário extends Pessoa{
     public float salário;
     public String benefícios;
     public String folga;
     public String horáriodetrabalho;

            public Funcionário(String nome, int idade, String telefone, String cpf, float salário, String benefícios, String Folga, String horáriodetrabalho) {
                super(nome, idade, telefone, cpf);
            }
  public class Supervisor extends Funcionário{

             public Supervisor(String nome, int idade, String telefone, String cpf, float salário, String benefícios, String Folga, String horáriodetrabalho) {
                 super(nome, idade, telefone, cpf, salário, benefícios, Folga, horáriodetrabalho);
             }
  }
  public class Garçom extends Funcionário{

             public Garçom(String nome, int idade, String telefone, String cpf, float salário, String benefícios, String Folga, String horáriodetrabalho) {
                 super(nome, idade, telefone, cpf, salário, benefícios, Folga, horáriodetrabalho);
             }
      
  }
  public class Caixa extends Funcionário{
      Cliente cadastrodocliente() {
          String nomecliente = JOptionPane.showInputDialog("Digite o nome do cliente: ");
          int idadecliente = Integer.parseInt("Digite a idade do cliente: ");
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
 }
       
   }
    }
