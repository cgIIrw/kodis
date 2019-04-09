package com.cgrw.redisobject

/**
 * @Author: cgrw
 * @Url: https://github.com/cgIIrw/kodis
 */


val typeArray = arrayOf("string", "list", "hash", "set", "zset")

data class RedisObject(var typeNumber:Int, var value: Any) {
    var type = typeArray[typeNumber]
    var refcount = 0
    var ptr = value
}

