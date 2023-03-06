package clinica;

public class cadastropaciente {
    
    private paciente[] pacientes;
    private int qtd;

    
    public cadastropaciente() {
        pacientes = new paciente[2000];   
    }
    
    public void cadastrar (paciente p) {
        int i, j;
        if (this.qtd == this.pacientes.length) {
            System.out.println("Cadastro cheio. Cadastramento não efetuado!");
        }
        else {
             for (i = 0; i < this.qtd; i++) {
                 if (this.pacientes[i].compareTo(p) == 0) {
                     System.out.println("Funcionário já existe no cadastro.");
                     return;
                 }
                 else if (this.pacientes[i].compareTo(p) > 0) { // achei o ponto de inserção
                     break;
                 }
             }
             // inserir
             for (j = this.qtd; j > i; j--) { // mover dados
                 this.pacientes[j] = this.pacientes[j-1];
             }
             this.pacientes[i] = p;
             this.qtd++;
             System.out.println("Cadastramento efetuado!");
        }
    }
    
   public int buscabinaria (String cpf){
        int inicio = 0, fim = this.qtd-1, meio;
        if (this.qtd == 0) {
           return -1;
        }
        else {
             paciente p = new paciente (cpf, "","","");
             do {
                 meio = (inicio + fim) / 2;
                 if (p.compareTo (this.pacientes[meio]) == 0) {
                     return meio;
                 }
                 else if (p.compareTo(this.pacientes[meio]) < 0) {
                     fim = meio - 1;
                 }
                 else {
                     inicio = meio + 1;   
                 }
             } while (inicio <= fim);
             return -1;
        }       
    }
   
   public void exibircadastro(String cpf){
       if (this.qtd == 0) {
            System.out.println("Cadastro vazio!");
        }else{
           int pos = buscabinaria(cpf);
        if(pos != -1){
            System.out.println(this.pacientes[pos]);
        }
       }
        
   }

}
