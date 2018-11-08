public class Magic {
	public static void main(String[] args) {
    //myNumber is the original Number, 100
		int myNumber = 10;
    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo/myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive/6;
    System.out.println(stepSix);
    

	}
}