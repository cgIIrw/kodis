package com.cgrw.redisobject

import com.cgrw.structure.ZskipListNode
import com.cgrw.structure.Zskiplist

/**
 * @Author: cgrw
 * @Url: https://github.com/cgIIrw/kodis
 */
const val ZSKIPLIST_MAXLEVEL = 32


// 创建并返回单个跳跃表节点
fun zslCreateNode(level: Int, score: Double, o: Any?): ZskipListNode {
    var zn = ZskipListNode()
    zn.level = arrayOfNulls(level)
    zn.score = score
    zn.obj = o
    return zn
}

// 创建跳跃表，初始化头节点
fun zslCreate(): Zskiplist {
    // 初始化一个跳跃表实例
    var zsl = Zskiplist()
    // 最大节点层数
    zsl.level = 1
    // 表中节点数量，不包括头节点
    zsl.length = 0

    // 初始化头节点
    zsl.header = zslCreateNode(ZSKIPLIST_MAXLEVEL, (0).toDouble(), null)

    for (i in 0 until ZSKIPLIST_MAXLEVEL) {
        zsl.header.level[i]!!.forward = null
        zsl.header.level[i]!!.span = 0
    }
    zsl.header.backward = null
    zsl.tail = null
    return zsl
}



