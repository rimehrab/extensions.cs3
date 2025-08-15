package com.rimehrab

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class ICCFtpPlugin: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(ICCFtpProvider())
    }
}