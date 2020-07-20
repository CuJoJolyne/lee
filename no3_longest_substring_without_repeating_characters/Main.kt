/**
 * 3. Longest Substring Without Repeating Characters
 * Medium
 * 
 * Given a string, find the length of the longest substring without repeating characters.
 * 
 * Example 1:
 * 
 * Input: "abcabcbb"
 * Output: 3 
 * Explanation: The answer is "abc", with the length of 3. 
 * 
 * Example 2:
 * 
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * 
 * Example 3:
 * 
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3. 
 *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

package lee.demo

import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    val time = measureTimeMillis {
        println("Hello lee!")
        var sln: Sol = Sol("No.3")
        sln.test("xixi.")
        var l1: String = "abcabcbb"
        var l2: String = "bbbbb"
        var l3: String = "pwwkew"
        var l4: String = " "
        println(l1)
        println(l2)
        println(l3)
        println(l4)
        println("l1 result is ${sln.lengthOfLongestSubstring(l1)}")
        println("l2 result is ${sln.lengthOfLongestSubstring(l2)}")
        println("l3 result is ${sln.lengthOfLongestSubstring(l3)}")
        println("l4 result is ${sln.lengthOfLongestSubstring(l4)}")
    }
    println("total time: $time ms")
}
