public class Student {

        private int id;
        private String name;
        private int age;
        private String hometown;
        private String classNumber;

        public Student(int id, String name, int age, String hometown, String classNumber) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.hometown = hometown;
            this.classNumber = classNumber;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getHometown() {
            return hometown;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }

        public String getClassNumber() {
            return classNumber;
        }

        public void setClassNumber(String classNumber) {
            this.classNumber = classNumber;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", hometown='" + hometown + '\'' +
                    ", classNumber='" + classNumber + '\'' +
                    '}';
        }
    }

