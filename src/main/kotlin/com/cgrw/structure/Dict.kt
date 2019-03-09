package com.cgrw.structure

/**
 * @Author: cgrw
 * @Url: https://github.com/cgIIrw/kodis
 * @Desc: 实现字典
 */

class Dict {

    // dictType 处理特定类型的函数
    var type: MethodsType? = null

    //  类型处理函数私有数据
    var privdata: Any? = null

    var ht: Array<Array<DictEntry>?> = arrayOfNulls(2)

    var rehashidx: Int? = null

    var iterators: Int? = null
}

class MethodsType {
// todo
}

class DictEntry {
    var key: Any? = null
    var value: Any? = null
    var next: DictEntry? = null
}