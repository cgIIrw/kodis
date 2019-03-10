package com.cgrw.structure

/**
 * @Author: cgrw
 * @Url: https://github.com/cgIIrw/kodis
 * @Desc: 实现跳跃表
 */

// 跳跃表节点数据结构
class ZskipListNode {

    // member对象
    var obj: Any? = null

    // 分值
    var score: Double? = null

    // 后退指针
    var backward: ZskipListNode? = null

    // 向前的引用的集合(数组)
    // 要么是ZskipListLevel对象，要么是null ->
    lateinit var level: Array<ZskipListLevel?>

    class ZskipListLevel {

        // 向前的指针 ->
        var forward: ZskipListNode? = null
        // 跨越的节点数量
        var span: Int? = null
    }
}

// 跳跃表数据结构
class Zskiplist {
    lateinit var header: ZskipListNode
    var tail: ZskipListNode? = null
    var length: Long? = null
    var level: Int? = null
}





