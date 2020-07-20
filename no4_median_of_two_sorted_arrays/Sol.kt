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

    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        var len1: Int = nums1.size
        var len2: Int = nums2.size
        var mixLen: Int = len1 + len2
        if (mixLen % 2 == 0) {
            var left: Int = findKthElementOfMixedArray(nums1, 0, nums2, 0, mixLen/2 - 1)
            println("left = ${left}")
            var right: Int = findKthElementOfMixedArray(nums1, 0 ,nums2, 0, mixLen/2)
            println("right = ${right}")
            return ((left + right) / 2.0)
        } else {
            return findKthElementOfMixedArray(nums1, 0, nums2, 0, mixLen/2).toDouble()
        }
    }

    // kth is the element index, valid range from 0 to array.size-1
    private fun findKthElementOfMixedArray(A: IntArray, aStartIdx: Int, B: IntArray, bStartIdx: Int, k: Int): Int {
        println("k ${k} aStartIdx ${aStartIdx} bStartIdx ${bStartIdx}")
        if (aStartIdx >= A.size) return B[bStartIdx + k]
        if (bStartIdx >= B.size) return A[aStartIdx + k]
        if (k == 0) return Math.min(A[aStartIdx], B[bStartIdx])
        var aMidIdx: Int = aStartIdx + k/2
        var bMidIdx: Int = bStartIdx + k/2
        var aMid: Int = if (aMidIdx >= A.size) Int.MAX_VALUE else A[aMidIdx]
        var bMid: Int = if (bMidIdx >= B.size) Int.MAX_VALUE else B[bMidIdx]
        println("aMidIdx ${aMidIdx} aMid ${aMid} bMidIdx ${bMidIdx} bMid ${bMid}")
        if (aMid < bMid) {
            return findKthElementOfMixedArray(A, aMidIdx + 1, B, bStartIdx, (k - k/2) - 1)
        } else {
            return findKthElementOfMixedArray(A, aStartIdx, B, bMidIdx + 1, (k - k/2) - 1)
        }
    }

    fun test(p1: String) {
        println(p1)
    }
}
