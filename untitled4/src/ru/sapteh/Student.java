package ru.sapteh;

public class Student {
    public static void main(String[] args)
    class Student{
        private int id;
        private String firstName;
        private String middleName;
        private String secondName;
        private String birthDate;
        private String speciaLity;
        private int course;
        private String group;


        Student(int id){
            this.id = id;
            this.secondName = secondName;
            this.firstName = firstName;
            this.middleName = middleName;
            this.birthDate = birthDate;
            this.speciaLity = speciaLity;
            this.course = course;
            this.group = group;

        }

        public int getId() {
            return id;
        }

        public void SetId(int id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public String getSecondName() {
            return  secondName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }
        public String getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(String birthDate) {
            this.birthDate = birthDate;
        }

        public String getSpeciaLity() {
            return  speciaLity;
        }

        public void setSpeciaLity(String speciaLity) {
            this.speciaLity = speciaLity;
        }

        public int getCourse() {
            return course;
        }
        public void setCourse(int course) {
            this.course = course;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }
    }

}
