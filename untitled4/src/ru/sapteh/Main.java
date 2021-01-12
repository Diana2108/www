package ru.sapteh;


import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        var fileName = "students.txt";
        var list = Main.readStudentsFromFile(fileName);

        switch (args[0]) {
            case "-c": {
                var maxId = 0;

                if (list.size() > 0) {
                    maxId = list.get(0).getId();

                    for (var student : list) {
                        if (maxId < student.getId()){
                            maxId = student.getId();
                        }
                    }
                }

                var newStudent = new Student(
                        maxId + 1,
                        args[1],
                        args[2],
                        args[3],
                        args[4],
                        args[5],
                        Integer.parseInt(args[6]),
                        args[7]
                );

                list.add(newStudent);

                break;
            }

            case "-d" : {
                list.removeIf(student -> student.getId() == Integer.parseInt(args[1]));

                break;
            }

            case "-u" : {
                for (var student : list) {
                    if (student.getId() == Integer.parseInt(args[1])) {
                        var secondName = args[2];
                        var firstName = args[3];
                        var middleName = args[4];
                        var birthDate = args[5];
                        var speciality = args[6];
                        var course = args[7];
                        var group = args[8];

                        if (!secondName.equals("-")){
                            student.setSecondName(secondName);
                        }

                        if (!firstName.equals("-")) {
                            student.setFirstName(firstName);
                        }

                        if (!middleName.equals("-")) {
                            student.setMiddleName(middleName);
                        }

                        if (!birthDate.equals("-")) {
                            student.setBirthDate(birthDate);
                        }

                        if (!speciality.equals("-")) {
                            student.setSpeciality(speciality);
                        }

                        if (!course.equals("-")) {
                            student.setCourse(course);
                        }

                        if (!group.equals("-")) {
                            student.setgroup(group);
                        }

                        break;
                    }
                }

                break;
            }

            case "-p" : {
                for (var student : list) {
                    System.out.printf(
                            "id: %d\n" +
                                    "Фамилия: %s\n" +
                                    "Имя: %s\n" +
                                    "Отчество: %s\n" +
                                    "Дата рожения:"

                }
            }
        }
    }
}





