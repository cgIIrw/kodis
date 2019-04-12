package com.cgrw.structure

/**
 * @Author: cgrw
 * @Url: https://github.com/cgIIrw/kodis
 * @Desc: 实现字符串
 */

// 字符串工具类，这个类主要是辅助实现一些高级
// 语言内置的字符串功能
class Sdshdr {

    // 字符串长度
    var len: Int? = null

    // 数组中未使用的空间长度
    var free: Int? = null

    // 声明的字符数组
    var buf: Array<Char>? = null
}

// abs在Redis中为char *，数组的首地址
typealias Abs = String



