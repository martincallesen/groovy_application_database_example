package com.github.examples

import com.github.examples.domain.Account
import org.apache.commons.lang3.RandomStringUtils

class DataGenerator {
    static Account generateRandomAccount() {
        def randomString = RandomStringUtils.random(50, true, true)
        def email = "$randomString@thing.dk"
        new Account(name: 'something', emailAddress: email, accountSettings: [])
    }
}
