import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        String[] aliceToDos = {"Coding", "Reading","Learning"};
        String[] bobToDos  = {"Reading","Coding","Learning","Sleeping"};
        String[] timToDos = {"Reading","Learning","Coding"};

        System.out.println("Is Alice's array equal to Bob's array? " + Arrays.equals(aliceToDos, bobToDos));
        System.out.println("Is Alice's array equal to Tim's array? " + Arrays.equals(aliceToDos,timToDos));

        System.out.println(("Is Alice's array having the same length as Bob's array? "+ (aliceToDos.length == bobToDos.length)));
        System.out.println("Is Alice's array having the same length as Tim's array? " + (aliceToDos.length == timToDos.length));


        /*
        System.out.println("Is Alice having the same tasks as Bob? " + Arrays.equals(aliceToDos,Arrays.copyOf(bobToDos, aliceToDos.length)));
        System.out.println("Is Alice having the same tasks as Tim? " + Arrays.equals(aliceToDos, Arrays.copyOf(timToDos, aliceToDos.length)));
        */
        Arrays.sort(aliceToDos);

        Arrays.sort(bobToDos);
        System.out.println("Is Alice having the same tasks as Bob? "+ Arrays.equals(aliceToDos,bobToDos));

        Arrays.sort(timToDos);
        System.out.println("Is Alice having the same tasks as Tim? "+ Arrays.equals(aliceToDos,timToDos));




    }
}