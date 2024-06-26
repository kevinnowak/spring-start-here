package com.github.kevinnowak;

import com.github.kevinnowak.config.ProjectConfig;
import com.github.kevinnowak.main.Parrot;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { ProjectConfig.class })
class AppTest {

    @Autowired
    private ApplicationContext context;

    @Test
    @DisplayName("Parrot instance without a name has been added to the Spring context")
    public void testParrotWasAdded() {
        Parrot p = context.getBean(Parrot.class);

        assertNotNull(p);
        assertNull(p.getName());
    }
}
