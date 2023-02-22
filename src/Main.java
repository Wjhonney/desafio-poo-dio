import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    
    public static void main(String[] args) {
            Curso curso1 = new Curso("Curso Java", "Aqui vc vai aprender Java For Real", 50, 8, "Camila");
    
            Curso curso2 = new Curso("Curso JavaScript", "Aqui vc vai aprender JS for real", 25, 4, "Guanabara");
    
            Mentoria mentoria = new Mentoria("Mentoria em Java", "Aqui vc vai enteder Java!!!");
    
            System.out.println(curso1);
            System.out.println(curso2);
            System.out.println(mentoria);
    
            Bootcamp bootcamp = new Bootcamp();
            bootcamp.setNome("Bootcamp Java Developer");
            bootcamp.setDescricao("Descrição Bootcamp Java Developer");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria);
    
            Dev devCamila = new Dev();
            devCamila.setNome("Camila");
            devCamila.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
            devCamila.progredir();
            devCamila.progredir();
            System.out.println("-");
            System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
            System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
            System.out.println("XP:" + devCamila.calcularTotalXp());
    
            System.out.println("-------");
    
            Dev devJoao = new Dev();
            devJoao.setNome("Joao");
            devJoao.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
            devJoao.progredir();
            devJoao.progredir();
            devJoao.progredir();
            System.out.println("-");
            System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
            System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
            System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}
