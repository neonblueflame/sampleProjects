package blueflamey.samples.nashorn;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class TestInvocable {
	public static void main(String... args) {
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		
		try {
			engine.eval(new FileReader("C:\\Users\\smariano\\git\\sampleProjects\\SampleNashorn\\src\\blueflamey\\samples\\nashorn\\js\\SampleFunction.js"));
			engine.eval("sayHello()");
			
			Invocable invocable = (Invocable) engine;
			Object obj = invocable.invokeFunction("setObject", new ArrayList<>());
			
			System.out.println(obj);
			System.out.println(obj.getClass().getName());
		}
		
		catch (FileNotFoundException 
				| ScriptException 
				| NoSuchMethodException e) {
			e.printStackTrace();
		}
		
		catch (NullPointerException e) {
			System.out.println(NullPointerException.class.getName());
			System.out.println(e.getMessage());
		}
	}
}
