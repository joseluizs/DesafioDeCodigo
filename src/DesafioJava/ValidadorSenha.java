package DesafioJava;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidadorSenha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Digite a senha para verificar a força:");
        String senha = scanner.nextLine();
        //scanner.close();

        String resultado = verificarForcaSenha(senha);
        System.out.println(resultado);
    }

    public static String verificarForcaSenha(String senha) {
        int comprimentoMinimo = 8;

        // Critérios de validação usando expressões regulares
        boolean temLetraMaiuscula = Pattern.compile("[A-Z]").matcher(senha).find();
        boolean temLetraMinuscula = Pattern.compile("[a-z]").matcher(senha).find();
        boolean temNumero = Pattern.compile("\\d").matcher(senha).find();
        boolean temCaractereEspecial = Pattern.compile("\\W").matcher(senha).find();
        boolean temSequenciaComum = senha.matches(".*(?i)123456.*|.*(?i)abcdef.*");
        boolean temPalavraComum = senha.equalsIgnoreCase("password") || senha.equalsIgnoreCase("123456") || senha.equalsIgnoreCase("qwerty");

        // Verificação do comprimento mínimo
        if (senha.length() < comprimentoMinimo) {
            return "Sua senha é muito curta. Recomenda-se no mínimo 8 caracteres.";
        }

        // Verificação dos critérios individuais
        if (!temLetraMaiuscula) {
            return "Sua senha deve conter pelo menos uma letra maiúscula (A-Z).";
        }

        if (!temLetraMinuscula) {
            return "Sua senha deve conter pelo menos uma letra minúscula (a-z).";
        }

        if (!temNumero) {
            return "Sua senha deve conter pelo menos um número (0-9).";
        }

        if (!temCaractereEspecial) {
            return "Sua senha deve conter pelo menos um caractere especial, como !, @, #, $, %, etc.";
        }

        // Verificação de sequências comuns e palavras comuns
        if (temSequenciaComum || temPalavraComum) {
            return "Sua senha não atende aos requisitos de segurança.";
        }

        return "Sua senha atende aos requisitos de segurança. Parabéns!";
    }
}