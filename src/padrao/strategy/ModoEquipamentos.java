package padrao.strategy;

public class ModoEquipamentos implements ModoClimatizacao{
    private int temperaturaDoModo = 17;

    @Override
    public void setModoOperacional() {
        System.out.println("O modo foi ajustado para Equipamentos: " + temperaturaDoModo + "graus celsios" );
    }

    @Override
    public void setTemperaturaModo(int temperatura) {
        this.temperaturaDoModo = temperatura;
    }

    @Override
    public String getTemperatura() {
        String temperatura = "Modo Equipamentos " + this.temperaturaDoModo + "graus C";
        return temperatura;
    }
}


