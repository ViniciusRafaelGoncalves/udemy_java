package application;

import java.io.*;
import java.util.*;

import entities.Itens;

public class Arquivo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Itens> list = new ArrayList<>();

        System.out.print("Digite o caminho do arquivo CSV de entrada: ");
        String strCaminho = sc.nextLine();
        // Exemplo: /home/vinicius/Downloads/produtos.csv

        File caminhoArquivo = new File(strCaminho);
        String pasta = caminhoArquivo.getParent();

        boolean success = new File(pasta + "/out").mkdir();
        String caminhoArquivoSaida = pasta + "/out/summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(strCaminho))) {
            String itemCsv = br.readLine();
            while (itemCsv != null) {

                String[] field = itemCsv.split(",");
                String name = field[0];
                double price = Double.parseDouble(field[1]);
                int quantity = Integer.parseInt(field[2]);

                list.add(new Itens(name, price, quantity));

                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivoSaida))) {

                for (Itens item : list) {
                    bw.write(item.getNome() + "," + String.format("%.2f", item.valorTotal()));
                    bw.newLine();
                }

                System.out.println("Arquivo gerado com sucesso em: " + caminhoArquivoSaida);

            } catch (IOException e) {
                System.out.println("Erro ao escrever o arquivo: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        sc.close();
    }
}
