public class Main {
    public static void main(String[] args) {
        BurgerPage burger_1 = new BurgerPage();
        burger_1.id = 2997;
        burger_1.name = "Dark Burger";
        burger_1.priceInRub = 179;
        burger_1.description = "Burger with chicken, barbecue sauce, fresh vegetables, cheddar cheese and emmental, onions, pickled cucumbers and jalapenos on a fragrant rye bun.";
        burger_1.weightInGram = 255;

        System.out.println(burger_1.id);
        System.out.println(burger_1.name);
        System.out.println("Price " + burger_1.priceInRub + " rub");
        System.out.println(burger_1.description);
        System.out.println("Weight " + burger_1.weightInGram + " gram");

        BurgerPage burger_2 = new BurgerPage();
        burger_2.name = "Cheese Burger";
        burger_2.weightInGram = 167;
        burger_2.calorieInKkal = 237;
        burger_2.proteinInGram = 13.2;
        burger_2.fatInGram = 8.6;
        burger_2.carbohydrateInGram = 26.6;

        System.out.println(burger_2.name);
        System.out.println("Weight " + burger_2.weightInGram + " gram");
        System.out.println("Calorie " + burger_2.calorieInKkal + " Kkal");
        System.out.println("Proteins " + burger_2.proteinInGram + " gram");
        System.out.println("Fats " + burger_2.fatInGram + " gram");
        System.out.println("Carbohydrates " + burger_2.carbohydrateInGram + " gram");

    }
}
