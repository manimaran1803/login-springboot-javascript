package jslogin.springboot.js.login.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jslogin.springboot.js.login.form.Repository.Userrepo;
import jslogin.springboot.js.login.form.model.users;

@RestController
@RequestMapping("/api/login")
@CrossOrigin("*")
public class studentcontroller {


   @Autowired
   private Userrepo userrepo;


   @PostMapping()
   public ResponseEntity<?> login(@RequestBody users users){
    
    users userdata=userrepo.findByUsername(users.getUsername());

    if( userdata!=null && userdata.getPassword().equals(users.getPassword())){

      return  ResponseEntity.ok("success");
    }
  
    else{
   return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed");
    }



   }
    
}
