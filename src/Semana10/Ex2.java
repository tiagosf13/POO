package src.Semana10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Random;

public class Ex2 {
    public static void main(String[] args){
        String termo, significado, termo_para_alterar, novo_termo, chave_anterior, significado_para_alterar;
        ArrayList<String> significado_anterior;
        int opcao;

        Scanner sc = new Scanner(System.in);
        Map<String, ArrayList<String>> dic = new TreeMap<>();

        opcao = 99;
        while (true){
            System.out.println("MENU");
            System.out.println("1 - Adicionar termo");
            System.out.println("2 - Adicionar significado");
            System.out.println("3 - Mostrar termos e significados");
            System.out.println("4 - Alterar termo");
            System.out.println("5 - Alterar significado");
            System.out.println("6 - Significado Random");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            if (opcao == 1){
                System.out.println("Insira o termo:");
                termo = sc.next();
                if (!dic.containsKey(termo)){
                    sc.nextLine();
                    System.out.println("Insira o significado de "+termo);
                    significado = sc.nextLine();

                    dic.put(termo, new ArrayList<>(Arrays.asList(significado)));     
                }
                else{
                    System.out.println("O termo já se encontra em uso!");
                }
            }
            else if (opcao == 2){
                System.out.println("Insira o termo a que deseja adicionar um significado:");
                termo = sc.next();
                sc.nextLine();
                
                if (dic.containsKey(termo)){
                    System.out.println("Insira o significado a ser adicionado:");
                    significado = sc.nextLine();
                    dic.get(termo).add(significado); //adiciona um elemento ao arraylist
                }
                else{
                    System.out.println("Não existe o termo a que adicionar um significado");
                }
            }
            else if (opcao == 3){
                System.out.println("---------------ELEMENTOS-------------------");
                System.out.println(dic.toString());
                System.out.println("---------------TERMOS-------------------");
                System.out.println(dic.keySet().toString());
                System.out.println("---------------SIGNIFICADOS-------------------");
                for (String key : dic.keySet()){
                    System.out.println(dic.get(key));
                }
            }
            //alterar a chave
            else if (opcao == 4){
                System.out.println("---------------ELEMENTOS-------------------");
                System.out.println(dic.toString());

                System.out.println("Insira o termo a ser alterado:");
                termo_para_alterar = sc.next();

                significado_anterior = dic.get(termo_para_alterar);
                dic.remove(termo_para_alterar);

                System.out.println("Insira o novo termo para o significado: "+significado_anterior);
                novo_termo = sc.next();

                dic.put(novo_termo, significado_anterior);
            }
            //alterar o significado
            else if (opcao == 5){
                System.out.println("---------------ELEMENTOS-------------------");
                System.out.println(dic.toString());

                System.out.println("Insira o termo do significado a ser alterado:");
                chave_anterior = sc.next();

                dic.remove(chave_anterior);

                sc.nextLine();
                System.out.println("Insira o novo significado do termo");
                significado_para_alterar = sc.nextLine();

                dic.put(chave_anterior, new ArrayList<>(Arrays.asList(significado_para_alterar)));
            }
            else if (opcao == 6){
                System.out.println("Insira o termo a que pretende acessar um significado aleatório:");
                termo = sc.next();
                System.out.println(randomTermo(termo, dic));
            }
            else{
                System.exit(0);
            }

            System.out.println("-------------------------------------------");
        }
    }

    public static String randomTermo(String termo, Map<String, ArrayList<String>> dic){
        ArrayList<String> significados;
        int indice_random;

        if (dic.containsKey(termo)){
            significados = dic.get(termo);
            Random random = new Random();
            indice_random = random.nextInt(significados.size());
            return significados.get(indice_random);
        }
        else{
            return null;
        }
    }
}