package com.thehecklers.flywx

import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.bodyToMono

@Service
class WeatherService {
    val tokenParam = "?token=xyz123"

    val client = WebClient.create("https://avwx.rest/api/metar/")

    fun getMETAR(loc: String?) = client.get()
        .uri(
            if (loc.isNullOrEmpty()) {
                "KSTL$tokenParam"
            } else {
                "$loc$tokenParam"
            }
        )
        .retrieve()
        .bodyToMono<METAR>()
        .onErrorReturn(
            METAR("???", "Error retrieving METAR for location $loc")
        )
}