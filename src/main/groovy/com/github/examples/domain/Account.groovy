package com.github.examples.domain

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "accounts")
class Account {
    @Id
    @GeneratedValue
    private Long id

    @Column(nullable = false, length = 100)
    private String name

    @Column(name = "email_address")
    private String emailAddress

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<AccountSetting> accountSettings = new ArrayList<>()


    @Override
    String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emailAddress='" + emailAddress +
                '}'
    }
}
