val input = java.io.File("D:/GitHub/pavi2410/AdventOfCode2020-KT/inputs/Day5.txt").readLines()

var output = input.map {
    it
            .replace('F', '0')
            .replace('B', '1')
            .replace('R', '1')
            .replace('L', '0')
}.map { it.toInt(2) }.max()

println(output) // 880