
package config;

public class Session {
   private static Session instance;
   private int id;
   private String fname;
   private String lname;
   private String email;
   private String sex;
   private String username;
   private String birthdate;
   private String type;
   private String status;
   private String password;
   private String Uimage;
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
    
    public String getBirthdate() {
        return birthdate ;
    }

    public void setBirthdate(String birthdate) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUimage() {
        return Uimage;
    }

    public void setUimage(String Uimage) {
        this.Uimage = Uimage;
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

    public String getString(String uimage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
