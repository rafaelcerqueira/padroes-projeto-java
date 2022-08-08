package subsistema2.cep;

public class CepApi {
    private CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return getInstancia();
    }

    public String recuperarCidade(String cep) {
        return "Cidade";
    }
}
