package com.kbstar.cart;

import com.kbstar.dto.Adm;
import com.kbstar.service.AdmService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class UpdateTest {
    @Autowired
    AdmService service;
    @Test
    void contextLoads() {
        try {
            service.modify(new Adm("admin04", "pwd55",5));
            service.get();
        } catch (Exception e) {
            log.info("★★★★★★★★★★★★★★★ERROR★★★★★★★★★★★★★★★");
            e.printStackTrace();
        }
    }

}
