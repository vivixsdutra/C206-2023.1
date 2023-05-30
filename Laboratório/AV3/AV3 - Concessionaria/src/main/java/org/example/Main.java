import java.util.Comparator;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


class ValorInvalidoException extends Exception {
    public ValorInvalidoException(String message) {
        super(message);
    }
}

class Veiculo {
    private String marca;
    private int ano;
    private int kmRodados;
    private String motor;
    private int potencia;
    private int numCilindros;

    public Veiculo(String marca, int ano, int kmRodados, String motor, int potencia, int numCilindros)
            throws ValorInvalidoException {
        if (kmRodados < 0) {
            throw new ValorInvalidoException("Quilometragem inválida");
        }
        if (ano < 1960 || ano > 2024) {
            throw new ValorInvalidoException("Ano inválido");
        }
        if
        (!marca.equals("Rolls-Royce") && !marca.equals("Bentley")) {
            throw new ValorInvalidoException("Marca inválida");

        }
        if (potencia <= 0 || numCilindros <= 0) {
            throw new ValorInvalidoException("Motor inválido");
        }

        this.marca = marca;
        this.ano = ano;
        this.kmRodados = kmRodados;
        this.motor = motor;
        this.potencia = potencia;
        this.numCilindros = numCilindros;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public int getKmRodados() {
        return kmRodados;
    }

    public String getMotor() {
        return motor;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getNumCilindros() {
        return numCilindros;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Ano: " + ano + ", Quilometragem: " + kmRodados + ", Motor: " + motor
                + ", Potência: " + potencia + ", Número de cilindros: " + numCilindros;
    }
}

class Arquivo {
    public static ArrayList<Veiculo> ler(String nomeArquivo) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo));
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                String marca = dados[0];
                int ano = Integer.parseInt(dados[1]);
                int kmRodados = Integer.parseInt(dados[2]);
                String motor = dados[3];
                int potencia = Integer.parseInt(dados[4]);
                int numCilindros = Integer.parseInt(dados[5]);
                Veiculo veiculo = new Veiculo(marca, ano, kmRodados, motor, potencia, numCilindros);
                veiculos.add(veiculo);
            }
            reader.close();
        } catch (IOException | ValorInvalidoException e) {
            System.out.println("Erro ao ler os veículos do arquivo: " + e.getMessage());
        }

        return veiculos;
    }

    public static void salvar(ArrayList<Veiculo> veiculos, String nomeArquivo) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo));
            for (Veiculo veiculo : veiculos) {
                writer.write(
                        veiculo.getMarca() + "," + veiculo.getAno() + "," + veiculo.getKmRodados() + "," + veiculo
                                .getMotor() + "," + veiculo.getPotencia() + "," + veiculo.getNumCilindros());
                writer.newLine();
            }
            writer.close();
            System.out.println("Veículos salvos no arquivo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os veículos no arquivo: " + e.getMessage());
        }
    }
}

class ConcessionariaApp {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("======= MENU =======");
            System.out.println("1. Cadastrar veículo");
            System.out.println("2. Mostrar veículos cadastrados");
            System.out.println("3. Ordenar veículos por ano");
            System.out.println("4. Mostrar quantidade de veículos por marca");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    try {
                        System.out.print("Digite a marca do veículo (Rolls-Royce/Bentley): ");
                        String marca = scanner.nextLine();
                        System.out.print("Digite o ano do veículo: ");
                        int ano = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Digite a quilometragem do veículo: ");
                        int kmRodados = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Digite o motor do veículo: ");
                        String motor = scanner.nextLine();
                        System.out.print("Digite a potência do motor: ");
                        int potencia = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Digite o número de cilindros do motor: ");
                        int numCilindros = scanner.nextInt();
                        scanner.nextLine();

                        Veiculo veiculo = new Veiculo(marca, ano, kmRodados, motor, potencia, numCilindros);
                        veiculos.add(veiculo);
                        System.out.println("Veículo cadastrado com sucesso!");
                    } catch (ValorInvalidoException e) {
                        System.out.println("Erro ao cadastrar veículo: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Veículos cadastrados:");
                    for (Veiculo veiculo : veiculos) {
                        System.out.println(veiculo);
                    }
                    break;
                case 3:
                    Collections.sort(veiculos, Comparator.comparingInt(Veiculo::getAno).reversed());
                    System.out.println("Veículos ordenados por ano em ordem decrescente:");
                    for (Veiculo veiculo : veiculos) {
                        System.out.println(veiculo);
                    }
                    break;
                case 4:
                    int rollsRoyceCount = 0;
                    int bentleyCount = 0;
                    for (Veiculo veiculo : veiculos) {
                        if (veiculo.getMarca().equals("Rolls-Royce")) {
                            rollsRoyceCount++;
                        } else if (veiculo.getMarca().equals("Bentley")) {
                            bentleyCount++;
                        }
                    }
                    System.out.println("Quantidade de veículos de cada marca:");
                    System.out.println("Rolls-Royce: " + rollsRoyceCount);
                    System.out.println("Bentley: " + bentleyCount);
                    break;
                case 5:
                    Arquivo.salvar(veiculos, "veiculos.txt");
                    System.out.println("Programa encerrado. Veículos salvos no arquivo veiculos.txt.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
            }
        }
    }
}
