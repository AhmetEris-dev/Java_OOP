package com.ahmete._04_Encapsulation;
/**
 * Encapsulation: Bir sınıf içindeki metod ve değişkenleri korumak demektir.
 * Nesne değişkenlerimizin dışarıdaki sınıflardan erişimini gizleriz.
 * Access Modifierlardan Private kullanarak bu erişim gizlenir.
 *
 * Nesne değişkenini gizledikten sonra değer atamak ve değer okumak için Public olarak tanımlanan setter ve getter metodlar kullanılır.
 * Setter metodlar ile nesne değişkenine değer atanırken gerekli kontroller sağlanabilir.
 * Getter metodu ile de nesne değişkeninin değerini okuyabilirsin.
 *
 * Encapsulation'da package yapısı da önemlidir. Access modifierlar package yapısına göre davranışlar sergiler.
 *
 */


public class _00_Encapsulation {
	private int kdvOrani; //nesne değişkeni: private yapılarak sınıf dışından erişim engellendi.
	
	public void setKdvOrani(int kdvOrani) {
		if(kdvOrani<30 && kdvOrani>0)
			this.kdvOrani = kdvOrani;
		else
			System.out.println("Oran 0-30 arası olmalıdır.");
	}
	
	public int getKdvOrani() {
		return kdvOrani;
	}
	
}