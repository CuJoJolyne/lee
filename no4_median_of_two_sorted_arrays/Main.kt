/**
 * 4. Median of Two Sorted Arrays
 * Hard
 * 
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * 
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * 
 * You may assume nums1 and nums2 cannot be both empty.
 * 
 * Example 1:
 * 
 * nums1 = [1, 3]
 * nums2 = [2]
 * 
 * The median is 2.0
 * 
 * Example 2:
 * 
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * 
 * The median is (2 + 3)/2 = 2.5
 */

package lee.demo

import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    val time = measureTimeMillis {
        println("Hello lee!")
        var sln: Sol = Sol("No.4")
        sln.test("xixi.")
        var l1: IntArray = intArrayOf(1, 3)
        var l2: IntArray = intArrayOf(2)
        var l3: IntArray = intArrayOf(1, 2)
        var l4: IntArray = intArrayOf(3, 4)
        var l5: IntArray = intArrayOf(1, 2)
        var l6: IntArray = intArrayOf(-1, 3)
        var l7: IntArray = intArrayOf(2, 3)
        var l8: IntArray = intArrayOf(1, 4)
        //l1.forEach(::println)
        //l2.forEach(::println)
        //l3.forEach(::println)
        //l4.forEach(::println)
        println("==========")
        println(l1.contentToString())
        println(l2.contentToString())
        println("median of l1 l2 is ${sln.findMedianSortedArrays(l1, l2)}")
        println("==========")
        println(l3.contentToString())
        println(l4.contentToString())
        println("median of l3 l4 is ${sln.findMedianSortedArrays(l3, l4)}")
        println("==========")
        println(l5.contentToString())
        println(l6.contentToString())
        println("median of l5 l6 is ${sln.findMedianSortedArrays(l5, l6)}")
        println("==========")
        println(l7.contentToString())
        println(l8.contentToString())
        println("median of l7 l8 is ${sln.findMedianSortedArrays(l7, l8)}")
        println("==========")
    }
    println("total time: $time ms")
}
