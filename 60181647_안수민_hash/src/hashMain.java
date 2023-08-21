

public class hashMain {

	public static void main(String[] args) {
		int n = 7;
		hashOpenAddrLinear h = new hashOpenAddrLinear(n);
		hashChaining hc = new hashChaining(n);
		System.out.println(h.hashInsert("AA"));
		System.out.println(h.hashInsert("AB"));
		System.out.println(h.hashInsert("ZX"));
		System.out.println(h.hashInsert("RRR"));
		System.out.println(h.hashInsert("A1"));
		System.out.println(h.hashInsert("A2"));
		System.out.println(h.hashInsert("A3"));
		h.showTable();
		
		System.out.println(h.hashInsert("A4"));
		System.out.println(h.hashInsert("A5"));
		
		System.out.println(h.hashInsert("A6"));
		h.showTable();
		System.out.println(h.hashInsert("A7"));
		h.showTable();
		
		System.out.println("Deleting test");
		h.hashDelete("A3");
		h.showTable();
		h.hashDelete("A4");
		h.showTable();
		h.hashDelete("A5");
		h.showTable();
		h.hashDelete("AA");
		h.showTable();
		
		
		System.out.println(hc.hashInsert("AA"));
		System.out.println(hc.hashInsert("AB"));
		System.out.println(hc.hashInsert("ZX"));
		System.out.println(hc.hashInsert("RRR"));
		System.out.println(hc.hashInsert("A1"));
		System.out.println(hc.hashInsert("A2"));
		System.out.println(hc.hashInsert("A3"));
		hc.showTable();
		
		System.out.println(hc.hashInsert("A4"));
		System.out.println(hc.hashInsert("A5"));
		
		System.out.println(hc.hashInsert("A6"));
		hc.showTable();
		System.out.println(hc.hashInsert("A7"));
		hc.showTable();
		
		System.out.println("Deleting test");
		hc.hashDelete("A3");
		hc.showTable();
		hc.hashDelete("A4");
		hc.showTable();
		hc.hashDelete("A5");
		hc.showTable();
		hc.hashDelete("AA");
		hc.showTable();
	}

}
