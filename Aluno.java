import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private FichaAvaliacao fichaAvaliacao;
    private List<Treino> treinos;

    public Aluno(String nome, String cpf, String dataNascimento, double peso, double altura, String observacoes) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;

        // Composição: a ficha é criada junto com o aluno
        this.fichaAvaliacao = new FichaAvaliacao(peso, altura, observacoes);

        // Agregação: lista de treinos que existem independentemente do aluno
        this.treinos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public FichaAvaliacao getFichaAvaliacao() {
        return fichaAvaliacao;
    }

    public List<Treino> getTreinos() {
        return treinos;
    }

    public void adicionarTreino(Treino treino) {
        treinos.add(treino);
    }

    public void listarTreinos() {
        for (Treino treino : treinos) {
            System.out.println(treino.descricao());
        }
    }
}