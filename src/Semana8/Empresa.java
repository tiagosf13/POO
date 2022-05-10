package src.Semana8;

public class Empresa {
    
    private String nome;
    private String codigo_postal;
    private String email;
    private VeiculoMotorizado[] veiculos = new VeiculoMotorizado[10];

    Empresa(String nome, String codigo_postal, String email){
        this.nome = nome;
        this.codigo_postal = codigo_postal;
        this.email = email;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCodigoPostal(){
        return this.codigo_postal;
    }

    public String getEmail(){
        return this.email;
    }

    String viaturas = "";
    public void addVeiculo(VeiculoMotorizado viatura){
        for(int i=0; i<veiculos.length; i++){
            if(veiculos[i] == null){
                veiculos[i] = viatura;
                viaturas += "\n"+"\n"+viatura;
                break;
            }
        }
    }

    public void removeVeiculo(int indice){
        veiculos[indice] = null;
    }

    public String toString(){
        return ("Nome: "+this.nome+"\n"+"Código Postal: "+this.codigo_postal+"\n"+"E-mail: "+this.email+"\n"+"Viaturas: "+viaturas);
    }
}
