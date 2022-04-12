Apollo-Kotlin fails to compile with Kotlin 1.6.20.

If I `kotlin.mpp.hierarchicalStructureSupport` in `gradle.properties` to true (default value in Kotlin 1.6.20), the `:shared:compareIosMainKotlinMetadata` task fails with an "Unresolved reference" error.
