package src.Semana10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        String termo, significado, termo_para_alterar, significado_anterior, novo_termo, chave_anterior, significado_para_alterar;
        int opcao;

        Scanner sc = new Scanner(System.in);
        Map<String, String> dic = new HashMap<>();

        opcao = 99;
        while (true){
            System.out.println("MENU");
            System.out.println("1 - Adicionar termo");
            System.out.println("2 - Mostrar termos e significados");
            System.out.println("3 - Alterar termo");
            System.out.println("4 - Alterar significado");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            if (opcao == 1){
                System.out.println("Insira o termo:");
                termo = sc.next();

                sc.nextLine();
                System.out.println("Insira o significado de "+termo);
                significado = sc.nextLine();

                dic.put(termo, significado); 
            }
            else if (opcao == 2){
                System.out.println("---------------ELEMENTOS-------------------");
                System.out.println(dic.toString());
                System.out.println("---------------TERMOS-------------------");
                System.out.println(dic.keySet().toString());
                System.out.println("---------------SIGNIFICADOS-------------------");
                for (String key : dic.keySet()){
                    System.out.println(dic.get(key));
                }
            }
            else if (opcao == 3){
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
            else if (opcao == 4){
                System.out.println("---------------ELEMENTOS-------------------");
                System.out.println(dic.toString());

                System.out.println("Insira o termo do significado a ser alterado:");
                chave_anterior = sc.next();

                dic.remove(chave_anterior);

                sc.nextLine();
                System.out.println("Insira o novo significado do termo");
                significado_para_alterar = sc.nextLine();

                dic.put(chave_anterior, significado_para_alterar);
            }
            else{
                break;
            }

            System.out.println("-------------------------------------------");
        }
        sc.close();
        System.exit(0);
    }
}
