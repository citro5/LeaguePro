package com.example.leaguepro

class Team {

    var uid: String? = null
    var name: String? = null
    var team_manager: String?=null
    constructor() {}

    constructor(uid: String?, name: String?,team_manager: String?) {
        this.name = name
        this.uid = uid
        this.team_manager = team_manager
    }

}