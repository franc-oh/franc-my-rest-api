package com.franc.app.account;

import com.franc.app.account.entity.Account;
import com.franc.app.account.entity.AccountGrade;
import com.franc.app.account.entity.AccountRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
@ActiveProfiles("local")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@TestPropertySource(properties = {"spring.config.location = classpath:application-local.yml"})
public class AccountRepositoryTests {

    @Autowired
    AccountRepository accountRepository;



    @Test
    public void 고객리스트_조회() throws Exception {
        // #Given

        // #When
        List<Account> list = accountRepository.findAll();

        // #Then
        assertThat(list).isNotNull();
        assertThat(list.size()).isGreaterThan(0);
        assertThat(list.get(0).getGrade()).isEqualTo(AccountGrade.ADMIN);
    }



}
