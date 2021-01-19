package com.shepeliev.webrtckmm

expect class RtcStats {
    val timestampUs: Long
    val type: String
    val id: String
    val members: Map <String, Any>

    override fun toString(): String
}
