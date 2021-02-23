package com.example.toggle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ToggleService {

    @Autowired
    private ToggleRepository toggleRepository;

    @Transactional
    public Toggle getToggle() {

        if (!toggleRepository.existsById(1)) {
            return new Toggle();
        }

        return toggleRepository.findById(1).get();
    }

    public Toggle saveToggle(Toggle t) {
        toggleRepository.save(t);
        return t;
    }

}
