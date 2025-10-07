package org.example;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import org.apache.http.HttpException;

import java.io.IOException;
import java.util.Scanner;

public class MovieApp {
    public static void main(String[] args) throws IOException, HttpException {
        Client client = new Client();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a movie for the model to describe: ");
        String query = "Please provide a brief, accurate description for the movie " + scanner.nextLine() + ".";

        GenerateContentResponse response = client.models.generateContent("gemini-2.0-flash-001", query, null);

        System.out.println(response.text());
    }
}