package saveLoad;

import Objects_Language.Language;
import Objects_Language.TiengAnh;
import Objects_Language.TiengNhat;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class saveload {
        public static File path;
	public static <E> void Save(List<E> obj) {
		
	}
	public static <E> List<E> Load(String language){
		List<E> obj = new ArrayList<E>();
		if(path.exists()){
                    try {
                        FileReader fr = new FileReader(path,StandardCharsets.UTF_8);
                        BufferedReader br = new BufferedReader(fr);
                        br.readLine();
                        while(true){
                            try{
                                String s = br.readLine();
                                if(s==null) break;
                                if(language.equals("TiengNhat")){
                                    String[] arr = s.split(",");
                                    TiengNhat a = new TiengNhat(arr[0],arr[1],arr[2],arr[3],arr[4]);
                                    obj.add((E)a);
                                }else{
                                    String[] arr = s.split(",");
                                    TiengAnh a = new TiengAnh(arr[0],arr[1]);
                                    obj.add((E)a);
                                }
                            }catch(EOFException e){
                                break;
                            }
                        }
                        br.close();
                        
                    } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
                    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
                    }
                }
		return obj;
	}
}