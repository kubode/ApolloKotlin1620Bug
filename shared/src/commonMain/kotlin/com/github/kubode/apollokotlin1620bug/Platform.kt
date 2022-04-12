package com.github.kubode.apollokotlin1620bug

import com.apollographql.apollo3.cache.normalized.sql.SqlNormalizedCacheFactory

expect class Platform {
    val platform: String
    val sqlNormalizedCacheFactory: SqlNormalizedCacheFactory
}
