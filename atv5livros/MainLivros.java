package atv5livros;

import java.util.ArrayList;
import java.util.Scanner;

public class MainLivros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Livro> livros = new ArrayList<>();

        int op = 0;
        while(op!=5){
            System.out.println("========= MENU ========");
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - EXIBIR");
            System.out.println("3 - ALTERAR");
            System.out.println("4 - REMOVER");
            System.out.println("5 - SAIR");
            System.out.println("Insira a opção que deseja:");
            op = sc.nextInt();
            sc.nextLine(); 

            switch (op) {
                case 1:
                    System.out.println("Insira o título:");
                    String titulo = sc.nextLine();
                    System.out.println("Insira o nome do autor:");
                    String autor = sc.nextLine();
                    System.out.println("Insira o ano de publicação:");
                    int anoPublicacao = sc.nextInt();
                    System.out.println("Insira o preço:");
                    double preco = sc.nextDouble();
                    livros.add(new Livro(titulo, autor, anoPublicacao, preco));
                    break;
                case 2:
                    System.out.println("LIVROS CADASTRADOS");
                    for (Livro l: livros){
                        l.exibeInformacoes();
                    }
                    break;
                case 3:
                    System.out.println("Insira o título do livro que deseja alterar:");
                    String alterarTitulo = sc.nextLine();
                    boolean resultado = false;

                    for(Livro l: livros){
                        if(l.getTitulo().equalsIgnoreCase(alterarTitulo)){
                            System.out.println("Livro encontrado!");
                            System.out.println("Insira o título novo para o livro:");
                            l.setTitulo(sc.nextLine());
                            System.out.println("Insira o novo autor:");
                            l.setAutor(sc.nextLine());
                            System.out.println("Insira o ano de publicação:");
                            l.setAnoPublicacao(sc.nextInt());
                            System.out.println("Insira o novo preço:");
                            l.setPreco(sc.nextDouble());
                            sc.nextLine();

                            resultado = true;
                            break;
                            }
                        }
                        if (!resultado){
                            System.out.println("Livro não encontrado!");
                        }
                        break;
                case 4:
                    System.out.println("Insira o título do livro que deseja alterar:");
                    String tituloRemover = sc.nextLine();
                    resultado = false;
                    
                    for (int i=0;i<livros.size();i++){
                         if (livros.get(i).getTitulo().equalsIgnoreCase(tituloRemover)){
                            livros.remove(i);
                            System.out.println("Livro removido com sucesso!");
                            resultado = true;
                            break;
                         }  
                    } 
                    if (!resultado){
                        System.out.println("Livro não encontrado!");
                    }
                    break;
                case 5:
                    System.out.println("Finalizando programa...");
                    sc.close();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

    }
}
