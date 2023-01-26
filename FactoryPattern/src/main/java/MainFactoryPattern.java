import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainFactoryPattern {

    public static void main(String ... args){
        String c1 = "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";
        String c2 = "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";

        System.out.println(c1.equals(c2));

    }
}
