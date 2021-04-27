package examinations.examination2;

class Student {
	String id;
	String name;
	
	// �Ӽ��� �ʱⰪ�� �������� ������ �������� null�� �ʱ�ȭ �ȴ�.
	// ��������� �ʱⰪ�� null�� ������ �� �ִ�.
	Examin exam = null;  

	Student(String id, String name) { // ������(constructor)
		this.id = id;
		this.name = name;
	}

	Student(String id, String name, Examin exam) { // ������(constructor)
		this.id = id;
		this.name = name;
		this.exam = exam;
	}
	
	void setExamin(Examin exam) {
		this.exam = exam;
	}
	
	void computeExam() {
		this.exam.compute();
	}
	
	void printExam() {
		System.out.println(">       id:" + id);
		System.out.println(">     name:" + name);
		System.out.println(">   korean:" + exam.kor);
		System.out.println(">  english:" + exam.eng);
		System.out.println(">     math:" + exam.math);
		System.out.println(">    total:" + exam.total());
		System.out.println("> avgerage:" + exam.avg());
		System.out.println("-----------------------------------");
	}
}
