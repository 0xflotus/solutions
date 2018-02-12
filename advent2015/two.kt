import java.lang.Integer.parseInt
import java.lang.Math.min
import java.nio.file.Files.lines
import java.nio.file.Paths.get

fun main(args: Array<String>) =
        println(lines(get("/tmp/two.txt"))
                .map {
                    it.split("x".toRegex()).dropLastWhile {
                        it.isEmpty()
                    }.toTypedArray()
                }
                .map {
                    val l = parseInt(it[0])
                    val w = parseInt(it[1])
                    val h = parseInt(it[2])
                    2 * l * w + 2 * w * h + 2 * h * l + min(min(l * w, l * h), h * w)
                }
                .reduce(0) { i, a ->
                    i!! + a!!
                })
