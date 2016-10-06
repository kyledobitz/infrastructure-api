package com.kyledobitz.infrastructure.api


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class App {
    String key
    String name
    UUID uuid = UUID.randomUUID()

    static constraints = {
        key unique:true, blank:false
        name blank:false
        uuid unique:true, nullable:false
    }
}