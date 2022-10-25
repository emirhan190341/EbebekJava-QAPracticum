package EBebek;

public class NameException extends Exception {

    public NameException(String str) {
        super(str);
    }



    public static class CustomPart {
        static void Validate(String name,int salary,int workHours,int hireYear) throws NameException {

            String[] splitName = name.split("");
            for (String w : splitName) {
                if (!w.matches("[A-Za-z]")) {
                    System.out.println("Lütfen kurallara uygun bir isim giriniz.");
                    System.out.println("-İsim türkçe karakter içermemeli");
                    System.out.println("-İsim boşluk karakteri içermemeli");
                    System.out.println("-İsim nümerik karakter içermemeli");
                    System.out.println("-İsim özel karakter içermemeli ÖRN: '!:_+/)' ");
                    throw new NameException("Girdiginiz isim uygun degildir.");

                }
            }
        if(salary < 0){
            System.out.println("Lütfen pozitif bir değer giriniz.");
            throw new NameException("Girdiginiz değer uygun degildir.");
        }
        if(workHours < 0){
            System.out.println("Lütfen pozitif bir değer giriniz.");
            throw new NameException("Girdiginiz değer uygun degildir.");
        }
        if(hireYear < 0){
            System.out.println("Lütfen pozitif bir değer giriniz.");
            throw new NameException("Girdiginiz değer uygun degildir.");
        }

        }
    }
}

