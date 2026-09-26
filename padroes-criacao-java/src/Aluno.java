public class Aluno {

    private Historico historico;
    private Diploma diploma;

    public Aluno(FabricaAbstrata fabrica) {
        this.historico = fabrica.criarHistorico();
        this.diploma = fabrica.criarDiploma();
    }

    public void exibirDocumentos() {
        historico.imprimir();
        diploma.imprimir();
    }
}
