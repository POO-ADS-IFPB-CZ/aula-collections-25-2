import com.sun.security.jgss.GSSUtil;
import model.*;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> numeros = random
            .ints(30, 0, 100)
                .boxed()
                .toList();
        System.out.println(numeros);

    }

}
