@file:UseExperimental(FlowPreview::class)

import kotlin.system.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

val ints: Flow<Int> = flow {
    for (i in 1..10) {
        delay(100)
        emit(i)
    }
}

suspend fun main() {
    val time = measureTimeMillis {
        ints.collect { println(it) }
    }
    println("Collected in $time ms")
}