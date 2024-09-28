package com.api;


import com.api.model.CloudBharat;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudBharat")
public class CloudBharatAPIService {

CloudBharat cloudBharat;

    @GetMapping("{bharatid}")
    public CloudBharat getCloudBharatDetails(String BharatId) {
        return  cloudBharat;
                //new CloudBharat("g1","gaurav","vihar","7979761878");
    }
    @PostMapping
public String createCloudBharatDetails(@RequestBody CloudBharat cloudBharat){
        this.cloudBharat = cloudBharat;
        return "cloud Bharat Created Successfully";
}
@PutMapping
public String updateCloudBharatDetails(@RequestBody CloudBharat cloudBharat){
        this.cloudBharat = cloudBharat;
        return "Cloud Bharat Updated Successfully";
}
@DeleteMapping ("{bharatId}")
public String deleteCloudBharatDetails(String bharatId){
        this.cloudBharat = null;
        return "Cloud Bharat Delete Successfuly";
}

    }

