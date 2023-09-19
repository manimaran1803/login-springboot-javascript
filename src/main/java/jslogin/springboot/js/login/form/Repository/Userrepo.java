package jslogin.springboot.js.login.form.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jslogin.springboot.js.login.form.model.users;



public interface Userrepo  extends JpaRepository<users,Long>{
    
    users  findByUsername(String username);
}
