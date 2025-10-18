import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        ArrayList<Student> list = new ArrayList<>();
        for(int i = 0; i < rank.length; i++) {
            if(attendance[i]) {
                list.add(new Student(rank[i], i));
            }
        }
        Collections.sort(list);
        return 10000 * list.get(0).getIdx() + 100 * list.get(1).getIdx() + list.get(2).getIdx();
    }
    
    class Student implements Comparable<Student> {
        private int grade;
        private int idx;

        public Student(int grade, int idx) {
            this.grade = grade;
            this.idx = idx;
        }

        public int getGrade() {
            return grade;
        }

        public int getIdx() {
            return idx;
        }

        @Override
        public int compareTo(Student other) {
            return this.grade - other.grade;
        }
    }
}
