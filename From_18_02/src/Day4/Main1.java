package Day4;

import java.util.*;

class Studentt {
    int id;
    String fname;
    double cgpa;

    public Studentt(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

	public Object getCgpa() {
		// TODO Auto-generated method stub
		return cgpa;
	}

	public Object getFname() {
		// TODO Auto-generated method stub
		return fname;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
}

class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Studentt> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();

            students.add(new Studentt(id, name, cgpa));
        }

        // Sorting using Comparator
        Collections.sort(students, new Comparator<Studentt>() {
            @Override
            public int compare(Studentt s1, Studentt s2) {

                if (s1.getCgpa() != s2.getCgpa()) {
                    return Double.compare(s2.getCgpa(), s1.getCgpa()); // Descending CGPA
                }
                else if (!s1.getFname().equals(s2.getFname())) {
                    return ((String) s1.getFname()).compareTo((String) s2.getFname()); // Alphabetical
                }
                else {
                    return Integer.compare(s1.getId(), s2.getId()); // Ascending ID
                }
            }
        });

        // Print first names
        for (Studentt s : students) {
            System.out.println(s.getFname());
        }
    }
}