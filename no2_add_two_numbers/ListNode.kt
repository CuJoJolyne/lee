package lee.demo

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        return "$`val` -> ${next.toString()}"
    }
}
