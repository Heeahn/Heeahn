package java_SOLO;

import java.util.Scanner;

public class TeamProject {
		
//		* 타워 주차 프로그램 [ 주차관리인 만 사용O  일반고객X ] 
//				조건1 : 3층 짜리 주차타워일 경우 층별 4개씩 주차 가능 
//					1층 [ ] [ ] [ ] [ ]
//					2층 [ ] [ ] [ ] [ ]
//					3층 [ ] [ ] [ ] [ ]
//				조건2 : 메뉴 : 1.입차 2.출차 3.매출확인
//					입차시 : 차량번호[4자리] 입력받아 주차타워에 자리가 있을경우 주차 
//					출차시 : 차량번호[4자리] 를 입력받아 출차시 금액계산
//						* 금액표 
//							1 .최초 30분 무료 
//							2. 30분 이후부터 10분당 1000원
//							3. 하루 최대 5만원 부과
//							4. 1일당 5만원
	//
//					매출확인시 : 연도 , 월 입력받아 해당 월의 일별 매출 출력 / 매출이 없는 경우 없다 .
	//
//				조건3 : 클래스 , 파일처리 , Arraylist , 예외처리 필수 사용 [ 그외 선택 사항 ] 
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] 주차공간 = {"[]", "[]", "[]", "[]", // 3 7 11
								"[]", "[]", "[]", "[]",
								"[]", "[]", "[]", "[]" };
			
		while(true) {
				
			for(int i=0; i<주차공간.length; i++) {
				System.out.print(주차공간[i]);
				if( i % 4 == 3) System.out.println();				
			}
				
			System.out.println("1. 입차 2. 출차 3. 매출확인");
			int ch = scanner.nextInt();
				
			if(ch == 1) {
				System.out.println("입차 시간 :");
				System.out.println("차량 번호 :");
					
			}
			else if(ch == 2) {
					
			}
			else if(ch == 3) {
					
			}
			else {
				System.out.println("알 수 없는 행동입니다.");
			}			
		}				
	}				
}