package com.example.ammf

import android.content.Context

class AMMFSdk private constructor(
    private val context: Context,
    val threadPoolSize: Int,
    val threadPriority: Int,
    val monitoringInterval: Int,
) {

    fun viewDebug() {
        println("AMMFSdk.viewDebug")
    }

    class Builder(private val context: Context) {
        private var threadPoolSize: Int = 10
        private var threadPriority: Int = Thread.MAX_PRIORITY
        private var monitoringInterval: Int = 1000

        fun setThreadPoolSize(size: Int) = apply { this.threadPoolSize = size }
        fun setThreadPriority(priority: Int) = apply { this.threadPriority = priority }
        fun setMonitoringInterval(interval: Int) = apply { this.monitoringInterval = interval }

        fun build() = AMMFSdk(
            context = context,
            threadPoolSize = threadPoolSize,
            threadPriority = threadPriority,
            monitoringInterval = monitoringInterval,
        )
    }
}