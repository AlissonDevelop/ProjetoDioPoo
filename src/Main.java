import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        
        Material material1 = new Material();
        material1.setItem("Caderno");
        material1.setDescricao("Gangster 500 folhas tamanho G");
        
        Material2 material2 = new Material2();
        material2.setItem("Prancheta");
        material2.setDescricao("De madeira 20x40");

        Material material3 = new Material();
        material3.setItem("Caneta");
        material3.setDescricao("Bic Azul");
        
        Material2 material4 = new Material2();
        material4.setItem("Cola");
        material4.setDescricao("Tenas 10g");         
        
        
        
        Registro registro = new Registro();
        registro.getConteudos().add(material1);
        registro.getConteudos().add(material2);

        Registro registro2 = new Registro();
        registro2.getConteudos().add(material3);
        registro2.getConteudos().add(material4);
        
        Cad cadAlisson = new Cad();
        cadAlisson.setNome("Alisson");
        cadAlisson.inscreverRegistro(registro);
        System.out.println("Retirado pelo(a) colaborador(a) Alisson:" + "\n  " + cadAlisson.getConteudosRetirados());
        cadAlisson.devolver();
        cadAlisson.devolver();        

        System.out.println(" ");        
        System.out.println(" ");        
        System.out.println("Entregue pelo(a) colaborador(a) Alisson:" + "\n  " + cadAlisson.getConteudosEntregues());
        
        System.out.println(" ");        
        System.out.println(" ");        
        System.out.println(" ");        
        System.out.println(" ");
        
        Cad cadMarcia = new Cad();
        cadMarcia.setNome("Marcia");
        cadMarcia.inscreverRegistro(registro2);
        System.out.println("Retirado pelo(a) colaborador(a) Marcia:" + "\n  " + cadMarcia.getConteudosRetirados());
        cadMarcia.devolver();     

        System.out.println(" ");        
        System.out.println(" ");        
        System.out.println("Entregue pelo(a) colaborador(a) Marcia:" + "\n  " + cadMarcia.getConteudosEntregues());


    }

}