package chapter7;
import java.util.*;

public class HashMapScoreEx {
	public static void main(String[] args) {
		// 이름과 점수를 저장할 HashMap 컬렉션 생성
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
			// var scoreMap = new HashMap<String, Integer>();로 간략히 써도 됨
		
		// 5개의 점수 저장
		scoreMap.put("김가가", 97);
		scoreMap.put("강모모", 88);
		scoreMap.put("장나나", 75);
		scoreMap.put("박다다", 86);
		scoreMap.put("황라라", 70);
		
		System.out.println("HashMap의 요소 개수 : " + scoreMap.size());
		
		// 모든 사람의 점수 출력. scoreMap에 들어 있는 모든 (key, value) 쌍 출력
		Set<String> keys = scoreMap.keySet();	// 모든 key를 가진 Set 컬렉션 리턴
		Iterator<String> it = keys.iterator();	// set에 있는 모든 key를 순서대로 검색하는 Iterator 리턴
		
		while(it.hasNext())	{
			String name = it.next();		// 다음 키. 학생이름
			int score = scoreMap.get(name);	// 점수 알아내기
			System.out.println(name + " : " + score);
		}
	}
}
