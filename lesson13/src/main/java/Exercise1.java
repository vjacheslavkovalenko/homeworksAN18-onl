/*
 * Домашнее задание.
 ** Задание 13.1
 *** Необходимо создать следующие объекты:
 **** 1) Товар (поля - название, стоимость, категория (enum), возможность доставки (boolean), список магазинов где он есть в наличии, производитель).
 **** 2) Производитель (название, страна).
 **** 3) Магазин (номер, город, адрес, номер телефона).
 ***
 *** На вход мы получаем коллекцию всех товаров, у каждого из который указан производитель и список магазинов, где данный товар можно купить.
 *** Должны быть некоторые товары, относящиеся к одному производителю. Некоторые товары должны относится к одному магазину.
 ***
 *** Необходимо выполнить:
 **** 1) определить самый дорогой и дешевый товар
 **** 2) найти все товары которые возможно доставить до покупателя
 **** 3) посчитать среднюю стоимость товара указанной категории
 **** 4) найти все товары определенного производителя
 **** 5) найти всех названия производителей указанной страны
 **** 6) найти все магазины конкретного города
 **** 7) найти адрес магазина по указанному номеру телефона
 **** 8) все товары указанного номера магазина
 **** 9) составить map где ключ это номер магазина, а значение - это номер телефона данного магазина
 **** 10) узнать все ли товары указанной категории можно доставить до покупателя
 **** 11) посчитать количество магазинов
 **** 12) вывести товары отсортированные по стоимости (от большего к меньшему)
 */


import java.util.*;
import java.util.stream.Collectors;


public class Exercise1 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // Создание производителей
        Manufacturer manufacturer1 = new Manufacturer("Производитель 1", "Страна 1");
        Manufacturer manufacturer2 = new Manufacturer("Производитель 2", "Страна 2");

        // Создание магазинов
        Shop shop1 = new Shop(1, "Город 1", "Адрес 1", "123456789");
        Shop shop2 = new Shop(2, "Город 1", "Адрес 2", "987654321");
        Shop shop3 = new Shop(3, "Город 2", "Адрес 3", "456789123");

        // Создание товаров
        products.add(new Product("Товар 1", 100.0, Category.ELECTRONICS, true, List.of(shop1, shop2), manufacturer1));
        products.add(new Product("Товар 2", 50.0, Category.CLOTHING, false, List.of(shop2, shop3), manufacturer1));
        products.add(new Product("Товар 3", 75.0, Category.FURNITURE, true, List.of(shop1, shop3), manufacturer2));
        products.add(new Product("Товар 4", 30.0, Category.BOOKS, false, List.of(shop2), manufacturer2));
        products.add(new Product("Товар 5", 120.0, Category.TOYS, true, List.of(shop1, shop2, shop3), manufacturer1));

        // 1) Определить самый дорогой и дешевый товар
        System.out.println("Самый дорогой товар: " + products.stream()
                .max(Comparator.comparingDouble(Product::getPrice))
                .map(Product::getName)
                .orElse("Нет товаров"));

        System.out.println("Самый дешевый товар: " + products.stream()
                .min(Comparator.comparingDouble(Product::getPrice))
                .map(Product::getName)
                .orElse("Нет товаров"));

        // 2) Найти все товары, которые возможно доставить до покупателя
        System.out.println("\nТовары, доступные для доставки:");
        products.stream()
                .filter(Product::isDeliverable)
                .forEach(product -> System.out.println(product.getName()));

        // 3) Посчитать среднюю стоимость товара указанной категории
        Category targetCategory = Category.ELECTRONICS;
        double averagePrice = products.stream()
                .filter(product -> product.getCategory() == targetCategory)
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0.0);
        System.out.printf("\nСредняя стоимость товаров категории %s: %.2f%n", targetCategory, averagePrice);

        // 4) Найти все товары определенного производителя
        Manufacturer targetManufacturer = manufacturer1;
        System.out.printf("\nТовары производителя %s:%n", targetManufacturer.getName());
        products.stream()
                .filter(product -> product.getManufacturer().equals(targetManufacturer))
                .forEach(product -> System.out.println(product.getName()));

        // 5) Найти все названия производителей указанной страны
        String targetCountry = "Страна 1";
        System.out.printf("\nПроизводители из страны %s:%n", targetCountry);
        products.stream()
                .map(Product::getManufacturer)
                .filter(manufacturer -> manufacturer.getCountry().equals(targetCountry))
                .map(Manufacturer::getName)
                .distinct()
                .forEach(System.out::println);

        // 6) Найти все магазины конкретного города
        String targetCity = "Город 1";
        System.out.printf("\nМагазины в городе %s:%n", targetCity);
        products.stream()
                .flatMap(product -> product.getShops().stream())
                .filter(shop -> shop.getCity().equals(targetCity))
                .map(Shop::getAddress)
                .distinct()
                .forEach(System.out::println);

        // 7) Найти адрес магазина по указанному номеру телефона
        String targetPhoneNumber = "987654321";
        String shopAddress = products.stream()
                .flatMap(product -> product.getShops().stream())
                .filter(shop -> shop.getPhoneNumber().equals(targetPhoneNumber))
                .map(Shop::getAddress)
                .findFirst()
                .orElse("Магазин не найден");
        System.out.printf("\nАдрес магазина по номеру телефона %s: %s%n", targetPhoneNumber, shopAddress);

        // 8) Все товары указанного номера магазина
        int targetShopNumber = 1;
        System.out.printf("\nТовары магазина №%d:%n", targetShopNumber);
        products.stream()
                .filter(product -> product.getShops().stream()
                        .anyMatch(shop -> shop.getNumber() == targetShopNumber))
                .forEach(product -> System.out.println(product.getName()));

        // 9) Составить map где ключ это номер магазина, а значение - это номер телефона данного магазина
        Map<Integer, String> shopPhoneNumbers = products.stream()
                .flatMap(product -> product.getShops().stream())
                .collect(Collectors.toMap(
                        Shop::getNumber,
                        Shop::getPhoneNumber,
                        (oldValue, newValue) -> oldValue
                ));
        System.out.println("\nМагазины и их номера телефонов:");
        shopPhoneNumbers.forEach((number, phoneNumber) -> System.out.printf("Магазин №%d: %s%n", number, phoneNumber));

        // 10) Узнать все ли товары указанной категории можно доставить до покупателя
        Category categoryToCheck = Category.ELECTRONICS;
        boolean allDeliverable = products.stream()
                .filter(product -> product.getCategory() == categoryToCheck)
                .allMatch(Product::isDeliverable);
        System.out.printf("\nВсе товары категории %s доступны для доставки: %b%n", categoryToCheck, allDeliverable);

        // 11) Посчитать количество магазинов
        long shopCount = products.stream()
                .flatMap(product -> product.getShops().stream())
                .count();
        System.out.printf("\nКоличество магазинов: %d%n", shopCount);

        // 12) Вывести товары, отсортированные по стоимости (от большего к меньшему)
        System.out.println("\nТовары, отсортированные по стоимости (от большего к меньшему):");
        products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
                .forEach(product -> System.out.printf("%s (%.2f)%n", product.getName(), product.getPrice()));
    }
}
