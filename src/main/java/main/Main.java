package main;

import dataset.DefaultPreProDataSet;
import dataset.PreProDataSet;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        INDArray p1 = Nd4j.create(new double[]{42, 0, 0, 1, 0, 0, 5, 0, 0, 6, 0, 0, 1, 2, 3}, new int[]{4, 3});
        INDArray p2 = Nd4j.create(new double[]{43, 0, 0, 44662, 0, 0, 6, 0, 0, 7, 0, 0}, new int[]{4, 3});
        INDArray p3 = Nd4j.create(new double[]{42, 0, 1, 1, 0, 1, 5, 0, 1, 6, 0, 1}, new int[]{4, 3});

        PreProDataSet preProDataSet = new DefaultPreProDataSet(
                Arrays.asList(p1, p2, p3),
                Arrays.asList("p1", "p2", "p3")
        );

        PreProProgram program = new PreProProgram("src/test/java/arithmetic/testCrossProduct.prepro");
        PreProDataSet result = program.execute(preProDataSet);

        System.out.println("Calculated x:\n" + result.getVariable("x"));
        System.out.println("Calculated y:\n" + result.getVariable("y"));
        System.out.println("Calculated z:\n" + result.getVariable("z"));
    }
}