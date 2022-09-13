import java.time.LocalDate; //Import para a data atual.
import java.time.LocalDateTime; //Importa da hora atual
import java.time.format.TextStyle; //
import java.util.Locale; //import para a localização local

public class StringEDatas {
    public static void main(String[] args) {
        //Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA.

        var nome = "Kauê";

        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt","BR");
        //Locale brasil = new Locale("pt","BR");
        var diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();

        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() <24) {
            saudacao = "boa Noite";
        } else {
            saudacao = "Olá";
        }

        // %s = string a ser declarada no printf
        // %n = quebra de linha dentro do printf
        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
    }
}
