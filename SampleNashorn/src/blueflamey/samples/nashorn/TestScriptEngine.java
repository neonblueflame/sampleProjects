package blueflamey.samples.nashorn;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class TestScriptEngine {
	public static void main(String... args) {
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");

		try {
			engine.eval("print('Hello World!')");
			engine.eval("var obj = {a:[1,1,1], b:[2,2,2], c:[3,3,3]}");
			engine.eval("print(obj.a)");
			
			engine.eval(new FileReader("C:\\Users\\smariano\\git\\sampleProjects\\SampleNashorn\\res\\groups.json"));
			engine.eval("print(config['groups']['CI'])");
		} catch (ScriptException e) {
			e.printStackTrace();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
