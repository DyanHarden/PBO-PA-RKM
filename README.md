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


## Screenshoot Output Program

