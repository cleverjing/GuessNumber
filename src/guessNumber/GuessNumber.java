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
        int placeCorrect = 0, placeIncorrect = 0;
        for(int i=0;i<4;i++){
            if(randomNumbers[i] == userNumbers[i]){
                placeCorrect++;
                continue;
            }
            for(int j=0;j<4;j++){
                if(randomNumbers[i] == userNumbers[j]) {
                    placeIncorrect++;
                    continue;
                }
            }
        }
        return placeCorrect + "a" + placeIncorrect + "b";

    }
}
