package prob02;

import java.util.Scanner;

public class GoodsApp {
	
	private static final int COUNT_GOODS = 3;
	
	public static Goods GoodsInput(String goodsInfo){

		Goods goods = new Goods();
		
		String[] str = goodsInfo.split(" ");
		
		goods.setProductName(str[0]);
		goods.setPrice(Integer.parseInt(str[1]));
		goods.setNumber(Integer.parseInt(str[2]));
		
		return goods;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 상품 정보 담을 배열 생성
		Goods[] goodsArray = new Goods[COUNT_GOODS];

		// 상품 입력
		for(int i=0; i<goodsArray.length; i++){
			
			goodsArray[i] = GoodsInput(scanner.nextLine());
		}
		
		//상품 정보 출력
		for(int i=0; i<3; i++){
			System.out.println(goodsArray[i]);
		}
		
		// 자원정리
		scanner.close();
	}
}
