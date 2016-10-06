package com.kyledobitz.infrastructure.api

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/app" (resources: "app")
        "/component" (resources: "component")

        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
