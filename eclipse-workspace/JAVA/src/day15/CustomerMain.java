package day15;

public class CustomerMain {

	public static void main(String[] args) {
		Customer c = new Customer("홍길동");
		Customer g = new GoldCustomer("홍순이");
		Customer v = new VIPCustomer("홍길이",1111);
		Customer v1 = new VIPCustomer("홍1이",2222);
		Customer v2 = new VIPCustomer("홍2이",4444);
		Customer v3 = new VIPCustomer("홍3이",5555);
		Customer v4 = new VIPCustomer("홍4이",6666);
		Customer v5 = new VIPCustomer("홍5이",7777);
		
		int cnt =0;
		Customer[] carr =  new Customer[10];
		carr[cnt] = c;
		cnt++;
		carr[cnt] = g;
		cnt++;
		carr[cnt] = v;
		cnt++;
		carr[cnt] = v1;
		cnt++;
		carr[cnt] = v2;
		cnt++;
		carr[cnt] = v3;
		cnt++;
		carr[cnt] = v4;
		cnt++;
		carr[cnt] = v5;
		cnt++;
		
		for(int i = 0; i<cnt; i++) {
			Customer cList = carr[i];
			if(cList instanceof VIPCustomer) {
				VIPCustomer vip = (VIPCustomer)cList;
				if(vip.getAgentID()==1111)
					vip.setAgentID(3333);
			}
		}
		//agentID =1111 =>
	}

}
