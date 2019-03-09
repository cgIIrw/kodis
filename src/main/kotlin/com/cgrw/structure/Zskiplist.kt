package com.cgrw.structure

/**
 * @Author: cgrw
 * @Url: https://github.com/cgIIrw/kodis
 * @Desc: 实现跳跃表
 */

class ZskipListNode {

    // member对象
    var obj: Any? = null

    // 分值
    var score: Double? = null

    // 后退指针
    var backward: ZskipListNode? = null

    var level: Array<ZskipListLevel>? = null

    class ZskipListLevel {

        // 向前的指针
        var forward: ZskipListNode? = null
        // 跨越的节点数量
        var span: Int? = null
    }
}

class Zskiplist {
    var header: ZskipListNode? = null
    var tail: ZskipListNode? = null
    var length: Long? = null
    var level: Int? = null
}





