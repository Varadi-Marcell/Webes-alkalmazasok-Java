package uni.miskolc.entity;

public class DependencyImpl implements Dependency {
    @Override
    public void helpNoParameterNoReturnValue() {}


    public String importantString(String s) {
		return "<b>"+s+"</b>";
	}
     
    @Override
    public int helpNoParameterReturnValue() {
        return 45;
    }

    @Override
    public void helpWithParameterNoReturnValue(int a) {

    }

    
  
}
