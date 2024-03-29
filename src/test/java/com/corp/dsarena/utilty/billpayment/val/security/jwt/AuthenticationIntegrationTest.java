package com.corp.dsarena.utilty.billpayment.val.security.jwt;

import com.corp.dsarena.utilty.billpayment.val.config.SecurityConfiguration;
import com.corp.dsarena.utilty.billpayment.val.config.SecurityJwtConfiguration;
import com.corp.dsarena.utilty.billpayment.val.config.WebConfigurer;
import com.corp.dsarena.utilty.billpayment.val.management.SecurityMetersService;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import tech.jhipster.config.JHipsterProperties;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = {
        JHipsterProperties.class,
        WebConfigurer.class,
        SecurityConfiguration.class,
        SecurityJwtConfiguration.class,
        SecurityMetersService.class,
        JwtAuthenticationTestUtils.class,
    }
)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface AuthenticationIntegrationTest {
}
