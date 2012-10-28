package guessNumber;

public class GuessNumber {

    private String randomNumber;

    public GuessNumber(String randomNumber) {
        this.randomNumber = randomNumber;
    }

    public char[] splitNumber(String number){
        char[] numbers;
        numbers = new char[4];
        for (int i=0;i<4;i++){
            numbers[i] = number.charAt(i);
        }
        return numbers;
    }

    public String validate(String userInput) {
        char[] randomNumbers = splitNumber(randomNumber);
        char[] userNumbers = splitNumber(userInput);
        int countA = 0, countB = 0;
        for(int i=0;i<4;i++){
            if(randomNumbers[i]==userNumbers[i]){
                countA++;
                continue;
            }
            for(int j=0;j<4;j++){
                if(randomNumbers[i]==userNumbers[j]) {
                    countB++;
                    continue;
                }
            }
        }
        return countA + "a" + countB + "b";
        /*
        if(userInput.equals(randomNumber)){
            return "4a0b";
        }else if(userInput.equals("1256")){
            return "2a0b";
        }
        return "3a0b";
        */
    }
}
