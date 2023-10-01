package org.example;

public enum AlcoholDrink {
		WHISKEY("Виски"),
		VODKA("Водка"),
		RUM("Ром"),
		TEQUILA("Текила"),
		GIN("Джин"),
		BEER("Пиво"),
		WINE("Портвейн 777"),
		CHAMPAGNE("Crystal"),
		KOKTEYL("Прощай разум - встретимся завтра (Эксклюзив)");
		private final String sort;

		AlcoholDrink(String sort) {
				this.sort = sort;
		}

		public String getName() {
				return sort;
		}
}

