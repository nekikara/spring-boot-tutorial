package com.example.howto

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "hoge")
class Hoge(@Id
           @GeneratedValue(strategy = GenerationType.AUTO) var id: Int? = null,
           var value: String? = null) {

}
