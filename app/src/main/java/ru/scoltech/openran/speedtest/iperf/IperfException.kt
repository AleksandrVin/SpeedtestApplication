package ru.scoltech.openran.speedtest.iperf

class IperfException(message: String) : Exception(message) {
    constructor(message: String, errno: Int) : this("$message (errno = $errno)")
}
