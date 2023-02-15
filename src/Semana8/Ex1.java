<<<<<<< HEAD
=======
package src.Semana8;

public class Ex1 {
    public static void main(String[] args){
        Empresa empresa = new Empresa("Adregos", "4600-367", "leiaoguiao@gmail.com");
        VeiculoMotorizado veiculo1 = new Motociclo("68-36-ZT", "Ducati", "75", 355, "desportivo");
        VeiculoMotorizado veiculo2 = new AutomovelLigeiro("56-TT-11", "Ferrari", "366", 500, 6, 200);
        VeiculoMotorizado veiculo3 = new Taxi("50-70-HJ", "Fiat", "500", 125, 5, 300, 1656);
        VeiculoMotorizado veiculo4 = new PesadoMercadorias("KL-73-96", "MAN", "CS", 500, 15, 4000, 1250);
        VeiculoMotorizado veiculo5 = new PesadoPassageiros("70-54-LP", "Mercedes-Benz", "Enterprise", 400, 10, 3750, 80);        
        VeiculoEletrico veiculo6 = new AutomovelLigeiroEletrico("64-FZ-60", "Tesla", "S-Plaid", 420, 8, 300, 50);
        VeiculoEletrico veiculo7 = new PesadoPassageirosEletrico("98-36-PO", "Scania", "75C", 700, 56, 5000, 120, 25);

        veiculo1.trajeto(25);
        veiculo1.trajeto(50);
        veiculo1.trajeto(75);
        veiculo1.trajeto(150);
        empresa.addVeiculoMotorizado(veiculo1);
        
        veiculo2.trajeto(20);
        veiculo2.trajeto(511);
        veiculo2.trajeto(7511412);
        veiculo2.trajeto(15023423);
        empresa.addVeiculoMotorizado(veiculo2);
        
        veiculo3.trajeto(76865);
        veiculo3.trajeto(4564);
        veiculo3.trajeto(3453);
        veiculo3.trajeto(234234);
        empresa.addVeiculoMotorizado(veiculo3);
        
        veiculo4.trajeto(12312);
        veiculo4.trajeto(2342);
        veiculo4.trajeto(3453);
        veiculo4.trajeto(34534);
        empresa.addVeiculoMotorizado(veiculo4);
        
        veiculo5.trajeto(678555967);
        veiculo5.trajeto(7897);
        veiculo5.trajeto(678618416);
        veiculo5.trajeto(5675);
        empresa.addVeiculoMotorizado(veiculo5);

        veiculo6.carregar(40);
        veiculo7.carregar(76);
        empresa.addVeiculoEletrico(veiculo6);
        empresa.addVeiculoEletrico(veiculo7);

        System.out.println("Empresa:"+"\n"+empresa.toString());
        System.out.println("_______________________________________________");
        System.out.println("A maior distância percorrida é do veiculo: ");
        System.out.println(empresa.maiorDistancia());
    }
}
>>>>>>> c8a8127adb0a6ee70f476fe00c37c4e9d0fcf5ac
