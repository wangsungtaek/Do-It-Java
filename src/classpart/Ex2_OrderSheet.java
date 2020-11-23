package classpart;

public class Ex2_OrderSheet {

	String orderNumber;
	String orderId;
	String orderDay;
	String orderName;
	String orderProductNumber;
	String orderAddress;
	
	public String getOrderNumber(){
		return orderNumber;
	}
	public String getOrderId(){
		return orderId;
	}
	public String getOrderDay(){
		return orderDay;
	}
	public String getOrderName(){
		return orderName;
	}
	public String getOrderProductNumber(){
		return orderProductNumber;
	}
	public String getOrderAddress(){
		return orderAddress;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2_OrderSheet orderSheet = new Ex2_OrderSheet();
		orderSheet.orderNumber = "201803120001";
		orderSheet.orderId = "abc123";
		orderSheet.orderDay = "2018년 3월 12일";
		orderSheet.orderName = "홍길순";
		orderSheet.orderProductNumber = "PD0345-12";
		orderSheet.orderAddress = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : " + orderSheet.getOrderNumber());
		System.out.println("주문자 아이디 : " + orderSheet.getOrderId());
		System.out.println("주문 날짜 : " + orderSheet.getOrderDay());
		System.out.println("주문자 이름 : " + orderSheet.getOrderName());
		System.out.println("주문 상품 번호 : " + orderSheet.getOrderProductNumber());
		System.out.println("배송 주소 : " + orderSheet.getOrderAddress());
	}

}
