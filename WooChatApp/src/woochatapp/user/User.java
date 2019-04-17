/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package woochatapp.user;

import java.text.SimpleDateFormat;



/**
 *
 * @author anton
 */
public class User {
    private String nume;
    private String prenume;
    private SimpleDateFormat dataNasterii;
    private String sex;
    private String email;
    private String parola;
    
    public User(){
        nume="";
        prenume="";
        dataNasterii= new SimpleDateFormat("dd/mm/yyyy");
        sex="";
        email="";
        parola="";
    }

    public User(String nume, String prenume, SimpleDateFormat dataNasterii, String sex, String email, String parola) {
        this.nume = nume;
        this.prenume = prenume;
        this.dataNasterii = dataNasterii;
        this.sex = sex;
        this.email = email;
        this.parola = parola;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public SimpleDateFormat getDataNasterii() {
        return dataNasterii;
    }

    public String getSex() {
        return sex;
    }
    
    public String getEmail() {
        return email;
    }

    public String getParola() {
        return parola;
    }

    @Override
    public String toString() {
        return "Users{" + "nume=" + nume + ", prenume=" + prenume + ", dataNasterii=" + dataNasterii + ", sex=" + sex + ", email=" + email + ", parola=" + parola + '}';
    }
    
}
