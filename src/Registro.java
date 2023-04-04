import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class  Registro {
    private String nome;
    private String descricao;
    private Set<Cad> cadsRetirados = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Cad> getCadsRetirados() {
        return cadsRetirados;
    }

    public void setCadsRetirados(Set<Cad> cadsRetirados) {
        this.cadsRetirados = cadsRetirados;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registro registro = (Registro) o;
        return Objects.equals(nome, registro.nome) && Objects.equals(descricao, registro.descricao) && Objects.equals(cadsRetirados, registro.cadsRetirados) && Objects.equals(conteudos, registro.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, cadsRetirados, conteudos);
    }
}