package ch04

import groovy.transform.Memoized

@Memoized
static Long factorial(Long f) {
    println "Factorial for $f"
    if (f == 0 || f == 1) {
        return 1
    }
    factorial(f - 1) * f
}
println factorial(4)
println factorial(3)
println factorial(5)

/*
@Memoized(maxCacheSize = 3)
limiting the size of the cache,
    the eviction strategy is based on a
        last recently used【LRU：最近最少使用】 algorithm.




 */