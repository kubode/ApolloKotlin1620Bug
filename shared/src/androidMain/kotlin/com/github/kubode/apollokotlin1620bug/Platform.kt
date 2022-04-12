package com.github.kubode.apollokotlin1620bug

import android.content.Context
import com.apollographql.apollo3.cache.normalized.sql.SqlNormalizedCacheFactory

actual class Platform(private val context: Context) {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
    actual val sqlNormalizedCacheFactory: SqlNormalizedCacheFactory
        get() = SqlNormalizedCacheFactory(context)
}
