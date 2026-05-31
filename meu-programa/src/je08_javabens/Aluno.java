package je08_javabens;

public class Aluno {

    private String nome;
    private int idade = 0;

    public String getNome(){
        return nome;
    }

    public void setNome(String newNome){
        nome = newNome;
    }


        public void setIdade(int newIdade){
            if(newIdade < 0){
                throw new IllegalArgumentException("O valor da idade dever ser supeior a 0");
            }
            this.idade = newIdade;
        }


}
