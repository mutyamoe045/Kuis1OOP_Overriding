public class Bonek extends SupporterBola {

	public void mendukung () {
		System.out.println("Salam satu nyali,Wani!!!");
	}
	
	public static void main (String [] args ){
		Bonek spt = new Bonek () ;
			System.out.println(spt.asal);
			System.out.println(spt.warna);
		
	System.out.println ("Supporter Jangan Rasis");

	Bonek obj = new Bonek();
	obj.mendukung();
}
}