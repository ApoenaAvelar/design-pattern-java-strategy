package padrao.strategy;

public interface ModoClimatizacao {
    //Para ajustar o modo operacional
    public void setModoOperacional();
    //Para alterar a temperatura do modo de execução
    public void setTemperaturaModo(int temperatura);
    //Para obter o modo operacional e a temperatura
    public String getTemperatura();
}
