import com.sun.security.jgss.GSSUtil;
import model.*;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();
        Arrays.stream(frase.toUpperCase().split(" "))
                .distinct()
                .sorted()
                .forEach(palavra -> System.out.println(palavra));

    }

}
