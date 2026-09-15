public class Pizzaria {
    public static void main(String[] args) {

        // Pedido 1: Cliente montou a pizza completa
        Pizza pizzaEspecial = new Pizza.Builder("Grande")
                .comBordaRecheada("Catupiry")
                .comQueijo("Gorgonzola")
                .adicionarPepperoni()
                .adicionarBacon()
                .comBebida("Guaraná 2L")
                .fecharPedido();

        // Pedido 2: Cliente só escolheu o tamanho e bacon
        Pizza pizzaRapida = new Pizza.Builder("Média")
                .adicionarBacon()
                .fecharPedido();

        pizzaEspecial.mostrarPedido();
        pizzaRapida.mostrarPedido();
    }
}
