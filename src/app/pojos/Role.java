package app.pojos;
// Generated Feb 4, 2021 12:45:08 AM by Hibernate Tools 4.3.1



/**
 * Role generated by hbm2java
 */
public class Role  implements java.io.Serializable {


     private Integer id;
     private String role;

    public Role() {
    }

    public Role(String role) {
       this.role = role;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }




}

