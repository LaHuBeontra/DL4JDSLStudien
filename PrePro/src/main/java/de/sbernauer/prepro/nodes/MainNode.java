package de.sbernauer.prepro.nodes;

import com.oracle.truffle.api.nodes.Node;
import de.sbernauer.prepro.dataset.PreProDataSet;
import de.sbernauer.prepro.nodes.function.FunctionNode;
import de.sbernauer.prepro.nodes.function.MainFunctionNode;

import java.util.Arrays;

public class MainNode extends Node {
    private final FunctionTable functionTable = new FunctionTable();

    public MainNode(FunctionNode[] functionNodes) {
        Arrays.stream(functionNodes).forEach(
                functionTable::addFunction
        );
    }

    public PreProDataSet execute(PreProDataSet preProDataSet) {
        MainFunctionNode mainFunctionNode = (MainFunctionNode) functionTable.getFunction("main");

        return mainFunctionNode.executeMainFunction(preProDataSet, functionTable);
    }
}