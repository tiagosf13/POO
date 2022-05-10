package src.Semana8;

public class Ex1 {
    public static void main(String[] args){
        Empresa empresa = new Empresa("Adregos", "4600-367", "leiaoguiao@gmail.com");
        VeiculoMotorizado veiculo1 = new Motociclo("68-36-ZT", "Ducati", "75", 355, "desportivo");
        VeiculoMotorizado veiculo2 = new AutomovelLigeiro("56-TT-11", "Ferrari", "366", 500, 6, 200);
        VeiculoMotorizado veiculo3 = new Taxi("50-70-HJ", "Fiat", "500", 125, 5, 300, 1656);
        VeiculoMotorizado veiculo4 = new PesadoMercadorias("KL-73-96", "MAN", "CS", 500, 15, 4000, 1250);
        VeiculoMotorizado veiculo5 = new PesadoPassageiros("70-54-LP", "Mercedes-Benz", "Enterprise", 400, 10, 3750, 80);        
        empresa.addVeiculo(veiculo1);
        empresa.addVeiculo(veiculo2);
        empresa.addVeiculo(veiculo3);
        empresa.addVeiculo(veiculo4);
        empresa.addVeiculo(veiculo5);
        empresa.toString();
        veiculo1.toString();
        veiculo2.toString();
        veiculo3.toString();
        veiculo4.toString();
        veiculo5.toString();
    }
}
