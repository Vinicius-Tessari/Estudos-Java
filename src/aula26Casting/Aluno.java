package aula26Casting;

class Aluno extends Pessoa{

    private String curso;
    private double[] notas;

    public void verificarAcesso(){
        //super.numeroTelefone = "9876475";
    }

    public Aluno(){
        super(); //chamando o construtor da superclasse
    }

    public Aluno(String nome, String endereco, String telefone, String cpf, String curso) {
        //super(nome, endereco, telefone, cpf);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        return 0;
    }

    public boolean verificarAprovado(){
        return false;
    }
}