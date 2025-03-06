
package config;

import java.util.Date;





public class Session {
   private static Session instance;
   private int id;
   private String fname;
   private String lname;
   private String email;
   private String sex;
   private String username;
   private Date birthdate;
   private String type;
   private String status;
   
   private Session(){
   
   }

    public static synchronized Session getInstance() {
        if(instance == null){
           instance = new Session();
        }        
        return instance;
    }

    public static boolean isInstanceEmpty() {
      return instance == null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
    
    public Date getBirthdate() {
        return birthdate ;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }    
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
