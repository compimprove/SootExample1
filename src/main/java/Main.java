import java.io.File;
import java.util.Map;

import soot.*;
import soot.jimple.JimpleBody;
import soot.options.Options;
import soot.toolkits.graph.ExceptionalUnitGraph;

public class Main {

    public static void main(String[] args) {
        String sourceDirectory = System.getProperty("user.dir") +
                File.separator + "testClass";
        String className = "FizzBuzz";
        String methodName = "printFizzBuzz";

        G.reset();
        Options.v().set_allow_phantom_refs(true);
        Options.v().set_soot_classpath(sourceDirectory);
        SootClass sootClass = Scene.v().loadClassAndSupport(className);
        sootClass.setApplicationClass();
        Scene.v().loadNecessaryClasses();

        SootMethod sootMethod = sootClass.getMethodByName(methodName);
        System.out.println(sootClass.getName());
        for (SootMethod sm : sootClass.getMethods()) {
            System.out.println("--------------");
            System.out.println(sm.getName());
            JimpleBody body = (JimpleBody) sm.retrieveActiveBody();
            System.out.println("Method Signature: " + sm.getSignature());
            System.out.println("Argument(s):");
            for (Local l : body.getParameterLocals()) {
                System.out.println(l.getName() + " : " + l.getType());
            }
        }
    }
}