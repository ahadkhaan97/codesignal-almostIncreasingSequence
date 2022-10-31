fun main() {
    print(solution(mutableListOf(1, 2, 5, 3, 5)))
}

fun solution(sequence: MutableList<Int>): Boolean {
    var removingSteps = 0
    outer@ while (true) {
        for (i in 0 until sequence.size - 1) {
            if (sequence[i] >= sequence[i + 1]) {
                try {
                    if (sequence[i - 1] < sequence[i] && sequence[i - 1] < sequence[i + 1])
                        sequence.removeAt(i)
                    else
                        sequence.removeAt(i + 1)
                } catch (e: Exception) {
                    sequence.removeAt(i + 1)
                }
                removingSteps++
                continue@outer
            }
        }
        break
    }
    return removingSteps <= 1
}