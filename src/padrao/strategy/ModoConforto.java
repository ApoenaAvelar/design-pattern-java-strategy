package padrao.strategy;

public class ModoConforto implements ModoClimatizacao{

    private int temperaturaDoModo = 23;

    @Override
    public void setModoOperacional() {
        System.out.println("O modo foi ajustado para Conforto: " + temperaturaDoModo + "graus celsios" );
    }

    @Override
    public void setTemperaturaModo(int temperatura) {
        this.temperaturaDoModo = temperatura;
    }

    @Override
    public String getTemperatura() {
        String temperatura = "Modo conforto " + this.temperaturaDoModo + "graus C";
        return temperatura;
    }
}
