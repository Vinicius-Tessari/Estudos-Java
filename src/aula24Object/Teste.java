package aula24Object;

public class Teste {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setCurso("TADS");
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 = "asfcduyagsd";
        String s2 = "asfcduyagsd";
        System.out.println(s1.equals(s2));

        Aluno aluno2 = new Aluno();

        aluno2.setCurso("TADS");
        double[] notas2 = {10, 9, 8, 7};
        aluno2.setNotas(notas2);

        System.out.println(aluno.equals(aluno2));

    }
}
