@file:JvmName("Day")

package aoc.nineteen

import java.io.File
import java.nio.file.Files

val file = File(object {}::class.java.classLoader.getResource("input")!!.toURI())

val lines get() = Files.lines(file.toPath())
val sequence get() = sequence { file.useLines { sequence -> sequence.forEach { yield(it) } } }