package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];
		
		
		
		for(int i=0; i<goods.length; i++) {
			String info=scanner.nextLine();
			String[] gs=info.split(" ");
			goods[i]=new Goods(gs[0], Integer.parseInt(gs[1]), Integer.parseInt(gs[2]));
		}

		for (Goods goods2 : goods) {
			goods2.show();
		}
		
		scanner.close();
	}
}
