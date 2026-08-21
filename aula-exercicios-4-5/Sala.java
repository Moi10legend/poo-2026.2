public class Sala{
    private String nome;
    private boolean ocupado;
    private Aluno[] turma;
    private int diaDeAula = 0;

    public Sala(String nome, boolean ocupado, Aluno[] turma){
        this.nome = nome;
        this.ocupado = ocupado;
        this.turma = turma;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public boolean getOcupado(){
        return this.ocupado;
    }

    public void alternar(){
        if(ocupado){
            this.ocupado = false;
            System.out.println("Agora a turma está desocupada.");
        }else{
            this.ocupado = true;
            System.out.println("Agora a turma está ocupada.");
        }
    }

    public Aluno[] getTurma(){
        return this.turma;
    }

    public void setTurma(Aluno[] turma){
        this.turma = turma;
    }

    public int getDiaDeAula(){
        return this.diaDeAula;
    }

    public void setDiaDeAula(int diaDeAula){
        this.diaDeAula = diaDeAula;
    }
}