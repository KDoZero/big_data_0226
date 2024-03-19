package 실습문제파일입출력과정렬;

class Studentinfo implements Comparable<Studentinfo> {
    String name;
    int total;
    float avg;

    public Studentinfo(String name, int total, float avg) {
        this.name = name;
        this.total = total;
        this.avg = avg;
    }

        public String getName() {
            return name;
        }

        public int getSum(){
            return total;
        }
        public float getAvg(){
            return avg;
    }
    @Override
    public int compareTo(Studentinfo o) {
        if(this.total == o.total)
            return this.name.compareTo(o.name);
        else if(this.total > o.total) return -1;
        else return 1;
    }
}
