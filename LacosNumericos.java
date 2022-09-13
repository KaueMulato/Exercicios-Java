public class LacosNumericos {
    public static void main(String[] args) {
        // 1 2 3 4 5 6 7 8 9 10
        // para uma variavel que inicia em 1; e vai até 10; mudando 1-por-1, faça:

        // ==Laços aninhados==
        for (var i = 1; i <= 10; i++) {
            for (var j = 1; j<= 10 ; j++) {
                System.out.println(j + "x" + i + " = " + i * j);
            }
        }
    }
}
