package com.etirps.zhu.gachasimulator

import android.app.Application

class ApplicationData : Application() {

    var cashMoney: Int = 0

    var memeCollection = mutableListOf<RedditData>()

}