package product.view;

import java.util.List;
import java.util.Scanner;

import product.controller.ProductController;
import product.model.vo.Product;

public class ProductView {
	Scanner sc = new Scanner(System.in);
	String pId;
	String pName;
	int price;
	String desc;
	
	public int getMenu() {
		System.out.println("1. 전체 출력");
		System.out.println("2. 선택 출력");
		System.out.println("3. 추가");
		System.out.println("4. 수정");
		System.out.println("5. 삭제");
		System.out.println("6. 종료");
		System.out.println("----------------------");
		System.out.print("메뉴 선택 : ");
		int select = sc.nextInt();
		
		return select;
	}
	
	//MTest에서 호출 시 
	public ProductView() {
		int select = 0;
		ProductController pc = new ProductController();
		
		while(select != 6) {
			//getMenu 메소드에서 입력받은 번호 넘겨받음
			select = getMenu();
			
			switch(select) {
			case 1 : 
				List<Product> res = pc.selectAll();
				for(Product p : res) {
					System.out.println(p);
				}
				System.out.println();
				break;
			case 2 :
				System.out.print("검색할 제품명 입력 : ");
				String pName = sc.next();
				Product pro = pc.selectOne(pName);
				System.out.println(pro);
				break;
			case 3 : 
				System.out.println("*** 추가 ***");
				System.out.print("상품 코드 : ");
				String pId = sc.next();
				System.out.print("상품명 : ");
				String name = sc.next();
				System.out.print("가격 : ");
				int price = sc.nextInt();
				System.out.print("DESC : ");
				String desc = sc.next();
				
				Product insert = new Product(pId , name , price , desc);
				int res_insert = pc.insert(insert);
				
				if(res_insert > 0) {	
					System.out.println("insert 성공");
				} else {
					System.out.println("insert 실패");
				}
				break;
			case 4 :
				System.out.println("*** 수정 ***");
				System.out.print("상품 코드 : ");
				pId = sc.next();
				System.out.print("상품명 : ");
				pName = sc.next();
				System.out.print("가격 : ");
				price = sc.nextInt();
				System.out.print("DESC : ");
				desc = sc.next();
				Product update = new Product(pId , pName , price , desc);
				int res_update = pc.update(update);
				
				if(res_update > 0) {
					System.out.println("update 성공");
				} else {
					System.out.println("update 실패");
				}
				break;
			case 5 :
				System.out.println("*** 삭제 ***");
				System.out.print("삭제할 상품명 : ");
				pName = sc.next();
				Product del = new Product(pName);
				int res_del = pc.delete(del);
				
				if (res_del > 0) {
					System.out.println("delete 성공");
				} else {
					System.out.println("delete 실패");
				}
				break;
			case 6 :
				System.out.println("프로그램 종료");
				break;
			}
		}
		
	}
	
	
	
	
	
	
}
