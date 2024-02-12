public class StudentServis {
    public class StudentService {
        private Student student;

        public StudentService( Student student ) {
            this.student = student;
        }

        public void sayisal( int matematik, int fizik, int kimya, int biyoloji ) {
            if (matematik >= 0 && matematik <= 100 &&
                    fizik >= 0 && fizik <= 100 &&
                    kimya >= 0 && kimya <= 100 &&
                    biyoloji >= 0 && biyoloji <= 100) {

                this.student.setGrades(matematik, fizik, kimya, biyoloji);
                calculateAverage();
            } else {
                System.out.println("Geçersiz not değerleri. Notlar 0 ile 100 arasında olmalıdır.");
            }
        }

        private void calculateAverage() {
            int total = student.getMatematik() + student.getFizik() + student.getKimya() + student.getBiyoloji();
            double average = total / 4.0;
            student.setAverage(average);
        }



    }
}
