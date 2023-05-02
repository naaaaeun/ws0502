package com.kbstar.admTest;

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
    void contextLoads(){
        Adm adm =new Adm("admin01","pwd10",3);
        try{
            service.modify(adm);
            log.info("update 완료================================================================================");
        }catch (Exception e){
            log.info("시스템오류================================================================================");
        }
    }

}
