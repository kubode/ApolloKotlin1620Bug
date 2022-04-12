package com.github.kubode.apollokotlin1620bug

import com.apollographql.apollo3.cache.normalized.sql.SqlNormalizedCacheFactory
import platform.UIKit.UIDevice

actual class Platform {
    actual val platform: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
    actual val sqlNormalizedCacheFactory: SqlNormalizedCacheFactory
        get() = SqlNormalizedCacheFactory()
}
