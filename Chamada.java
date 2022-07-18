package Exercicios;

public class main {
    public static void main(String[] args) {
        // Mensagem
        System.out.println("Exercicio mensagem");
        mensagem.obterMensagem(11);
        mensagem.obterMensagem(15);
        mensagem.obterMensagem(4);

        // Emprestimo
        System.out.println("Exercicio emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
