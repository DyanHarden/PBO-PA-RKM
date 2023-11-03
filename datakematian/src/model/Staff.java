/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

//import gui.Pilihan;
import javax.swing.JOptionPane;


public final class Staff {
    private String idStaff;
    private String nama;
    private String noTelp;
    private String username;
    private String password;

    public Staff(String idStaff, String nama){
        this.idStaff = idStaff;
        this.nama = nama;
        this.noTelp = noTelp;
        this.username = username;
        this.password = password;
    }

    public final String getIdStaff(){
        return idStaff;
    }

    public final String getNama(){
        return nama;
    }

    public final String getNoTelp(){
        return noTelp;
    }

    public final String getUsername(){
        return username;
    }

    public final String getPassword(){
        return password;
    }

    public final boolean checkLogin(String username, String password){
        try {
            String query = "SELECT * FROM staff WHERE Username = ? AND Password = ?";
            Database.connect();
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, username);
            Database.preparedStatement.setString(2, password);
            Database.resultSet = Database.preparedStatement.executeQuery();
            if(Database.resultSet.next()){
                JOptionPane.showMessageDialog(null, "Login berhasil!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Login gagal!");
                return false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }  
}
