package Student;
import java.util.Scanner;
public class Ex1218_01 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		//배열선언
		Stu_info[] stu_info = new Stu_info[10];
		Student[] s = new Student[10];
		Stu_excute ex = new Stu_excute();
		int stu_count=0; //학생수 체크변수
		int choice=0; // 선택번호 변수

		//무한반복
		loop1:while(true) {
			choice = ex.first_print(); // 학생관리프로그램 - 출력화면
			//선택번호
			switch (choice) {
			case 1:
				// 학생정보입력 메소드 - 학생정보객체배열, 학생수 -> return 학생수
				stu_count = ex.sinfo_input(stu_info,stu_count); 
				break;
			case 2:
				// 학생정보출력 메소드 - 학생정보객체배열, 학생수
				ex.sinfo_allOutput(stu_info,stu_count);
				break;
			case 3:
				while(true) {
					// 학생검색 메소드 - 학생정보,학생성적 출력
					System.out.println("[ 학생검색 ]");
					System.out.println("번호 또는 이름을 입력하세요.(0.이전화면 이동)>>");
					String search = scan.nextLine();
					if(search.equals("0")) {
						System.out.println("▶▶▶ 이전화면으로 이동!");
						break;
					}
					int check=0; //검색이 없을 경우
					for(int i=0;i<stu_count;i++) {
						if(stu_info[i].num.contains(search) || stu_info[i].name.contains(search)) {
							//학생정보출력
							ex.sinfo_oneOutput(stu_info,i);
							// 학생성적을 출력하는 메소드 추가해야 됨.
							check=1;
						}
					}
					if(check==0) {
						System.out.println("찾는데이터가 없습니다. 다시 입력하세요.!");
					}
				}
				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 0:
				System.out.println("프로그램 종료합니다.!");
				break loop1;
			default:

				break;

			}//switch
		}//while
		
		
		

		// ---------------------------------
		// [ 1차 수업 들은 학생 ]
		// 1. 학생정보입력 - 학번,이름,전화번호,학년,학과,주소,전공교수
		// - 홍길동 이름을 입력하면 중복있습니다.
		// - s001 홍길동 010-1111-1111
		// 다른 학생입니까? (1.yes 2.no)
		// 2. 학생정보출력
		// 3. 학생검색 - 학생정보,학생성적 출력
		// 4. 학생성적입력 - 학생정보입력 되어 있지 않으면 입력이 안됨.
		// 어떤 학생의 성적입력을 할지 모름
		// 학번이나 이름으로 검색하세요.>>
		// 1. 학번있는지 없는지 확인 없으면 다시 입력
		// [ 옵션 ] 학번 또는 이름을 입력하세요.>>
		// 1 s001 홍길동
		// 2 s002 홍길순
		// 3 s003 홍길자
		// 원하는 번호를 입력하세요.>>1
		// 학번 : s001
		// 국어성적을 입력하세요.>>
		// 1번 선택하면 자동으로 학번 입력되겠끔 하는 방식
		// 학번-,국어,영어,수학,합계,평균,등수 - 등수자동처리해도 됨.
		// 성적입력이 완료되면 학번,(이름),국어,영어,수학,합계,평균 1번 출력
		// 5. 학생성적출력
		// 학번,(이름,학년,학과),국어,영어,수학,합계,평균,등수
		// 6. 등수처리
		// 7. 학생성적수정
		// 0. 종료

		// [ 학생관리프로그램 ] - 학번은 자동으로 입력되도록 함.
		// Student 객체 사용할것
		// 각 switch() - 메소드로 분리할것
		// 10명 - 학번,이름,국어,영어,수학,합계,평균,등수
		// 1.학생성적입력 - 1명 빠져나올수 있음
		// 2.학생성적출력
		// 3.학생검색
		// 4.학생성적수정 - 이름,번호 검색 - 국어,영어,수학 중 1개를 수정
		// 5.등수처리
		// 6.학생정보입력 - 학번,이름,전화번호,학년,학과,주소,전공교수
		// 0.종료

	}

}
