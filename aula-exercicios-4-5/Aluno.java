public class Aluno{
    private String nome;
    private int idade;
    private int matricula;
    private boolean[] presenca;

    public Aluno(String nome, int idade, int matricula){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int matricula(){
        return this.matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public boolean getPresenca(){
        return this.presenca;
    }

    public void setPresenca(boolean presenca, int indice){
        this.presenca[indice] = presenca;
    }

}