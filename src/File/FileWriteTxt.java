//package File;
//
//import java.io.FileOutputStream;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.text.ParseException;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//import java.util.Base64;
//
//public class FileWriteTxt {
//    public static void main(String args[]) throws InterruptedException, IllegalAccessException, ParseException {
//
////        LocalDate currentDate = LocalDate.now();
////        String formattedDate = currentDate.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
////
////        System.out.println(formattedDate);
//
//        try {
//            String jsonResponse = "{\n" +
//                    "    \"opstatus\": 0,\n" +
//                    "    \"Records\": \"[TURnMk9EZzVPVEF3TUZCTFVrRkNVRUV3TURFd01EVTJOemc1TmxSbGMzUkdiM1Z5SUNBZ0lDQWdJ\\r\\nQ0FnSUNBZ0lDQWdJQ0FnSUNBZ0lDQWdJQ0FnSUNBZ0lDQWdJQ0FnSUNBZ0lDQWdSM1ZzYzJoaGJp\\r\\nQWdJQ0FnSUNBZ0lDQWdJQ0FnSUNBZ0lDQWdJQ0FnSUNBZ0lDQk9MMEVnSUNBZ0lDQWdJQ0FnSUNB\\r\\nZ0lDQWdJQ0FnSUNBZ0lDQWdJQ0FnSUNBZ0lDQWdJQ0FnSUNBZ0lDQWdJQ0FnSURJd01UWTRNREF3\\r\\nTWtJPQo=, TURnMk9EZzVPVEF3TUZCTFVrRkNVRUV3TURFd01EVTJOemc1TmxSbGMzUkdiM1Z5SUNBZ0lDQWdJ\\r\\nQ0FnSUNBZ0lDQWdJQ0FnSUNBZ0lDQWdJQ0FnSUNBZ0lDQWdJQ0FnSUNBZ0lDQWdSM1ZzYzJoaGJp\\r\\nQWdJQ0FnSUNBZ0lDQWdJQ0FnSUNBZ0lDQWdJQ0FnSUNBZ0lDQk9MMEVnSUNBZ0lDQWdJQ0FnSUNB\\r\\nZ0lDQWdJQ0FnSUNBZ0lDQWdJQ0FnSUNBZ0lDQWdJQ0FnSUNBZ0lDQWdJQ0FnSURJd01UWTRNREF3\\r\\nTWtJPQo=]\",\n" +
//                    "    \"httpStatusCode\": 0\n" +
//                    "}";
//
//            JSONObject jsonObject = new JSONObject(jsonResponse);
//
//            int opStatus = jsonObject.getInt("opstatus");
//            String recordString = jsonObject.getString("Records");
//            int httpStatusCode = jsonObject.getInt("httpStatusCode");
//
//            // Remove unnecessary characters and split into individual records
//            String cleanedRecordsString = recordString
//                    .replaceAll("\\\\r\\\\n", "")
//                    .replaceAll("\\[|\\]", ""); // remove square brackets
//            String[] recordsArray = cleanedRecordsString.split(", ");
//            //  JSONArray recordsArray = new JSONArray(new JSONTokener(recordString));
//
//            //converting the JSONARRAAY to an ArrayList
//            ArrayList<String> recList = new ArrayList<>();
//            ArrayList<String> base64Records = new ArrayList<>();
//
//            for (String record : recordsArray) {
//                try {
//                    // Remove non-base64 characters and handle padding
//                    String cleanedRecord = record.replaceAll("[^A-Za-z0-9+/=]", "");
//
//                    // Base64 decode the cleaned record
//                    byte[] decodedBytes = Base64.getDecoder().decode(cleanedRecord);
//                    String decodedRecord = new String(decodedBytes);
//                    base64Records.add(decodedRecord);
//                    recList.add(record);
//                } catch (IllegalArgumentException e) {
//                    // Print the problematic base64 record
//                    System.out.println("Problematic base64 record: " + record);
//                    e.printStackTrace();
//                }
//            }
//
////           String filePath = "C:" + File.separator + "Users" + File.separator + "Zain.Badaruddin" + File.separator + "Documents" + File.separator + "dumpFiles" + File.separator;
//
//            String folderName = "CBOFiles";
//            String desktopPath = System.getProperty("user.home") + "/Desktop/" + folderName;
//            String folderPath = desktopPath;
//            createDirectory(folderPath);
//
//            for (int i = 0; i < base64Records.size(); i++) {
//                saveToFile(base64Records.get(i), folderPath + i + ".txt");
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    private static void saveToFile(String content, String filePath) {
//        System.out.println(filePath);
//        try (FileOutputStream fos = new FileOutputStream(filePath)) {
//            fos.write(content.getBytes());
//            System.out.println("File save successfully at " + filePath);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static void createDirectory(String folderPath) {
//        try {
//            // Create a Path object
//            Path path = Paths.get(folderPath);
//
//            // Create the directory if it does not exist
//            if (!Files.exists(path)) {
//                Files.createDirectory(path);
//            }
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
