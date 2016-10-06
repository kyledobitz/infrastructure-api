package com.kyledobitz.infrastructure.api


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Component {
    String key
    String name
    UUID uuid = UUID.randomUUID()

    String server
    String system

    App app

    static constraints = {
        key unique:true, blank:false
        name blank:false
        uuid unique:true, nullable:false

        server blank:false
        system blank:false
        app nullable:false
    }
}