package Votacao;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class Eleicao {

    public static void registrarVoto(String candidato) {
        try (FileWriter fw = new FileWriter("votos.txt", true); 
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(candidato); 
            bw.newLine(); 
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao registrar o voto: " + e.getMessage());
        }
    }

    public static String contabilizarVotos() {
        Map<String, Integer> votos = new HashMap<>(); 
        try (BufferedReader br = new BufferedReader(new FileReader("votos.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                votos.put(linha, votos.getOrDefault(linha, 0) + 1);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler os votos: " + e.getMessage());
            return null;
        }

        String vencedor = null;
        int maiorVoto = 0;
        for (Map.Entry<String, Integer> entry : votos.entrySet()) {
            if (entry.getValue() > maiorVoto) {
                maiorVoto = entry.getValue();
                vencedor = entry.getKey();
            }
        }
        return vencedor;
    }

    public static void main(String[] args) {
        while (true) {
            String candidato = JOptionPane.showInputDialog(null, "Digite o nome do candidato para votar:", "Votação", JOptionPane.QUESTION_MESSAGE);
            if (candidato == null || candidato.trim().isEmpty()) {
                break; 
            }

            registrarVoto(candidato);

            int continuar = JOptionPane.showConfirmDialog(null, "Você quer votar novamente?", "Continuar votação", JOptionPane.YES_NO_OPTION);
            if (continuar == JOptionPane.NO_OPTION) {
                break;
            }
        }

        String vencedor = contabilizarVotos();
        if (vencedor != null) {
            JOptionPane.showMessageDialog(null, "O vencedor da eleição é: " + vencedor, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
