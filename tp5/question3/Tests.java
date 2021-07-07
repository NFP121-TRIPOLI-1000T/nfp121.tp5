package question3;

import java.util.Set;

public class Tests extends junit.framework.TestCase {

    public void test1(question3.Factory<Set> f) throws Exception {
        Set<Integer> set = f.create();
        for (int i = 20; i > 0; i--)
            set.add(i);
    }

    public void testCreation() {
        try {
            test1(new TreeSetFactory<Integer>());
            test1(new HashSetFactory<Integer>());
        } catch (NoSuchMethodError e) {
            fail("NoSuchMethodError : " + e.getMessage());
        } catch (Exception e) {
            fail(" exception inattendue : " + e.getMessage());
        }
    }
    
    public void testCompare(){
        question3.Factory<Set> f1= new TreeSetFactory<String>();
        question3.Factory<Set> f2= new TreeSetFactory<String>();
        question3.Factory<Set> f3= new TreeSetFactory<String>();
        Set<String> set=f1.create();
        f2.create();
        f3.create();
    }
}
