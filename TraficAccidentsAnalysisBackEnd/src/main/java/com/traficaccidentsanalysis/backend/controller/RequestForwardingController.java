package com.traficaccidentsanalysis.backend.controller;

@Controller
public class RequestForwardingController {
    @RequestMapping(value = "/**/{[path:[^\\.]*}")
    public String redirect() {
        // Forward to home page so that angular routing is preserved.
        return "forward:/";
    }
}