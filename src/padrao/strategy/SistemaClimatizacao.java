package padrao.strategy;

public class SistemaClimatizacao
{
    private ModoClimatizacao modoOperacional;

  
    public void setModoOperacional(ModoClimatizacao modoOperacional) {
        this.modoOperacional = modoOperacional;
    }

    public String getTemperatura(){
      //  modoOperacional.setModoOperacional();
        return modoOperacional.getTemperatura();
    }
}
