# Manajemen Data Rukun Kematian Warga

Program ini dibuat agar diperuntukan sebagai manajemen data rukun kematian warga yang dirancang untuk membantu mengumpulkan, menyimpan, dan mengelola informasi terkait kematian penduduk suatu wilayah atau komunitas. Program ini dapat digunakan oleh instansi pemerintah atau organisasi yang bertanggung jawab untuk mengelola data rukun kematian warga.

Pendataan kematian warga merupakan bagian penting dari sistem informasi yang diperlukan oleh pemerintah, lembaga kesehatan dan masyarakat sekitar untuk berbagai tujuan, seperti perencanaan kebijakan, pengendalian penyakit, analisis, dan penelitian kesehatan. Pendataan kematian warga mencerminkan pentingnya informasi yang akurat tentang kematian warga dalam berbagai aspek kehidupan masyarakat. Data ini tidak hanya membantu dalam pengambilan keputusan, tetapi juga memberikan pandangan yang lebih baik tentang kualitas hidup dan kesejahteraan populasi suatu daerah. 

## Tabel Isi

- [Flowchart](#flowchart)
- [ERD](#erd)
- [Hirarki Kelas](#hirarki-kelas)
- [Penjelasan Source Code](#penjelasan-source-code)
- [ScreenShoot Output Program](#screenshoot-output-program)

## Flowchart

## ERD
- **LOGICAL ERD**

![image](https://github.com/DyanHarden/PBO-PA-RKM/assets/94899238/9724da8c-abd3-44be-ae2d-329b4909c5ae)

- **RELATIONAL ERD**

![image](https://github.com/DyanHarden/PBO-PA-RKM/assets/94899238/e595c8fb-61ea-486d-953b-65b1f166e24e)



## Hirarki Kelas

## Penjelasan Source Code

**PACKAGE MODEL**
- Database.java
```java
package model;
import java.sql.*;


public class Database {
    public static Connection connection = null;

    public static Statement statement;
    protected static PreparedStatement preparedStatement;
    public static ResultSet resultSet;

    private final static String DB_HOST = "localhost";
    private final static String DB_NAME = "datakematian";
    private final static String DB_USERNAME = "root";
    private final static String DB_PASSWORD = "";

    public Database(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load driver!");
        }
    }

    public final static Connection connect(){
        try {
            String url = "jdbc:mysql://" + DB_HOST + "/" + DB_NAME;
            connection = DriverManager.getConnection(url, DB_USERNAME, DB_PASSWORD);
            System.out.println("Database connected!");
        } catch (SQLException e) {
            System.out.println("Failed to connect database!");
        }
        return connection;
    }

    public final static void disconnect() {
        try {
            connection.close();
            System.out.println("Database disconnected!");
        } catch (SQLException e) {
            System.out.println("Failed to disconnect database!");
        }
    }

    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

```

- Almarhum.java
```java
package model;

import javax.swing.JOptionPane;


public class Almarhum {
    private final String nik;
    private final String nama;
    private final String domisili;
    private final String tanggalLahir;
    private final String tanggalMeninggal;
    private final String tempatMeninggal;
    private final String penyebabMeninggal;
    private final String tempatPemakaman;
    private final String idStaff;
    private final String nikKeluarga;
    
    public Almarhum(String nik, String nama, String domisili, String tanggalLahir, String tanggalMeninggal, String tempatMeninggal, String penyebabMeninggal, String tempatPemakaman, String idStaff, String nikKeluarga){
        this.nik = nik;
        this.nama = nama;
        this.domisili = domisili;
        this.tanggalLahir = tanggalLahir;
        this.tanggalMeninggal = tanggalMeninggal;
        this.tempatMeninggal = tempatMeninggal;
        this.penyebabMeninggal = penyebabMeninggal;
        this.tempatPemakaman = tempatPemakaman;
        this.idStaff = idStaff;
        this.nikKeluarga = nikKeluarga;
    }

    public final String getNik(){
        return nik;
    }

    public final String getNama(){
        return nama;
    }

    public final String getDomisili(){
        return domisili;
    }

    public final String getTanggalLahir(){
        return tanggalLahir;
    }

    public final String getTanggalMeninggal(){
        return tanggalMeninggal;
    }

    public final String getTempatMeninggal(){
        return tempatMeninggal;
    }

    public final String getPenyebabMeninggal(){
        return penyebabMeninggal;
    }

    public final String getTempatPemakaman(){
        return tempatPemakaman;
    }

    public final String getIdStaff(){
        return idStaff;
    }

    public final String getNikKeluarga(){
        return nikKeluarga;
    }

    public void createAlmarhum(){
        try {
            Database.connect();
            String query = "INSERT INTO almarhum VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, getNik());
            Database.preparedStatement.setString(2, getNama());
            Database.preparedStatement.setString(3, getDomisili());
            Database.preparedStatement.setString(4, getTanggalLahir());
            Database.preparedStatement.setString(5, getTanggalMeninggal());
            Database.preparedStatement.setString(6, getTempatMeninggal());
            Database.preparedStatement.setString(7, getPenyebabMeninggal());
            Database.preparedStatement.setString(8, getTempatMeninggal());
            Database.preparedStatement.setString(9, getIdStaff());
            Database.preparedStatement.setString(10, getNikKeluarga());
            Database.preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Berhasil menambahkan data almarhum!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal menambahkan data almarhum!" + e);
        }
    }
     public boolean updateAlmarhum(){
        try {
            Database.connect();
            String query = "UPDATE almarhum SET Nama = ?, Domisili = ?, Tanggal_lahir = ?, Tanggal_meninggal = ?, Tempat_meninggal = ?, Penyebab_meninggal = ?, Tempati_pemakaman = ?, Staff_ID_staff = ?, Keluarga_NIK_Keluarga = ? WHERE NIK = ?";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, getNama());
            Database.preparedStatement.setString(2, getDomisili());
            Database.preparedStatement.setString(3, getTanggalLahir());
            Database.preparedStatement.setString(4, getTanggalMeninggal());
            Database.preparedStatement.setString(5, getTempatMeninggal());
            Database.preparedStatement.setString(6, getPenyebabMeninggal());
            Database.preparedStatement.setString(7, getTempatPemakaman());
            Database.preparedStatement.setString(8, getIdStaff());
            Database.preparedStatement.setString(9, getNikKeluarga());
            Database.preparedStatement.setString(10, getNik());
            Database.preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Berhasil mengubah data almarhum!");
            return true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal mengubah data almarhum!");
        }
        return false;
     }

     public void deleteAlmarhum(){
        try {
            Database.connect();
            String query = "DELETE FROM almarhum WHERE nik = ?";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, getNik());
            Database.preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Berhasil menghapus data almarhum!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal menghapus data almarhum!");
        }
     }

     public void readAlmarhum(){
        try {
            Database.connect();
            String query = "SELECT * FROM almarhum";
            Database.statement = Database.connection.createStatement();
            Database.resultSet = Database.statement.executeQuery(query);
            while(Database.resultSet.next()){
                System.out.println(Database.resultSet.getString("nik"));
                System.out.println(Database.resultSet.getString("nama"));
                System.out.println(Database.resultSet.getString("domisili"));
                System.out.println(Database.resultSet.getString("tanggal_lahir"));
                System.out.println(Database.resultSet.getString("tanggal_meninggal"));
                System.out.println(Database.resultSet.getString("tempat_meninggal"));
                System.out.println(Database.resultSet.getString("penyebab_meninggal"));
                System.out.println(Database.resultSet.getString("tempat_pemakaman"));
                System.out.println(Database.resultSet.getString("id_staff"));
                System.out.println(Database.resultSet.getString("nik_keluarga"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
     }
}
```
  
- Staff.java
```java
package model;

//import gui.Pilihan;
import javax.swing.JOptionPane;


public class Staff {
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

    public String getIdStaff(){
        return idStaff;
    }

    public String getNama(){
        return nama;
    }

    public String getNoTelp(){
        return noTelp;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public boolean checkLogin(String username, String password){
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
```

- Keluarga.java
```java
package model;


public class Keluarga {
    private final String nik;
    private final String nama;
    private final String jenisKelamin;
    private final String hubungan;

    public Keluarga(String nik, String nama, String jenisKelamin, String hubungan){
        this.nik = nik;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.hubungan = hubungan;
    }

    public final String getNik(){
        return nik;
    }

    public final String getNama(){
        return nama;
    }

    public final String getJenisKelamin(){
        return jenisKelamin;
    }

    public final String getHubungan(){
        return hubungan;
    }

    public void createKeluarga(){
        try {
            String query = "INSERT INTO keluarga (NIK_Keluarga, Nama, Jenis_Kelamin, Hubungan_dengan_Almarhum) VALUES (?, ?, ?, ?)";
            Database.connect();
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, getNik());
            Database.preparedStatement.setString(2, getNama());
            Database.preparedStatement.setString(3, getJenisKelamin());
            Database.preparedStatement.setString(4, getHubungan());
            Database.preparedStatement.executeUpdate();
            Database.disconnect();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateKeluarga(){
        try {
            String query = "UPDATE keluarga SET Nama = ?, Jenis_Kelamin = ?, Hubungan_dengan_almarhum = ? WHERE NIK_Keluarga = ?";
            Database.connect();
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, getNama());
            Database.preparedStatement.setString(2, getJenisKelamin());
            Database.preparedStatement.setString(3, getHubungan());
            Database.preparedStatement.setString(4, getNik());
            Database.preparedStatement.executeUpdate();
            Database.disconnect();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteKeluarga(){
        try {
            String query = "DELETE FROM keluarga WHERE NIK_Keluarga = ?";
            Database.connect();
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, getNik());
            Database.preparedStatement.executeUpdate();
            Database.disconnect();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void checkNikKeluarga(String nikKeluarga){
        try {
            String query = "SELECT * FROM keluarga WHERE NIK_Keluarga = ?";
            Database.connect();
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, nikKeluarga);
            Database.resultSet = Database.preparedStatement.executeQuery();
            if(Database.resultSet.next()){
                System.out.println("NIK Keluarga sudah terdaftar!");
            }
            Database.disconnect();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

```

## Screenshoot Output Program
- Login.java
  
- Pilihan.java

- AlmarhumCRUD.java

- KeluargaCRUD.java
