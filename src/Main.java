import hash.Hash;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Hash hash = new Hash();

        hash.mask();

        int sum = IntStream.rangeClosed(1,10)
                     .reduce(((left, right) -> left + right))
                     .orElse(0);
    }
}
