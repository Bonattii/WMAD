package AuxiliarOperations;

public class AuxiliarOperations {
    private long card;

    public void setCard(long card) {
        this.card = card;
    }

    public int sumNoMultiplied(long cardNumber) {
        long auxiliar = 0;
        int sum = 0;

        // 1 - 635271 -> auxliar = 1 -> sum = 1
        // 2 - 6352 -> auxiliar = 2 -> sum = 3
        // 3 - 63 -> auxliar = 3 -> sum = 6
        while (cardNumber > 0) {
            // Will split the last number of the cardNumber
            auxiliar = cardNumber % 10;
            // Divide the number by 100 -> go to the next number
            cardNumber = cardNumber / 100;
            sum += auxiliar;
        }

        return sum;
    }

    public int SumMultiplied(long cardNumber) {
        long numberNoMultiplied, numberMultiplied, auxiliar;
        int sum = 0;

        while (cardNumber > 0) {
            // Split the everyOtherNumber so
            // 635371 -> numberNoMultiplied = 7
            // Because 635371 % 100 = 71 -> 71 / 10 = 7.1 = 7
            numberNoMultiplied = cardNumber % 100 / 10;
            // Go to the next number
            cardNumber = cardNumber / 100;

            if ((numberNoMultiplied * 2) >= 10) {
                // Multiply the number for 2
                numberMultiplied = numberNoMultiplied * 2;

                while (numberMultiplied > 0) {
                    // Split the number * 2
                    auxiliar = numberMultiplied % 10;
                    // Go to the next number
                    numberMultiplied = numberMultiplied / 10;
                    sum += auxiliar;
                }
            } else if ((numberNoMultiplied * 2) < 10) {
                // Just add the number * 2 to sum
                sum += (numberNoMultiplied * 2);
            }
        }
        return sum;
    }

    public int getTheTwoFirstNumbers(long cardNumber) {
        int twoFirstDigits = Integer.parseInt(Long.toString(cardNumber).substring(0, 2));

        return twoFirstDigits;
    }

    public boolean Luhn() {
        int sumNoMultipliedNumber = this.sumNoMultiplied(card);
        int sumMultipliedNumber = this.SumMultiplied(card);
        int totalSum = sumMultipliedNumber + sumNoMultipliedNumber;

        if ((totalSum % 10) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int lengthOfCard(long cardNumber) {
        int i = 0;
    
        while (cardNumber > 0) {
            cardNumber = cardNumber / 10;
            i++;
        }

        return i;
    }

    public void verificator() {
        int firstNumbers = this.getTheTwoFirstNumbers(card);
        int length = this.lengthOfCard(card);

        if ((firstNumbers == 34 || firstNumbers == 37) && length == 15) {
            System.out.println("Your AMEX credit card " + card + " is Valid!");
        } else if ((firstNumbers > 50 && firstNumbers < 56) && length == 16) {
            System.out.println("Your MASTERCARD credit card " + card + " is Valid!");
        } else if ((firstNumbers > 39 && firstNumbers < 50) && (length == 13 || length == 16)) {
            System.out.println("Your VISA credit card " + card + " is Valid!");
        } else {
            System.out.println("Your credit card " + card + " is INVALID!");
        }
    }
}