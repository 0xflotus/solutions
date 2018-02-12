import java.io.IOException;

import static java.lang.Integer.parseInt;
import static java.lang.Math.min;
import static java.lang.System.out;
import static java.nio.file.Files.lines;
import static java.nio.file.Paths.get;

public class two {
    public static void main(String[] args) throws IOException {
        out.println(lines(get("/tmp/two.txt"))
                .map(e -> e.split("x"))
                .map(e -> {
                    Integer l = parseInt(e[0]);
                    Integer w = parseInt(e[1]);
                    Integer h = parseInt(e[2]);
                    return 2 * l * w + 2 * w * h + 2 * h * l + min(min(l * w, l * h), h * w);
                })
                .reduce(0, (a, i) -> a + i)
        );
    }
}
