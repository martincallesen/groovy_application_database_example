package com.github.examples

import com.github.examples.domain.Account
import org.springframework.data.repository.CrudRepository

interface AccountRepository extends CrudRepository<Account, Long> {
}
