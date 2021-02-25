//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven {

    static int s(int[] array) {
        int oddPlace = -1;
        for (int i = 0; i < array.length; i++) {

            if (oddPlace == -1 && array[i] % 2 == 1) {
                oddPlace = i;
            }
            if (oddPlace != -1 && array[i] % 2 == 0) {
                return i - oddPlace;
            }
        }
        return -1;
    }
}
	
