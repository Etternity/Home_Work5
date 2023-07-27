public class Task6_DeMorganComparison {
    public static void main(String[] args) {
        boolean A = true;
        boolean B = false;

        boolean original = A | B;
        System.out.println("Вихідний вираз: " + original);

        boolean equivalent = !( !A & !B );
        System.out.println("Еквівалентний вираз з використанням теореми Де Моргана: " + equivalent);
        //або
        if (A | B)
            System.out.println("A | B = " + (A | B));
        else
            System.out.println("A | B = " + (A | B));

        // Умови після застосування теореми Де Моргана.
        if (!( !A & !B ))
            System.out.println("!( !A & !B )" + !( !A & !B ));
        else
            System.out.println("!( !A & !B ) = " + !( !A & !B ));
    }
}