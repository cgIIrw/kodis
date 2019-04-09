package com.cgrw.structure

/**
 * @Author: cgrw
 * @Url: https://github.com/cgIIrw/kodis
 * @Desc: 实现双端链表
 */

// 链表节点
class ListNode {
    var prev: ListNode? = null
    var next: ListNode? = null
    var value: Any? = null
}

class List {
    var head: ListNode? = null
    var tail: ListNode? = null
    var len: Long? = null
    // todo 缺失一些未实现的方法
}