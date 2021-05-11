import com.comsol.model.*;
import com.comsol.model.util.*;
import java.security.AccessController;

public class Main {

   public static void main(String[] args) {
      run();
   }
   public static Model run() {
        System.out.println("veikia maybe");
//         AccessController.doPriviledged(Model model = ModelUtil.load("Model", "/fakehome/admin0/src/main/input"));
//         AccessController.doPrivileged(new PrivilegedAction() {
//             public Object run() {
//                 Model model = ModelUtil.load("Model", "//fakehome//admin0//src//main//input");
//                 // perform the security-sensitive operation here
//                 return null;
//             }
//         });
        Model model = ModelUtil.load("Model", "/fakehome/admin0/src/main/input.mph");
        String[] varnames = model.param().varnames();
        for(int i = 0; i < varnames.length; i++) {
            System.out.println(i + " => " + varnames[i]);
        }
//         System.out.println("veikia maybe");

//       Model model = ModelUtil.create("Model");
//       model.modelNode().create("comp1");
//       model.geom().create("geom1", 3);
//       model.geom("geom1").feature().create("blk1", "Block");
//       model.geom("geom1").feature("blk1").set("size", new String[]{"0.1", "0.2", "0.5"});
//       model.geom("geom1").run("fin");
      return model;
   }
}