package Five_Generics;

import java.util.ArrayList;
import java.util.List;

public class Ch28PreferListsToArrays {

    public static void main(String[] args) {

        /* Covariant vs Invariant
            Co - together
            In - not (think of an e.g. anerobic)
            Variant - changing
         */
        Object[] objectArray = new Long[1]; // Covariant
        objectArray[0] = "This will cause a runtime error"; // Runtime Error !!

        // List<Object> objectList = // Invariant
        // new ArrayList<Long>(); // Complile Error

        /*
            Because Lists are invariant they refuse the change that the Long arraylist tries to force
         */


        /* Reified vs Erasure
            Reify - Make into a thing, actualise

            Arrays are reified meaning that they enforce type at runtime,
            Lists erase this information at the start of runtime.
         */

    }
}
