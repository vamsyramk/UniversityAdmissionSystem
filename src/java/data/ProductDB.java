/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author vamsyramk
 */

import java.sql.*;
import java.util.*;

import controller.*;
import model.*;

public class ProductDB {
    
    //This method returns null if a product isn't found.
    public static int insertStudent(Student student) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;

        String query = "INSERT INTO Student (firstname,lastname,suffix,dob,email,contact,branch,grescore,englishscore,percentage,country,statename,zip) "
                + "VALUES (?, ?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, student.getFirstname());
            ps.setString(2, student.getLastname());
            ps.setString(3, student.getSuffix());
            ps.setString(4, student.getDob());
            ps.setString(5, student.getEmail());
            ps.setString(6, student.getContact());
            ps.setString(7, student.getBranch());
            ps.setInt(8, student.getGrescore());
            ps.setDouble(9, student.getEnglishscore());
            ps.setDouble(10, student.getPercentage());
            ps.setString(11, student.getCountry());
            ps.setString(12, student.getState());
            ps.setString(13, student.getZip());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    
    //This method returns null if a product isn't found.
    public static List<Student> selectStudents() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT * FROM Student";
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<Student> students = new ArrayList<>();
            while (rs.next()) {
                Student s = new Student();
                s.setFirstname(rs.getString("firstname"));
                s.setLastname(rs.getString("lastname"));
                s.setBranch(rs.getString("branch"));
                s.setEmail(rs.getString("email"));
                s.setGrescore(rs.getInt("grescore"));
                s.setEnglishscore(rs.getDouble("englishscore"));
                s.setPercentage(rs.getDouble("percentage"));
                students.add(s);
            }
            return students;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    
    //This method returns null if a product isn't found.
    public static int insertUser(User user) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;

        String query = "INSERT INTO User (UserID,password) "
                + "VALUES (?, ?)";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user.getId());
            ps.setString(2, user.getPassword());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    
    //This method returns null if a product isn't found.
    public static int insertProduct(Product product) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;

        String query = "INSERT INTO Product (ProductCode, ProductDescription, ProductPrice) "
                + "VALUES (?, ?, ?)";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, product.getCode());
            ps.setString(2, product.getDescription());
            ps.setDouble(3, product.getPrice());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }

    //This method returns null if a product isn't found.
    public static int updateProduct(Product product) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        String query = "UPDATE Product SET "
                + "ProductDescription = ?, "
                + "ProductPrice = ? "
                + "WHERE ProductCode = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, product.getDescription());
            ps.setDouble(2, product.getPrice());
            ps.setString(3, product.getCode());
            return ps.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    
    public static int deleteStudent(String email) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;

        String query = "DELETE FROM Student "
                + "WHERE email = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, email);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    
    public static boolean idExists(String id) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT username FROM Admins "
                + "WHERE username = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    
    public static boolean passwordExists(String password) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT password FROM Admins "
                + "WHERE password = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, password);
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    
    public static boolean useridExists(String id) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT UserID FROM User "
                + "WHERE UserID = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    
    public static boolean userpasswordExists(String password) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT password FROM User "
                + "WHERE password = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, password);
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    
    public static int replaceUserPassword(User user) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        String email = user.getId();
        String password=user.getPassword();

        String query = "UPDATE User "
                        +"SET password = ? "
                        +"WHERE UserID = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, password);
            ps.setString(2, email);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    
    public static Long getNewId() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Long value = null;
        String query = "SELECT ProductID FROM Product";
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<Long> ids = new ArrayList<>();
            while (rs.next()) {
                ids.add(rs.getLong("ProductID"));
            }
            int i = 1;
            int j = 0;
            while (j < ids.size() && (i == ids.get(j))) {
                value = (long) i;
                i++;
                j++;
            }
            value = value + 1;
            return value;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }

    //This method returns null if a product isn't found.
    public static int getEmptySeats(String course) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT currentseats FROM Course "
                + "WHERE id = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, course);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("currentseats");
            } else {
                return 0;
            }
        } catch (SQLException e) {
            System.err.println(e);
            return 0;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    
    public static int updateEmptySeats(String branch,int count) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;

        String query = "UPDATE Course SET "
                + "currentseats = ? "
                +"WHERE id=?";
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, count);
            ps.setString(2, branch);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }

    //This method returns null if a product isn't found.
    public static List<Product> selectProducts() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT * FROM Product";
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<Product> products = new ArrayList<>();
            while (rs.next()) {
                Product p = new Product();
                p.setCode(rs.getString("ProductCode"));
                p.setDescription(rs.getString("ProductDescription"));
                p.setPrice(rs.getDouble("ProductPrice"));
                products.add(p);
            }
            return products;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
}
