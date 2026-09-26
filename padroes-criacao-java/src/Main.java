public class Main {
    public static void main(String[] args) {

        // Aluno de graduacao usa a fabrica Singleton de graduacao
        Aluno alunoGraduacao = new Aluno(FabricaGraduacao.getInstancia());
        alunoGraduacao.exibirDocumentos();

        // Aluno de pos-graduacao usa a fabrica Singleton de pos
        Aluno alunoPos = new Aluno(FabricaPosGraduacao.getInstancia());
        alunoPos.exibirDocumentos();

        // Prova de que a fabrica e Singleton (mesma instancia sempre)
        System.out.println(
            FabricaGraduacao.getInstancia() == FabricaGraduacao.getInstancia()
        );
    }
}
