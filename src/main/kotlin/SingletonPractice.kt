package org.grim3lt.example.kotlin

import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

fun main() {
    logger.info("toString: {}", HogeSingleton.getInstance().toString())
}
