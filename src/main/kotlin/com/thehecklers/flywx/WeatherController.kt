package com.thehecklers.flywx

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class WeatherController(private val weatherService: WeatherService) {
    @ResponseBody
    @GetMapping("/metar")
    fun getMETAR(@RequestParam loc: String?) = weatherService.getMETAR(loc)
}