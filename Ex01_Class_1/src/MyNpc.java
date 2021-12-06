
/* Method 예제
 * Method와 함수Functuin은 같다
 * Method의 특징() 괄호가 있다. 
 * Method는 코드를 재사용 할 수 있게해준다.
 * 클래스는 객체의 설계도와 같은 것 그 자체로 이용할 수 없다
 * 이용하기 위해서는 설계도를 기초로 실체를 만들 필요가 있다 
 * 클래스가 실체화 된 것을 오브젝트(객체) 실체화 하는 작업을 오브젝트를 생성, 인스턴트화한다
 * ex) Book myBook = bew Book();
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */



//클래스 정의
class Npc {
	//필드 - 데이터
	String name;
	int hp;
	//메서드 - 동작
	void say() {
		System.out.println("안녕하세요");
	}
}



public class MyNpc {
	public static void main(String[] args) {
		
		Npc ch1 = new Npc();
		ch1.name = "경비";
		ch1.hp = 100;
		System.out.println(ch1.name + " : "+ ch1.hp);
		ch1.say();
		
		}
	}