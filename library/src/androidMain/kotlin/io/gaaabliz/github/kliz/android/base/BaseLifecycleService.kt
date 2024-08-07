package io.gaaabliz.github.kliz.android.base

import android.app.Notification
import android.app.NotificationManager
import android.app.Service
import android.os.Build
import androidx.annotation.DrawableRes
import androidx.core.app.NotificationChannelCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.lifecycle.LifecycleService

abstract class BaseLifecycleService : LifecycleService() {


    protected open val channelId: Int = 1
    protected open val contentTitle: String get() = applicationInfo.name
    protected open val contentText: String? get() = null
    protected open val channelName: String get() = getString(applicationInfo.labelRes)

    @get:DrawableRes
    protected open val smallIcon: Int get() = applicationInfo.icon

    protected open val notification: Notification
        get() = NotificationCompat.Builder(this, channelId.toString())
            .setContentTitle(contentTitle)
            .setContentText(contentText)
            .setWhen(System.currentTimeMillis())
            .setSmallIcon(smallIcon)
            .build()

    protected open val channel: NotificationChannelCompat
        get() = NotificationChannelCompat.Builder(
            channelId.toString(),
            @Suppress("InlinedApi") NotificationManager.IMPORTANCE_MIN,
        ).setName(channelName).build()

    override fun onCreate() {
        super.onCreate()
        NotificationManagerCompat.from(this).createNotificationChannel(channel)
        startForeground(channelId, notification)
    }

    override fun onDestroy() {
        stopForeground(STOP_FOREGROUND_REMOVE)
        super.onDestroy()
    }
}