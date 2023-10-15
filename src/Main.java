import padrao.strategy.*;


public class Main {
    public static void main(String[] args) {
        ModoClimatizacao conforto = new ModoConforto();
        ModoClimatizacao economia = new ModoEconomia();
        ModoClimatizacao equipamentos = new ModoEquipamentos();

        SistemaClimatizacao climatizador = new SistemaClimatizacao();
        climatizador.setModoOperacional(conforto);
        System.out.println(climatizador.getTemperatura());
        climatizador.setModoOperacional(economia);
        System.out.println(climatizador.getTemperatura());
        climatizador.setModoOperacional(equipamentos);
        System.out.println(climatizador.getTemperatura());
        


    }
}