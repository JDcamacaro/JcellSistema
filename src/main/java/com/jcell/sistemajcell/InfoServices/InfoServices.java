package com.jcell.sistemajcell.InfoServices;

import com.jcell.sistemajcell.InfoModel.InfoModel;
import com.jcell.sistemajcell.InfoRepository.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoServices {
    @Autowired
    InfoRepository infoRepository;

    public InfoModel addModel(InfoModel infoModel){
        return infoRepository.save(infoModel);
    }

    public List<InfoModel> allInfo(){
        return infoRepository.findAll();
    }

    public InfoModel byIdInfo(Long id){
        return infoRepository.getReferenceById(id);
    }

    public void deleteInfoById(Long id){
        infoRepository.deleteById(id);
    }
}
