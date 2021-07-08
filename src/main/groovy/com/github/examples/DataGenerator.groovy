package com.github.examples

import com.github.examples.domain.Account
import com.github.examples.domain.AccountSetting

class DataGenerator {
    static Account generateRandomAccount() {
        new Account(name: 'something', emailAddress:'some@thing.dk', accountSettings: [])
    }
}
