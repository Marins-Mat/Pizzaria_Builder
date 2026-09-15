public class Pizza {

    private final String tamanho;
    private final String tipoBorda;
    private final String queijo;
    private final boolean pepperoni;
    private final boolean bacon;
    private final String bebida;

    private Pizza(Builder builder) {
        this.tamanho = builder.tamanho;
        this.tipoBorda = builder.tipoBorda;
        this.queijo = builder.queijo;
        this.pepperoni = builder.pepperoni;
        this.bacon = builder.bacon;
        this.bebida = builder.bebida;
    }

    public void mostrarPedido() {
        System.out.println("Resumo do Pedido:");
        System.out.println("- Tamanho: " + tamanho);
        System.out.println("- Borda: " + (tipoBorda != null ? tipoBorda : "Tradicional"));
        System.out.println("- Queijo: " + (queijo != null ? queijo : "Mussarela"));
        System.out.println("- Pepperoni: " + (pepperoni ? "Sim" : "Não"));
        System.out.println("- Bacon: " + (bacon ? "Sim" : "Não"));
        System.out.println("- Bebida: " + (bebida != null ? bebida : "Nenhuma") + "\n");
    }

    // O Garçom / Aplicativo (Builder)
    public static class Builder {
        private final String tamanho; // Obrigatório
        private String tipoBorda;
        private String queijo;
        private boolean pepperoni;
        private boolean bacon;
        private String bebida;

        public Builder(String tamanho) {
            this.tamanho = tamanho;
        }

        public Builder comBordaRecheada(String saborBorda) {
            this.tipoBorda = saborBorda;
            return this;
        }

        public Builder comQueijo(String tipoQueijo) {
            this.queijo = tipoQueijo;
            return this;
        }

        public Builder adicionarPepperoni() {
            this.pepperoni = true;
            return this;
        }

        public Builder adicionarBacon() {
            this.bacon = true;
            return this;
        }

        public Builder comBebida(String bebida) {
            this.bebida = bebida;
            return this;
        }

        public Pizza fecharPedido() {
            return new Pizza(this);
        }
    }
}
