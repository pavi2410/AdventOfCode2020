val input = java.io.File("D:/GitHub/pavi2410/AdventOfCode2020-KT/inputs/Day6.txt").readText()

val groups = input.split("\n\n")

val output = groups.map {
    it.split("\n").map { it.toSet() }.reduce { acc, s -> acc intersect s }.size
}.sum()

println(output) // 3398