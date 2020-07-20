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

    fun twoSum(nums: IntArray, target: Int): IntArray {
        //var (i, j) = listOf(-1, -1)
        mainloop@ for (index_i in nums.indices) {
            println("first, ${nums[index_i]}")
            for (index_j in index_i+1..nums.size-1) {
                println("second, ${nums[index_j]}")
                //if (index_j == index_i) continue
                if (nums[index_i] + nums[index_j] == target) {
                    //i = index_i
                    //j = index_j
                    println("find !!!")
                    //break@mainloop
                    return intArrayOf(index_i, index_j)
                }
            }
        }
        throw IllegalArgumentException("No two sum solution");
        //return intArrayOf(i, j)
    }

    fun test(p1: String) {
        println(p1)
    }
}
