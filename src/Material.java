public class Material extends Conteudo {

	public Material() {
	    }

	@Override
	public String toString() {
		return "Material1]\n " + " Produto:['" + getItem() + '\'' + "] \n  Descricao ['" + getDescricao() + '\'' + "]";
	}
}