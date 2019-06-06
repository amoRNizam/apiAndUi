package api.test;

import java.io.UnsupportedEncodingException;
import java.time.Instant;
import java.util.Base64;
import java.util.Date;

import static base.utils.Utils.getUnixDateTime;


public class Test1 {

    private String TIME_STAMP = getUnixDateTime();

    @org.testng.annotations.Test(enabled = true)
    public void testName() {

        long unixTimestamp = Instant.now().getEpochSecond();
        long timeStamp = new Date().getTime();
//        System.out.println(unixTimestamp);
//        System.out.println(System.currentTimeMillis() / 1000L);
//        System.out.println(TIME_STAMP);


        try {

            // Encode using basic encoder
            String base64encodedString = Base64.getEncoder().encodeToString(
                    "TICKET_d553792274c1dad0f9d6075e735ed4272509cb4e".getBytes("utf-8"));
            System.out.println("Base64 Encoded String (Basic) :" + base64encodedString);

//            // Decode
//            byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);
//
//            System.out.println("Original String: " + new String(base64decodedBytes, "utf-8"));
//            base64encodedString = Base64.getUrlEncoder().encodeToString(
//                    "TutorialsPoint?java8".getBytes("utf-8"));
//            System.out.println("Base64 Encoded String (URL) :" + base64encodedString);

//            StringBuilder stringBuilder = new StringBuilder();
//
//            for (int i = 0; i < 10; ++i) {
//                stringBuilder.append(UUID.randomUUID().toString());
//            }
//
//            byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
//            String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
//            System.out.println("Base64 Encoded String (MIME) :" + mimeEncodedString);

        } catch(UnsupportedEncodingException e) {
            System.out.println("Error :" + e.getMessage());
        }

        System.out.println(new Date().getTime());
        System.out.println(timeStamp);
        System.out.println(unixTimestamp);
        System.out.println(TIME_STAMP);
    }

}
