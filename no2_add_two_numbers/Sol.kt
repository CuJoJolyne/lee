package lee.demo

class Sol(name: String) {

    val firstProp = "First property: $name".also(::println)

    init {
        println("First init block that prints ${name}")
    }

    val secondProp = "Second property: ${name.length}".also(::println)

    init {
        println("Second init block that prints ${name.length}")
    }

    fun lengthOfLongestSubstring(s: String): Int {
        var currentLongLen: Int = 0
        var leftIndex: Int = 0
        var rightIndex: Int = leftIndex + 1
        if (s.length == 1) return 1
        while (leftIndex < s.length && (s.length - leftIndex) > currentLongLen
            && rightIndex < s.length) {
            var searchIndex: Int = leftIndex
            twoloop@while (rightIndex < s.length) {
                for (i in leftIndex..rightIndex-1) {
                    if (s.get(i) == s.get(rightIndex)) {
                        searchIndex = i
                        break@twoloop
                    }
                }
                var tempLen: Int = rightIndex - leftIndex + 1
                currentLongLen = if (tempLen > currentLongLen) tempLen else currentLongLen
                rightIndex += 1
            }
            var tempLen: Int = rightIndex - 1 - leftIndex + 1
            currentLongLen = if (tempLen > currentLongLen) tempLen else currentLongLen
            leftIndex = searchIndex + 1
            rightIndex += 1
        }
        return currentLongLen
    }

    fun test(p1: String) {
        println(p1)
    }
}
