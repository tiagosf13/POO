package RandomTicketTester;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import src.Semana7.DataYMD;
import src.Semana9.Pessoa;

public class RandomTicketTester {
    public static void main(String[] args) throws IOException{

        RandomTickets tickets = new RandomTickets();

        List<Pessoa> r = new ArrayList<Pessoa>();        
        r.add(new Pessoa("Maria", 34317245, new DataYMD(12, 1, 2000))); // tinha DataYMD na classe da semana 7
        r.add(new Pessoa("Carlos", 36331424, new DataYMD(1, 10, 2003))); //tinha Pessoa na classe da semana 9
        r.add(new Pessoa("Marta", 35940012, new DataYMD(31, 3, 2002)));
        r.add(new Pessoa("Sofia", 34765901, new DataYMD(14, 7, 2000)));
        r.add(new Pessoa("Tiago", 35006531, new DataYMD(3, 6, 2001)));

        // selecionar aleatoriamente uma pessoa, que receberá em cada sorteio 1 ou 2 bilhetes para um dos festivais (escolhido aleatoriamente)
        // os bilhetes disponíveis estão listados no ficheiro 'Lista_bilhetes.txt'
        for (int i=0; i<2*r.size(); i++) {
            int ri = (int) (Math.random()*r.size());
            tickets.getRandomTicket(r.get(ri));
        }

        tickets.listPessoas();
        //tickets.listAvailableTickets();
    }
}
