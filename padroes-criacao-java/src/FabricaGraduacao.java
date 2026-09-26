public class FabricaGraduacao implements FabricaAbstrata {

    private static FabricaGraduacao instancia;

    private FabricaGraduacao() {}

    public static FabricaGraduacao getInstancia() {
        if (instancia == null) {
            instancia = new FabricaGraduacao();
        }
        return instancia;
    }

    @Override
    public Historico criarHistorico() {
        return new HistoricoGraduacao();
    }

    @Override
    public Diploma criarDiploma() {
        return new DiplomaGraduacao();
    }
}
