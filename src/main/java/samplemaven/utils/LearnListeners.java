package samplemaven.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class LearnListeners implements IRetryAnalyzer, IAnnotationTransformer{
	
	int count = 1;

	public void transform(ITestAnnotation annotation, Class arg1, Constructor arg2, Method arg3) {
		
		annotation.setRetryAnalyzer(this.getClass());
	}

	public boolean retry(ITestResult result) {
		
		if(!result.isSuccess()&&count<2) {
			count++;
			return true;
		}
		
		return false;
	}

}
