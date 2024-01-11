import regexdsl.build

fun main() {
    val regex = build regex {
        starts with something
        followed with "@"
        followed with something
        followed with "."
        ends with "com" or "de" or "net"
    }

    print(regex)
}