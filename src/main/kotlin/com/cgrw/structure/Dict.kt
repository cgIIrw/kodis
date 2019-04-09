package com.cgrw.structure

/**
 * @Author: cgrw
 * @Url: https://github.com/cgIIrw/kodis
 * @Desc: 实现字典
 */

val DICT_OK = 0
val DICT_ERR = 1

class Dict {

    // dictType 处理特定类型的函数
    var type: MethodsType? = null

    //  类型处理函数私有数据
    var privdata: Any? = null

    var ht: Array<Dictht?> = arrayOfNulls(2)

    var rehashidx: Int = 0

    var iterators: Int = 0
}

class Dictht {
    var table: Array<DictEntry>? = null
    var size: Int = 0
    var used: Int = 0
}

class MethodsType {
// todo
}

class DictEntry {
    var key: Any? = null
    var value: Any? = null
    var next: DictEntry? = null
}

// todo 使用了Java 8的hash方法，后期替换完善
fun hash(key: Any?): Int {
    return key.hashCode() xor (key.hashCode() ushr 16)
}

fun _dictInit(ht: Dict, privDataPtr: Any?): Int {
    ht.privdata = privDataPtr
    return DICT_OK
}

fun dictCreate(privdata: Any?): Dict {
    var ht = Dict()
    _dictInit(ht, privdata)
    return ht
}