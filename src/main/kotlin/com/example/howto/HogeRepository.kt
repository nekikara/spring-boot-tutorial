package com.example.howto

import org.springframework.data.repository.CrudRepository

interface HogeRepository : CrudRepository<Hoge, Long>
