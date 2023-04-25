package day10;


class Person{
	private String name;
	private int age;
	
	//getter : 외부에서 name의 값을 가져다 사용할때
	public String getName() {
		return name;
	}
	//setter : 외부에서 값을 주면 그 값을 name에 저장할때
	public void setName(String name) {
		this.name = name;
	}
	//getter
	public int getAge() {
		return age;
	}
	//setter
	public void setAge(int age) {
		if(age > 0 && age <= 120) {
			this.age=age;
			
		}
	}
}





public class Test101 {

	public static void main(String[] args) {
		Person p = new Person();
		//p.name = "pikachu";
		p.setName("pikachu");
		//p.age = 10;
		p.setAge(10);
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
	}

}


