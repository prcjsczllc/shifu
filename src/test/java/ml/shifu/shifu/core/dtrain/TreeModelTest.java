package ml.shifu.shifu.core.dtrain;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.tuple.MutablePair;
import org.testng.annotations.BeforeClass;

import ml.shifu.shifu.core.TreeModel;

public class TreeModelTest {

    private TreeModel model;
    
    @BeforeClass
    public void setUp() throws IOException {
       // String modelPath = "src/test/resources/example/wdbc/wdbcModelSetLocal/models/model0.gbt";
        String modelPath = "src/test/resources/example/model_cam.gbt";
        FileInputStream fi = new FileInputStream(modelPath);
        model = TreeModel.loadFromStream(fi);
    }
    
    public void FeatureImportancesTest(){
        Map<Integer,MutablePair<String,Double>> importances = model.getFeatureImportances();
        for(Entry<Integer,MutablePair<String,Double>> entry:importances.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue().getKey()+" "+entry.getValue().getValue());
        }
    }
    
    public static void main(String[] args) throws IOException{
        TreeModelTest test = new TreeModelTest();
        test.setUp();
        test.FeatureImportancesTest();
    }
}
