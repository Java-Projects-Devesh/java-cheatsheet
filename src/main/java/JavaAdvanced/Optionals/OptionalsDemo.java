package JavaAdvanced.Optionals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class OptionalFetcher {
    List<Cat> catList;
    public OptionalFetcher() {
        this.catList = new ArrayList<Cat>();
        catList.add(new Cat(5, "Pussy"));
        catList.add(new Cat(3, "Sissy"));
        catList.add(new Cat(6, "Lissy"));
    }

    public Optional<Cat> fetchCat(String catName) {
        //Either
        //var cat = catList.stream().filter(cat1 -> cat1.getName() == catName).toList().stream().findFirst().orElse(null);
        //return Optional.ofNullable(cat);

        //Or
        var cat = catList.stream().filter(cat1 -> cat1.getName() == catName).toList().stream().findFirst();
        return cat;
    }

    public Optional<Integer> fetchOptionalInt(){
        return Optional.ofNullable(10);
        //Or
        //return Optional.ofNullable(null);
    }

    public Optional<String> fetchOptionalString(){
        return Optional.ofNullable("STR");
        //Or
        //return Optional.ofNullable(null);
    }


}

public class OptionalsDemo {
    public static void main(String[] args) {
        var optionalCat = new OptionalFetcher().fetchCat("Pussy");

        System.out.println(optionalCat.isEmpty());
        System.out.println(optionalCat.isPresent());

        optionalCat.ifPresent(cat -> System.out.println(cat.getAge() + " :: " + cat.getName()));
        optionalCat.ifPresentOrElse(cat -> System.out.println(cat.getAge()+ " : " + cat.getName()), ()-> System.out.println("No Such cat"));

        if (optionalCat.isEmpty()){
            System.out.println("No cat found with that name.");
        }

        if (optionalCat.isPresent()){
            System.out.println(optionalCat.get().getAge() + " :: " + optionalCat.get().getName());
        }

        var optionalInt = new OptionalFetcher().fetchOptionalInt();

        System.out.println(optionalInt.isEmpty());
        System.out.println(optionalInt.isPresent());

        optionalInt.ifPresent(num-> System.out.println(num + 5));
        optionalInt.ifPresentOrElse(num-> System.out.println(num + 10), ()-> System.out.println("Num not present"));



    }
}
