import java.sql.*;
import java.util.Scanner;

public class Main {

    private static final String URL =
            "jdbc:mysql://localhost:3306/college?useSSL=false&allowPublicKeyRetrieval=true";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             Scanner sc = new Scanner(System.in)) {

            while (true) {

                System.out.println("\n===== STUDENT MANAGEMENT =====");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Choose option: ");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1 -> addStudent(con, sc);
                    case 2 -> viewStudents(con);
                    case 3 -> updateStudent(con, sc);
                    case 4 -> deleteStudent(con, sc);
                    case 5 -> { return; }
                    default -> System.out.println("Invalid choice");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ================= ADD =================
    private static void addStudent(Connection con, Scanner sc) throws SQLException {

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        String insertStudent = "INSERT INTO students(name) VALUES (?)";

        int studentId;

        try (PreparedStatement ps = con.prepareStatement(insertStudent, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, name);
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            studentId = rs.getInt(1);
        }

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        String insertDetails = "INSERT INTO student_details(student_id, course, city) VALUES (?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(insertDetails)) {
            ps.setInt(1, studentId);
            ps.setString(2, course);
            ps.setString(3, city);
            ps.executeUpdate();
        }

        System.out.println(" Student Added Successfully!");
    }

    private static void viewStudents(Connection con) throws SQLException {

        String sql = """
                SELECT s.id, s.name, d.course, d.city
                FROM students s
                JOIN student_details d ON s.id = d.student_id
                """;

        try (Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("\n--- STUDENT LIST ---");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("course") + " | " +
                                rs.getString("city")
                );
            }
        }
    }

    private static void updateStudent(Connection con, Scanner sc) throws SQLException {

        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("New Name: ");
        String name = sc.nextLine();

        System.out.print("New Course: ");
        String course = sc.nextLine();

        System.out.print("New City: ");
        String city = sc.nextLine();

        String updateStudent = "UPDATE students SET name=? WHERE id=?";
        String updateDetails = "UPDATE student_details SET course=?, city=? WHERE student_id=?";

        try (PreparedStatement ps1 = con.prepareStatement(updateStudent);
             PreparedStatement ps2 = con.prepareStatement(updateDetails)) {

            ps1.setString(1, name);
            ps1.setInt(2, id);
            ps1.executeUpdate();

            ps2.setString(1, course);
            ps2.setString(2, city);
            ps2.setInt(3, id);
            ps2.executeUpdate();
        }

        System.out.println(" Student Updated!");
    }

    private static void deleteStudent(Connection con, Scanner sc) throws SQLException {

        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();

        String sql = "DELETE FROM students WHERE id=?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }

        System.out.println(" Student Deleted (Details auto deleted via CASCADE)");
    }
}