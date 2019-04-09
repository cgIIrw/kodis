package com.cgrw.server

import java.net.InetSocketAddress
import java.nio.ByteBuffer
import java.nio.channels.SelectionKey
import java.nio.channels.Selector
import java.nio.channels.ServerSocketChannel
import java.nio.channels.SocketChannel
import java.nio.charset.Charset

/**
 * @Author: cgrw
 * @Url: https://github.com/cgIIrw/kodis
 */

const val SERVER_PORT = 8089

fun main(args: Array<String>) {
    var serverSocketChannel = ServerSocketChannel.open()
    serverSocketChannel.bind(InetSocketAddress(SERVER_PORT))
    var selector = Selector.open()
    serverSocketChannel.configureBlocking(false)
    serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT)

    while (true) {
        selector.select()
        var keys = selector.selectedKeys()

        keys.filter { it.isAcceptable }.forEach {
            var ssc = it.channel() as ServerSocketChannel
            var sc = ssc.accept()
            sc.configureBlocking(false)
            sc.register(selector, SelectionKey.OP_READ)
        }

        keys.filter { it.isReadable }.forEach { iit ->
            var sc = iit.channel() as SocketChannel
            var buffer = ByteBuffer.allocate(1024)
            sc.read(buffer)
            buffer.flip()
//            sc.write(buffer)
//            while (buffer.hasRemaining())
        }
        keys.clear()
    }
}