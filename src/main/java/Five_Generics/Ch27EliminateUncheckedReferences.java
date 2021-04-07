package Five_Generics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ch27EliminateUncheckedReferences {

    public static void main(String[] args) {
        // If suppressed a comment as to why.
        // For instance you plan and have verified explicetely that you only use 'Lark's in exaltation.
        @SuppressWarnings("unchecked") Set<Lark> exaltation = new HashSet<>();
        System.out.println(exaltation);
    }

    private class Lark {

    }
}