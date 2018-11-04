package recognition1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.watson.developer_cloud.service.security.IamOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.VisualRecognition;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.DetectFacesOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.DetectedFaces;

public class Recognition1_main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Recognition1_lib rlib = new Recognition1_lib();
		String file = "img/syuzo.jpg";
		DetectedFaces result = rlib.recognition(file);
				
		rlib.json(result);
				
				
				
	}
}