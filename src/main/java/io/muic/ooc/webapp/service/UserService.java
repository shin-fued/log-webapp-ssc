package io.muic.ooc.webapp.service;
import io.muic.ooc.webapp.model.User;
import lombok.Setter;
import org.mindrot.jbcrypt.BCrypt;

public class UserService {

    private static final String INSERT_USER_SQL = "INSERT INTO tbl_user (username, password, display_name) VALUES (?, ?, ?);";

    @Setter
    private DatabaseConnectionService dcs;

    public User createUser(String username, String password, String displayName){
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());


    }

    //    public static void main(String[] args) {
//        final HikariDataSource ds = new HikariDataSource();
//        ds.setMaximumPoolSize(20);
//        ds.setDriverClassName("org.mariadb.jdbc.Driver");
//        ds.setJdbcUrl("jdbc:mariadb://localhost:13306/login_webapp");
//        ds.addDataSourceProperty("user", "ssc");
//        ds.addDataSourceProperty("password", "hardpass");
//        ds.setAutoCommit(false);
//
//        try {
//            Connection connection = ds.getConnection();
//            String sql = "INSERT INTO tbl_user (username, password, display_name) VALUES (?, ?, ?);";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setString(1, "my_username");
//            ps.setString(2, "my_password");
//            ps.setString(3, "my_display_name");
//
//            ps.executeUpdate();
//            connection.commit();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
}
