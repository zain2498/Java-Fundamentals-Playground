package InterviewQuestions;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;

public class SimpleGetExample {

    public static void main (String[] args) {
        System.setProperty("http.agent", "Chrome");

        try {
            // Define the URL for the API request
            URI uri = new URI("http://coderbyte.com/api/challenges/json/rest-get-simple");
            URL url = uri.toURL();
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            // Read the input stream to get the JSON response
            InputStream inputStream = connection.getInputStream();
            InputStreamReader reader = new InputStreamReader(inputStream);
            StringBuilder response = new StringBuilder();

            int ch;
            while ((ch = reader.read()) != -1) {
                response.append((char) ch);
            }

            // Convert the response to a string
            String responseString = response.toString();

            // Check if the response contains the "hobbies" key
            if (responseString.contains("\"hobbies\":")) {
                // Extract the "hobbies" array from the response
                String hobbiesPart = responseString.split("\"hobbies\":\\[")[1].split("\\]")[0];

                // Handle the case where the hobbies array is empty
                if (hobbiesPart.trim().isEmpty()) {
                    System.out.println("No hobbies found.");
                } else {
                    // Split the hobbies by commas and clean up quotes
                    String[] hobbiesArray = hobbiesPart.replace("\"", "").split(",");

                    // Use StringBuilder to build the output with the correct format
                    StringBuilder varOcg = new StringBuilder();

                    for (int i = 0; i < hobbiesArray.length; i++) {
                        varOcg.append(hobbiesArray[i].trim());
                        if (i < hobbiesArray.length - 1) {
                            varOcg.append(", ");
                        }
                    }

                    // Print the final hobbies string to the console
                    System.out.println(varOcg.toString());
                }
            } else {
                // Handle the case where the "hobbies" key is not found
                System.out.println("No hobbies key found in the response.");
            }

        } catch (Exception e) {
            // Print any exception that occurs
            System.out.println(e.getMessage());
        }
    }
}
