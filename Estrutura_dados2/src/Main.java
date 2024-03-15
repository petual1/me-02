//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Vetor lista = new Vetor();

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();
        Aluno a6 = new Aluno();
        Aluno a7 = new Aluno();
        Aluno a8 = new Aluno();
        Aluno a9 = new Aluno();
        Aluno a10 = new Aluno();
        Aluno a11 = new Aluno();
        Aluno a12 = new Aluno();
        Aluno a13 = new Aluno();
        Aluno a14 = new Aluno();
        Aluno a15 = new Aluno();
        Aluno a16 = new Aluno();
        Aluno a17 = new Aluno();

        a1.setNome("Glevson");
        a2.setNome("Francisco");
        a3.setNome("Maria");
        a4.setNome("João");
        a5.setNome("José");
        a6.setNome("Miguel");
        a7.setNome("gunga");
        a8.setNome("Glevson");
        a9.setNome("Francisco");
        a10.setNome("Maria");
        a11.setNome("João");
        a12.setNome("José");
        a13.setNome("Miguel");
        a14.setNome("Teste");
        a15.setNome("Teste");
        a16.setNome("Katia");
        a17.setNome("Camila");

        System.out.println("\nAlunos: "+ a2.getNome());
        System.out.println("Alunos: "+ a1.getNome());


        lista.Adiciona(a1);
        lista.Adiciona(a2);
        lista.Adiciona(a3);
        lista.Adiciona(a4);
        lista.Adiciona(a5);
        lista.Adiciona(a6);
        lista.Adiciona(a7);
        lista.Adiciona(a8);
        lista.Adiciona(a9);
        lista.Adiciona(a10);
        lista.Adiciona(a11);
        lista.Adiciona(a12);
        lista.Adiciona(a13);
        lista.Adiciona(a14);
        lista.Adiciona(a15);

        System.out.println("Total de alunos: " +lista.getTotalDealunos());

        System.out.println(lista);

        System.out.println(lista.contem(a15));

        System.out.println(lista.pega(14));

        lista.remove(2);
        System.out.println(lista);

        lista.remove(0);
        System.out.println("Com alunos removidos: "+lista);

        lista.adicionaPosicao(7, a16);
        System.out.println("Com alunos novos inseridos: "+lista);

        lista.adicionaPosicao(7, a17);
        System.out.println("Com alunos novos inseridos: "+lista);


    }
}