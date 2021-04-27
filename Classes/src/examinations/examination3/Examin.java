package examinations.examination3;

class Examin {
	String[] subjects;  // ����
	int[] scores;		// ����
	int total;
	int subcnt;
	float avg;
	
	public Examin(int subcnt) {
		this.subcnt = subcnt;
		this.subjects = new String[subcnt];
		this.scores = new int[subcnt];
	}
	
	void compute() {
		for(int score : scores) {
			this.total += score;
		}
		
		this.avg = (float)((float)this.total / (float)subcnt);
	}
	
	int getSubCount() { // getter
		return this.subcnt;
	}

	void setScore(int index, String subject, int score) { // setter
		if(index < 0 || index >= this.subcnt) {
			System.out.println("������ ������ �Ѿ���ϴ�.");
			return;
		}
		
		this.subjects[index] = subject;
		this.scores[index] = score;
	}
	
	String getSubject(int index) {
		if(index < 0 || index >= this.subcnt) {
			System.out.println("������ ������ �Ѿ���ϴ�.");
			return "";
		}
		
		return this.subjects[index];
	}
	
	int getScore(int index) {
		if(index < 0 || index >= this.subcnt) {
			System.out.println("������ ������ �Ѿ���ϴ�.");
			return 0;
		}
		
		return this.scores[index];
	}
	
	int total() {
		return this.total;
	}
	
	float avg() {
		return this.avg;
	}
}
