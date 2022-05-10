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
        veiculo1.trajeto(25);
        veiculo1.trajeto(50);
        veiculo1.trajeto(75);
        veiculo1.trajeto(150);

        empresa.addVeiculo(veiculo2);
        veiculo2.trajeto(20);
        veiculo2.trajeto(511);
        veiculo2.trajeto(7511412);
        veiculo2.trajeto(15023423);

        empresa.addVeiculo(veiculo3);
        veiculo3.trajeto(76865);
        veiculo3.trajeto(4564);
        veiculo3.trajeto(3453);
        veiculo3.trajeto(234234);

        empresa.addVeiculo(veiculo4);
        veiculo4.trajeto(12312);
        veiculo4.trajeto(2342);
        veiculo4.trajeto(3453);
        veiculo4.trajeto(34534);

        empresa.addVeiculo(veiculo5);
        veiculo5.trajeto(678967);
        veiculo5.trajeto(7897);
        veiculo5.trajeto(6786);
        veiculo5.trajeto(5675);

        System.out.println("Empresa:"+"\n"+empresa.toString());
        System.out.println("_______________________________________________");    
        System.out.println("Motociclo:"+"\n"+veiculo1.toString());
        System.out.println("_______________________________________________"); 
        System.out.println("Automóvel Ligeiro:"+"\n"+veiculo2.toString());
        System.out.println("_______________________________________________");    
        System.out.println("Táxi:"+"\n"+veiculo3.toString());
        System.out.println("_______________________________________________");    
        System.out.println("Pesado de Mercadorias:"+"\n"+veiculo4.toString());
        System.out.println("_______________________________________________");    
        System.out.println("Pesado de Passageiros:"+"\n"+veiculo5.toString());
        System.out.println("_______________________________________________");
        
        //este pedaço de código deve ser melhorado

        int maior_distancia=0;
        int veiculo_maior_distancia = 0;
        int[] distancias_totais = {veiculo1.distancia_total, veiculo2.distancia_total, veiculo3.distancia_total, veiculo4.distancia_total, veiculo5.distancia_total};
        for(int i=0;i<5;i++){
            if (distancias_totais[i]>maior_distancia){
                maior_distancia = distancias_totais[i];
                veiculo_maior_distancia = i+1;
            }
        }
        System.out.println("A maior distância percorrida é do veiculo: ");
        switch(veiculo_maior_distancia){
            case(1):
                System.out.println("\n"+"Motociclo:"+"\n"+veiculo1.toString());
                break;
            case(2):
                System.out.println("\n"+"Automóvel Ligeiro:"+"\n"+veiculo2.toString());
                break;
            case(3):
                System.out.println("\n"+"Táxi:"+"\n"+veiculo3.toString());
                break;
            case(4):
                System.out.println("\n"+"Pesado de Mercadorias:"+"\n"+veiculo4.toString());
                break;
            case(5):
                System.out.println("\n"+"Pesado de Passageiros:"+"\n"+veiculo5.toString());
                break;
        }
    }
}