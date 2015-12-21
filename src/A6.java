/*
 * user name D0280212
 * 林倚婕
 */
import java.util.ArrayList;

abstract class Component {
	abstract void doQuestion();
	abstract void addQuestion(Question question);
}

class Question extends Component {
	String description;
	public Question(String desc) {
		this.description = desc;
	}
	public void print() {
		System.out.println(this.description);
		
	}
	@Override
	void doQuestion() {
		print();
	}
	@Override
	void addQuestion(Question question) {
	}
}

class TestPaper extends Component {
	ArrayList<Component> list;
	public TestPaper() {
		list = new ArrayList<>();
	}
	public void addQuestion(Question q) {
		list.add(q);
	}
	@Override
	void doQuestion() {
		list.forEach(Component::doQuestion);
	}
}
public class A6 {
	public static void main(String[] args) {
		Component quit = new TestPaper();
		if (quit instanceof TestPaper) {
			quit.addQuestion(new Question("88 + 123 = ?"));
			quit.addQuestion(new Question("0 + 1 = ?"));
		}
		System.out.println("student: leavesleeve,d0280212	GRADE:");
		System.out.println("1.100%(50%*2):");
		quit.doQuestion();
		
	}
}
