package com.cgrw.server

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.io.BufferedReader
import java.net.ServerSocket
import java.io.InputStreamReader

const val SERVER_PORT = 8089

fun main(args: Array<String>) {
    println("欢迎来到kodis！")
    val socketListener = ServerSocket(SERVER_PORT)

    socketListener.use {
        while (true) {
            val socket = socketListener.accept()
            GlobalScope.launch {
                val input = BufferedReader(InputStreamReader(socket.inputStream))
                input.use {
                    var line: String
                    var data = ""
                    while (true) {
                        line = it.readLine() ?: break
                        data += line
                    }
                    println(data)
                }
            }
        }
    }
}