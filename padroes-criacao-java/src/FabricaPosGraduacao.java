public class FabricaPosGraduacao implements FabricaAbstrata {

    private static FabricaPosGraduacao instancia;

    private FabricaPosGraduacao() {}

    public static FabricaPosGraduacao getInstancia() {
        if (instancia == null) {
            instancia = new FabricaPosGraduacao();
        }
        return instancia;
    }

    @Override
    public Historico criarHistorico() {
        return new HistoricoPosGraduacao();
    }

    @Override
    public Diploma criarDiploma() {
        return new DiplomaPosGraduacao();
    }
}
