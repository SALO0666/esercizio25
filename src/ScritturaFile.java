import java.io.*;

public class ScritturaFile {
    public ScritturaFile(String nomeFile) throws IOException {
        PrintWriter scrittore = new PrintWriter(new FileWriter(nomeFile));
        BufferedReader lettore = new BufferedReader(new InputStreamReader(System.in));

        String riga = lettore.readLine();
        while (!riga.isEmpty()) {
            scrittore.println(riga);
            riga = lettore.readLine();
        }

        lettore.close();
        scrittore.close();
    }
}
