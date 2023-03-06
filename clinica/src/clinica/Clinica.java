package clinica;

import java.util.Scanner;

public class Clinica {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String cpf, nome, email, fone;
        int opçao;
       
        

        cadastropaciente clinica= new cadastropaciente();
        
        do {
            exibemenu();
            System.out.println("digite a opção desejada");
            opçao = s.nextInt();

            switch (opçao) {
                case 1:
                    System.out.println("informe o cpf");
                    cpf = s.next(); 
                    System.out.println("informe o nome");
                    nome = s.next();
                    System.out.println("informe o email");
                    email = s.next();
                    System.out.println("informe o fone");
                    fone = s.next();
                    paciente p = new paciente(cpf, nome, email, fone);
                    clinica.cadastrar(p);
                    break;
                case 2:
                    System.out.println("informe o cpf");
                    cpf = s.next(); 
                    clinica.exibircadastro(cpf);
                    break;
                    case 0:
                    break;
                    default: 
                    System.out.println("Opção inválida!");        
            }
        }while (opçao != 0);
        
        

    }
    
    

    public static void exibemenu() {
        System.out.println(
                "Opções\n"
                + "1 – Cadastrar um paciente\n"
                + "2 – consultar os dados de um paciente\n"
                + "0 – Sair do programa\n"
                + "Informe a opção:");
    }

}
