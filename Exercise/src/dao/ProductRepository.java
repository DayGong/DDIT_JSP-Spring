package dao;

import java.util.ArrayList;
import java.util.List;

import vo.Product;

public class ProductRepository {
	// 싱글톤 객체: 객체가 메모리에 1회 생성됨. 그 이후로는 객체가 공유됨
		private static ProductRepository instance = new ProductRepository();
		public static ProductRepository getInstance() {return instance;}
		
		// 상품 목록 저장할 리스트를 작성(전역변수)
		private List<Product> listOfProducts = new ArrayList<Product>();
		
		// 기본 생성자. 3개의 상품 정보를 설정
		private ProductRepository() {
			//생성자(상품 아이디, 상품 명, 상품 가격 초기화)
			Product phone = new Product("P1234","iPhone 6s", 800000);
			//상품 설명
			phone.setDescription("4.7-inch, 1334x750 Renina HD display."
		            + "8-megapixel iSight Camera");
			//분류
			phone.setCategory("Smart Phone");
			//제조사
			phone.setManufacturer("Apple");
		    //재고 수
		    phone.setUnitsInStock(1000);
		    //신상품 or 중고품 or 재생품
		    phone.setCondition("New");
		    //이미지 파일명
		    phone.setFilename("P1234.jpg");
		      
		    //-------------------------------휴대폰 등록 끝--------------------------------
		      
		    //-------------------------------노트북 등록 시작--------------------------------
		    //생성자(상품 아이디, 상품 명, 상품 가격 초기화)
		    Product notebook = new Product("P1235","LG PC 그램", 1500000);
		    //상품 설명
		    notebook.setDescription("13.3-inch, IPS LED display, 5rd Generation"
		            + "Intel Core processors");
		    //분류
		    notebook.setCategory("Notebook");
		    //제조사
		    notebook.setManufacturer("LG");
		    //재고 수
		    notebook.setUnitsInStock(1000);
		    //신상품 or 중고품 or 재생품
		    notebook.setCondition("Refurbished");
		    //이미지 파일명
		    notebook.setFilename("P1235.jpg");
		    //-------------------------------노트북 등록 끝--------------------------------
		      
		    //-------------------------------태블릿 등록 시작--------------------------------
		    //생성자(상품 아이디, 상품 명, 상품 가격 초기화)
		    Product tablet = new Product("P1236","Galaxy Tab S", 900000);
		    //상품 설명
		    tablet.setDescription("212.8*125.6*6.6m, Super AMOLED display, "
		            + "Octa-Core processor");
		    //분류
		    tablet.setCategory("Tablet");
		    //제조사
		    phone.setManufacturer("Samsung");
		    //재고 수
		    tablet.setUnitsInStock(1000);
		    //신상품 or 중고품 or 재생품
		    tablet.setCondition("Old");
		    //이미지 파일명
		    tablet.setFilename("P1236.jpg");
		    //-------------------------------태블릿 등록 끝--------------------------------
		    
		    listOfProducts.add(phone);
		    listOfProducts.add(notebook);
		    listOfProducts.add(tablet);
		}
}
