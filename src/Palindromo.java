import java.text.Normalizer;
import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String palindromo = "";
        
        System.out.println("Digite uma palavra: ");
        String palavra = teclado.nextLine();

        palavra = Normalizer.normalize(palavra, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        
        for (int i = (palavra.length() -1); i >= 0; i--) {
        	palindromo = palindromo + palavra.charAt(i);
        }
        
        
        if (palindromo.toUpperCase().equals(palavra.toUpperCase())) {
            System.out.println(palavra + " é palíndromo!");
        } else {
            System.out.println(palavra + " não é palíndromo!");
        }
        
    }
    
}
