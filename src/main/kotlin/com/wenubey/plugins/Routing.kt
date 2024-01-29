package com.wenubey.plugins

import com.wenubey.room.RoomController
import com.wenubey.routes.chatSocket
import com.wenubey.routes.getAllMessages
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val roomController by inject<RoomController>()

    install(Routing) {
        chatSocket(roomController)
        getAllMessages(roomController)
    }
}
