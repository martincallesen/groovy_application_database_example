package com.github.examples

import com.github.examples.domain.Account
import org.apache.commons.lang3.RandomStringUtils

class DataGenerator {
    static Account generateRandomAccount() {
        new Account(name: randomName(), emailAddress: randomEmail(), accountSettings: [])
    }

    private static String randomName() {
        def name = RandomStringUtils.random(25, true, false)
        def surName = RandomStringUtils.random(25, true, false)
        "$name $surName"
    }

    private static String randomEmail() {
        String randomString = RandomStringUtils.random(50, true, true)
        "$randomString@thing.dk"
    }
}
