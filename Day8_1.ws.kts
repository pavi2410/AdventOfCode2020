val input = java.io.File("D:/GitHub/pavi2410/AdventOfCode2020-KT/inputs/Day8.txt").readLines()

var pc = 0
var acc = 0

val visitedLines = mutableListOf<Int>()

while (pc < input.size) {
    if (pc in visitedLines) break
    visitedLines += pc

    val (opcode, arg) = input[pc].split(" ")

    when (opcode) {
        "acc" -> {
            acc += arg.toInt()
            pc++
        }
        "jmp" -> pc += arg.toInt()
        "nop" -> pc++
    }
}

println(acc) // 1939