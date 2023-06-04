package Codeup.codeup1200_;

import java.util.*;

class Student {
    private String code;
    private int testId;
    private String name;

    public Student(String code, int testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public int getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }
}

public class _3108 {

    private List<Student> students = new ArrayList<>();

    public Student makeAStudent(String code, int testId, String name) {
        return new Student(code, testId, name);
    }

    private boolean isExist(Student pStudent) { // 파라메터 스튜던트
        // 중복 여부 check
        for (Student student : students) {
            if(pStudent.getCode().equals(student.getCode())) return true;
        }
        return false;
    }

    private Student getExistStudent(Student pStudent) {
        return new Student("", 0, "");
    }

    private void deleteStudent(Student pStudent) {
        // pStudent가 students에서 몇번째에 있는지 알아야 함
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getTestId() == pStudent.getTestId()) students.remove(i);
        }
    }

    public void process(String line) {
        String[] splitted = line.split(" ");
        Student student = makeAStudent(splitted[0], Integer.parseInt(splitted[1]), splitted[2]);
        switch (student.getCode()) {
            case "I" -> addAStudent(student);
            case "D" -> deleteStudent(student);
        }
    }

    private void addAStudent(Student student){
        // 중복 check를 한 후 넣음
        if (!isExist(student)) {
            students.add(student);
        }
    }

    private void printStudents() {
        for (Student student : students) {
            System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());
        }
    }

    private void printSpecificStudents(int[] arr) {
        //정렬
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getTestId() - o2.getTestId();
            }
        });

        // 출력
        for (int i = 0; i < arr.length; i++) {
            Student student = students.get(arr[i] - 1);
            System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());
        }
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int size = 1;
        _3108 c3018 = new _3108();
        c3018.process("I 1011 한라산");
        c3018.process("I 999 백두산");
        c3018.process("I 999 오대산");
        c3018.process("D 999 백두산");
        c3018.process("I 800 백두산");
        c3018.process("D 500 한라산");
        c3018.process("I 900 남산");
        c3018.process("I 950 금강산");
        c3018.process("I 1205 지리산");
        c3018.process("I 700 북한산");
        c3018.printSpecificStudents(new int[]{1, 2, 4, 5, 6});
//        int size = sc.nextInt();
//        for (int i = 0; i < size; i++) {
//            c3018.process(sc.nextLine());
//        }
//        String[] arr2 = sc.nextLine().split(" ");
//        int[] arr3 = new int[arr2.length];
//        for (int i = 0; i < arr2.length; i++) {
//            arr3[i] = Integer.parseInt(arr2[i]);
//        }
//        c3018.printSpecificStudents(arr3);
    }
}
