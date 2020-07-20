/**
 * 1. Two Sum
 * Easy
 * 
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * Example:
 * 
 * Given nums = [2, 7, 11, 15], target = 9,
 * 
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * 
 * return [0, 1].
 */

package lee.demo

import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    val time = measureTimeMillis {
        println("Hello lee!")
        var sln: Sol = Sol("No.1")
        sln.test("xixi.")
        val nums: IntArray = intArrayOf(2, 7, 11 ,15)
        val target = 9
        sln.twoSum(nums, target).forEach { println(it) }
    }
    println("total time: $time ms")
}
