public class Professor{
    private String nome;
    private int idade;
    private int matricula;
    private Sala sala;

    public Professor(String nome, int idade, int matricula, Sala sala){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.sala = sala;
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

    public int getMatricula(){
        return this.matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public Sala getSala(){
        return this.sala;
    }

    public void setSala(Sala sala){
        this.sala = sala;
    }

    public void inciarAula(){
        if(sala.getOcupado()){
            System.out.println("A sala está ocupada");
        }else{
            System.out.println("A aula está acontecendo com o professor " + this.nome + " matricula: " + this.matricula);
            sala.alternar();
        }
    }

    public void Chamada(boolean[] presencasDoDias){
        Aluno[] turma = sala.getTurma();
        for(int i = 0; i < turma.length; i++){
            turma[i].pre 
        }
    }
}