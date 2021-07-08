package com.github.examples.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "account_settings")
class AccountSetting {
    @Id
    @GeneratedValue
    private Long id

    @Column(name = "name", nullable = false)
    private String settingName

    @Column(name = "value", nullable = false)
    private String settingValue

    @ManyToOne
    @JoinColumn(name ="account_id", nullable = false)
    private Account account
}
