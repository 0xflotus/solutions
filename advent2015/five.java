import java.io.IOException;

import static java.nio.file.Files.lines;
import static java.nio.file.Paths.get;
import static java.util.Arrays.asList;
import static java.util.stream.Stream.of;

public class five {
    public static void main(String[] args) throws IOException {
        System.out.println(lines(get("/tmp/five.txt"))
                .filter(s -> s.chars().filter(i -> asList('a', 'i', 'e', 'o', 'u').contains((char) i)).count() > 2)
                .filter(s -> of("ab,cd,pq,xy".split(",")).noneMatch(s::contains))
                .filter(f -> of("abcdefghijklmnopqrstuvwxyz".split("")).map(str -> str + str).anyMatch(f::contains))
                .count());
    }
}
