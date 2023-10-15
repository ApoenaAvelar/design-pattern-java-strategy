package padrao.strategy;

public class ModoEconomia implements ModoClimatizacao{
        private int temperaturaDoModo = 25;

        @Override
        public void setModoOperacional() {
            System.out.println("O modo foi ajustado para Economia: " + temperaturaDoModo + "graus celsios" );
        }

        @Override
        public void setTemperaturaModo(int temperatura) {
            this.temperaturaDoModo = temperatura;
        }

        @Override
        public String getTemperatura() {
            String temperatura = "Modo Economia " + this.temperaturaDoModo + "graus C";
            return temperatura;
        }
    }