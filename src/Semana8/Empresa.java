package src.Semana8;

public class Empresa {
    
    private String nome;
    private String codigo_postal;
    private String email;
    private VeiculoMotorizado[] veiculos_motorizados = new VeiculoMotorizado[10];
    private VeiculoEletrico[] veiculos_eletricos = new VeiculoEletrico[3];

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

    String viaturas_motorizadas = "";
    public void addVeiculoMotorizado(VeiculoMotorizado viatura){
        for(int i=0; i<veiculos_motorizados.length; i++){
            if(veiculos_motorizados[i] == null){
                veiculos_motorizados[i] = viatura;
                viaturas_motorizadas += "\n"+"\n"+viatura;
                break;
            }
        }
    }

    String viaturas_eletricas = "";
    public void addVeiculoEletrico(VeiculoEletrico viatura_eletrica){
        for(int i=0; i<veiculos_eletricos.length; i++){
            if(veiculos_eletricos[i] == null){
                veiculos_eletricos[i] = viatura_eletrica;
                viaturas_eletricas += "\n"+"\n"+viatura_eletrica;
                break;
            }
        }
    }

    public void removeVeiculoMotorizado(int indice){
        veiculos_motorizados[indice] = null;
    }

    public String toString(){
        return ("Nome: "+this.nome+"\n"+"Código Postal: "+this.codigo_postal+"\n"+"E-mail: "+this.email+"\n"+"Viaturas Motorizadas: "+viaturas_motorizadas+"\n"+"\n"+"\n"+"Viaturas Elétricas: "+viaturas_eletricas);
    }
}
