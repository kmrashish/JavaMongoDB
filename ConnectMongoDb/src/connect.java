import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;
import com.mongodb.util.JSON;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

public class connect {
	public static void main(String args[]) {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		try {

			MongoClient mongoClient = new MongoClient("localhost", 27017);

			DB db = mongoClient.getDB("testdb");
			System.out.println("Connection successful");

//			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
//			Date firstjan = sdf.parse("01/01/2015");
//			Calendar cal = Calendar.getInstance();
//			cal.setTime(firstjan);
//			System.out.println("Tim: " + firstjan);
//
//			List<DBObject> objlist = new ArrayList<>();
//
//			BasicDBObject inobj = new BasicDBObject("aa", 1);
//			DBCollection col = db.getCollection("testcoll");
//			System.out.println("testcoll selected");
//			int b = 2;
//			int c = 3;
//			char d = 'a';
//
//			for (int x = 0; x < 100; x++) {
//				BasicDBObject obj = new BasicDBObject("a", 1).append("b", b)
//						.append("c", c).append("d", d)
//						.append("d", cal.getTime()).append("f", inobj);
//				objlist.add(obj);
//				b++;
//				c++;
//				d++;
//				cal.add(Calendar.DATE, 1);
//			}
//			col.insert(objlist);
			
//			List<Map> objmaplist = new ArrayList<>();			
//
//			DBCollection collection2 = db.getCollection("testcoll");			
//			DBObject findQuery=new BasicDBObject("a",1);	
//			
//			
//			DBCursor cursor2 = collection2.find(findQuery);
//			while (cursor2.hasNext()) {
//				objmaplist.add(cursor2.next().toMap());
//				
//			}
			
			List<Map> objmaplist = new ArrayList<>();			

			DBCollection collection2 = db.getCollection("testcoll");			
			DBObject findQuery=new BasicDBObject("f", new BasicDBObject("aa",1));	
			
			
			DBCursor cursor2 = collection2.find(findQuery);
			while (cursor2.hasNext()) {
				objmaplist.add(cursor2.next().toMap());
				
			}
			
			for(Map m:objmaplist)
			{
				 System.out.println(JSON.serialize(m.get("_id")));
			}
			
//			
//			int sec_id=1;
//			
//			for(Map m:objmaplist)
//			{
//				m.put("id", sec_id);
//				sec_id++;
//				System.out.println(m);
//			}
//			
//			
//			
//			
//			
//			List<DBObject> updatedlist=new ArrayList<>();
//			
//			for(Map um:objmaplist)
//			{
//				updatedlist.add(new BasicDBObject(um));
//			}
//			
//			DBCollection col = db.getCollection("testcollupdated");
//			col.insert(updatedlist);
//			
//			System.out.println("inserted");
						
//			DBCursor cursor3 = col.find(findQuery);
//			while (cursor3.hasNext()) {
//				System.out.println(cursor3.next());
//			}
//			
//			int count=col.find(findQuery).count();
//			System.out.println("Number of documents in the collection: "+count);
//					
			
			
		} catch (Exception e) {
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
		}
	}
}