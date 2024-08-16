package com.jcell.sistemajcell.InfoController;


import com.jcell.sistemajcell.InfoModel.InfoModel;
import com.jcell.sistemajcell.InfoServices.InfoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/info")
public class InfoController {

    final
    InfoServices infoServices;

    public InfoController(InfoServices infoServices) {
        this.infoServices = infoServices;
    }


    @PostMapping
    public InfoModel addInfo(@RequestBody InfoModel infoModel){
        return infoServices.addModel(infoModel);
    }

    @GetMapping
    public List<InfoModel> allInfo(){
        return infoServices.allInfo();
    }

    @GetMapping(path = "{id}")
    public  InfoModel idInfo(@PathVariable(name = "id") Long id){
        return infoServices.byIdInfo(id);
    }

    @GetMapping(path = "{id}")
    public void deleteId(@PathVariable(name = "id") Long id){
        infoServices.deleteInfoById(id);
    }
}
