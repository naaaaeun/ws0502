package com.kbstar.service;

import com.kbstar.dto.MarkerDesc;
import com.kbstar.frame.KBService;
import com.kbstar.mapper.MarkerDescMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarkerDescService implements KBService<Integer, MarkerDesc> {

    @Autowired
    MarkerDescMapper mapper;

    /**
     * 등록 및 가입 진행
     * argument : Object
     * return : null
     *
     * @param marker
     */
    @Override
    public void register(MarkerDesc marker) throws Exception {
        mapper.insert(marker);
    }

    @Override
    public void remove(Integer s) throws Exception {
        mapper.delete(s);
    }

    @Override
    public void modify(MarkerDesc markerDesc) throws Exception {
        mapper.update(markerDesc);
    }

    @Override
    public MarkerDesc get(Integer s) throws Exception {
        return mapper.select(s);
    }

    @Override
    public List<MarkerDesc> get() throws Exception {
        return mapper.selectall();
    }

    public List<MarkerDesc> getmarker(Integer s) throws Exception {
        return mapper.getmarker(s);
    }
}