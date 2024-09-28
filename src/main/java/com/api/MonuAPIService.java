package com.api;


import com.api.model.CloudBharat;
import com.api.model.Monu;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/monu")
public class MonuAPIService {

    private Monu Monu;

    @GetMapping("{monuid}")
public Monu getmonuDetails(String monuid){
    return Monu;
            //new Monu("m1","shyam","banglore","7979761111","80808080") ;


    }
    @PostMapping
    public String  CreateMonuDetails(@RequestBody Monu monu ){
       this.Monu = monu;
       return "monu Create successful";
    }
@PutMapping
public String UpdateMonuDetails(@RequestBody Monu monu){
        this.Monu = monu;
        return "monu updated successfuly";
}

@DeleteMapping("{monuId}")
public String DeleteMonuDetails(String monuId){
        this.Monu = null;
        return "Monu Deleted successful";
}
}



