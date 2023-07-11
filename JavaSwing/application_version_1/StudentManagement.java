package application_version_1;
import java.util.ArrayList;


public class StudentManagement implements IStudentManagement {

	private ArrayList<Student> list;
	
	public StudentManagement() {
		this.list = new ArrayList<Student>();
	}
	
	// Học viên code ở đây
	@Override
	public void create(Student s) {
		// Triển khai chức năng thêm sinh viên vào danh sách
		this.list.add(s);
	}

	// Học viên code ở đây
	@Override
	public void showAll() {
		// Triển khai chức năng in ra toàn bộ sinh viên trong danh sách
		for(int i = 0; i < this.list.size(); i++){
			System.out.println(this.list.get(i).toString());
		}
	}

}
