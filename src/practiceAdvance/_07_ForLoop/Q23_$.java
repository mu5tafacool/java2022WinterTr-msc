package src.practiceAdvance._07_ForLoop;

import java.util.Scanner;

public class Q23_$ {
//yemek kode uyku dongusu

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Lutfen yasinizi gir");
        int yas = scan1.nextInt();
        int emelklilikYasi = 70;
        int programDongusu = (emelklilikYasi - yas) * 365;
        System.out.println("Bu program " + programDongusu + " gun boyunca tekrarlanacaktir");

        boolean yemekYedinMi = false;
        boolean uyudunMu = false;
        boolean codeYazdinMi = false;


        for (int i = programDongusu; i > 0; i--) {
            Scanner scan = new Scanner(System.in);
            if (!codeYazdinMi) {
                String gorev;
                do {
                    System.out.println("Code yazdin mi? 'evet'/'hayir'");
                    gorev = scan.next().toLowerCase();
                    if (gorev.equals("hayir")) {
                        System.out.println("O halde otur code yaz");
                    }

                } while (gorev.contains("hayir"));
                {
                    System.out.println("O halde yemek yiyebilirsin");

                    if (!yemekYedinMi) {
                        do {
                            System.out.println("Yemek yedin mi? 'evet'/'hayir'");
                            gorev = scan.next().toLowerCase();
                            if (gorev.equals("hayir")) {
                                System.out.println("Biseyler ye ac kafayla code yazamazsin");
                            }


                        } while (gorev.contains("hayir"));
                        {
                            System.out.println("O halde uyuyabilirsin");
                            if (!codeYazdinMi) {
                                do {
                                    System.out.println("Uyudun mu? 'evet'/'hayir'");
                                    gorev = scan.next().toLowerCase();
                                    if (gorev.equals("hayir")) {
                                        System.out.println("O halde git yat sabah code yazacaksin daha");
                                    }

                                } while (gorev.contains("hayir"));
                                {
                                    System.out.println("Gunaydin ");
                                }

                            }


                        }
                    }
                }
            }
        }
    }
}

