import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Cad {
    private String nome;   
    private Set<Conteudo> conteudosRetirados = new LinkedHashSet<>();
    private Set<Conteudo> conteudosEntregues = new LinkedHashSet<>();

    public void inscreverRegistro(Registro registro){
        this.conteudosRetirados.addAll(registro.getConteudos());
        registro.getCadsRetirados().add(this);
    }
                 
    public void devolver() {
        Optional<Conteudo> conteudo = this.conteudosRetirados.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosEntregues.add(conteudo.get());
            this.conteudosRetirados.remove(conteudo.get());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosRetirados() {
        return conteudosRetirados;
    }

    public void setConteudosRetirados(Set<Conteudo> conteudosRetirados) {
        this.conteudosRetirados = conteudosRetirados;
    }

    public Set<Conteudo> getConteudosEntregues() {
        return conteudosEntregues;
    }

    public void setConteudosEntregues(Set<Conteudo> conteudosEntregues) {
        this.conteudosEntregues = conteudosEntregues;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cad cad = (Cad) o;
        return Objects.equals(nome, cad.nome) && Objects.equals(conteudosRetirados, cad.conteudosRetirados) && Objects.equals(conteudosEntregues, cad.conteudosEntregues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosRetirados, conteudosEntregues);
    }
}