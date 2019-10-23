package WeatherAPI04;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.JsonNodeFactory;
import org.codehaus.jackson.xml.XmlMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.hoo.entity.AccountBean;

@Test
public class JsonToXml {
	   String json = "{\"address\":\"address\",\"name\":\"haha\",\"id\":1,\"email\":\"email\"}"
	    try {
	        AccountBean acc = objectMapper.readValue(json, AccountBean.class);
	        System.out.println(acc.getName());
	        System.out.println(acc);
	    } catch (JsonParseException e) {
	        e.printStackTrace();
	    } catch (JsonMappingException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
}
