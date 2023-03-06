package clinica;

public class paciente implements Comparable <paciente> {
    
    private String cpf;
    private String nome;
    private String email;
    private String fone;
    
    public paciente (String c, String n, String e, String f){
        this.cpf = c;
        this.nome = n;
        this. email = e;
        this.fone = f;
    }

    
    public String getCpf() {
        return cpf;
    }

    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

   
    public String getFone() {
        return fone;
    }

    
    public void setFone(String fone) {
        this.fone = fone;
    }
    
    @Override
    public String toString () {
        return this.cpf + " " + this.nome + " " + this.email + " " + this.fone;
    }

    @Override
    public int compareTo(paciente c) {
        return this.cpf.compareTo(c.cpf);
    }
    
    
    

}
