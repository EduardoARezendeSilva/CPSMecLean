import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static ArrayList<Mecanico> mecanicoslst = new ArrayList<Mecanico>();
    static ArrayList<Mecanica> mecanicaslst = new ArrayList<Mecanica>();
    static ArrayList<Cliente> clienteslst = new ArrayList<Cliente>();

    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        int operacao = 0, opcao = 0;
        String email = "";
        do
        {
            System.out.print(mnoperacao());
            operacao = ler.nextInt();
            ler.nextLine();

            if (operacao == 1)
            {
                do
                {
                    System.out.print(mnopcao());
                    opcao = ler.nextInt();
                    ler.nextLine();

                    if (opcao == 1)
                    {
                        Mecanica mecanica = new Mecanica();

                        System.out.print("Informe o Email: ");
                        email = ler.nextLine();

                        if (email.equals(""))
                        {
                            do
                            {
                                System.out.print("Email Inavlido: ");
                                email = ler.nextLine();
                            }while (email.equals(""));
                        }

                        if (verificarEmail(email))
                        {
                            do
                            {
                                System.out.print("Email Inavlido: ");
                                email = ler.nextLine();
                            }while (verificarEmail(email));
                        }

                        mecanica.pessoa.autenticacao.setEmail(email);

                        System.out.print("Informe a senha: ");
                        mecanica.pessoa.autenticacao.setSenha(ler.nextLine());

                        mecanica.CadastraMecanica(ler);

                        mecanicaslst.add(mecanica);

                        opcao = 99;
                    }
                    else if (opcao == 2)
                    {
                        Mecanico mecanico = new Mecanico();

                        System.out.print("Informe o Email: ");
                        email = ler.nextLine();

                        if (email.equals(""))
                        {
                            do
                            {
                                System.out.print("Email Inavlido: ");
                                email = ler.nextLine();
                            }while (email.equals(""));
                        }

                        if (verificarEmail(email))
                        {
                            do
                            {
                                System.out.print("Email Inavlido: ");
                                email = ler.nextLine();
                            }while (verificarEmail(email));
                        }

                        mecanico.pessoa.autenticacao.setEmail(email);

                        System.out.print("Informe a senha: ");
                        mecanico.pessoa.autenticacao.setSenha(ler.nextLine());

                        mecanico.CadastraMecanico(ler);

                        mecanicoslst.add(mecanico);

                        opcao = 99;
                    }
                    else if (opcao == 3)
                    {
                        Cliente cliente = new Cliente();

                        System.out.print("Informe o Email: ");
                        email = ler.nextLine();

                        if (email.equals(""))
                        {
                            do
                            {
                                System.out.print("Email Inavlido: ");
                                email = ler.nextLine();
                            }while (email.equals(""));
                        }

                        if (verificarEmail(email))
                        {
                            do
                            {
                                System.out.print("Email Inavlido: ");
                                email = ler.nextLine();
                            }while (verificarEmail(email));
                        }

                        cliente.pessoa.autenticacao.setEmail(email);

                        System.out.print("Informe a senha: ");
                        cliente.pessoa.autenticacao.setSenha(ler.nextLine());

                        cliente.CadastraCliente(ler);

                        clienteslst.add(cliente);

                        opcao = 99;
                    }

                } while (opcao != 99);
            }
            else if (operacao == 2)
            {
                System.out.print("Informe o Email: ");
                email = ler.nextLine();

                System.out.print("Informe a Senha: ");

                System.out.print(verificarLogin(email, ler.nextLine()) + "\n");
            }

        }while (operacao != 99);
    }

    public static boolean verificarEmail(String email)
    {
        for (Mecanica mecanica: mecanicaslst) {
            if (mecanica.pessoa.autenticacao.verificarEmail(email))
            {
                return true;
            }
        }

        for (Mecanico mecanico: mecanicoslst) {
            if (mecanico.pessoa.autenticacao.verificarEmail(email))
            {
                return true;
            }
        }

        for (Cliente cliente: clienteslst) {
            if (cliente.pessoa.autenticacao.verificarEmail(email))
            {
                return true;
            }
        }

        return false;
    }

    public static String verificarLogin(String email, String senha)
    {
        for (Mecanica mecanica: mecanicaslst) {
            if (mecanica.pessoa.autenticacao.validarLogin(email, senha))
            {
                return "Este usuario e uma Mecanica";
            }
        }

        for (Mecanico mecanico: mecanicoslst) {
            if (mecanico.pessoa.autenticacao.validarLogin(email, senha))
            {
                return "Este usuario e um Mecanico";
            }
        }

        for (Cliente cliente: clienteslst) {
            if (cliente.pessoa.autenticacao.validarLogin(email, senha))
            {
                return "Este usuario e um Cliente";
            }
        }

        return "Login Invalido";
    }

    public static String mnopcao() {
        return "1 - Mecanica\n2 - Mecanico\n3 - Cliente\n99 - Sair\nOpção: ";
    }

    public static String mnoperacao() {
        return "1 - cadastrar\n2 - logar\n99 - Sair\nOperação: ";
    }
}