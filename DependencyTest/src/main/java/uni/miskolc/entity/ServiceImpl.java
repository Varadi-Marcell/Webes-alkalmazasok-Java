package uni.miskolc.entity;

public class ServiceImpl implements Service {
    private final Dependency dependency;

    public ServiceImpl(Dependency dependency) {
        this.dependency = dependency;
    }

    public String getImportantAbstract(String abstr) {
		String text = String.format("%s...", abstr.substring(0, 3));
		
		return dependency.importantString(text);
	}
    
    @Override
    public void calculate() {
        dependency.helpNoParameterNoReturnValue();
    }


    public int return5() {
        return 5;
    }

    public int callHelpAndUseReturnValue() {
        return dependency.helpNoParameterReturnValue();
    }

    public void callHelpAndPassParameter5() {
         dependency.helpWithParameterNoReturnValue(5);
    }
    
   

}
