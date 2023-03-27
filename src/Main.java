import java.io.IOException;
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class Main {

    public static void main(String[] args) {
        // Define a URL de onde se vai obter o documento HTML
        String url = "http://hiring.axreng.com/internship/example1.html";

        try {
            // Obtém um objeto Document a partir da URL especificada
            Document doc = getDocumentFromUrl(url);
            // Extrai o conteúdo do documento HTML
            String html = doc.getDocumentElement().getTextContent();

            // Verifica se o HTML é válido
            if (isValidHtml(html)) {
                // Se o HTML for válido, determina a camada mais profunda e a exibe na tela
                String deepestLayer = getDeepestLayer(html);
                System.out.println("Deepest Layer: " + deepestLayer);
            } else {
                // Se o HTML for inválido, exibe mensagem de erro na tela
                System.out.println("Malformed HTML");
            }
        } catch (IOException | ParserConfigurationException | SAXException e) {
            // Se ocorrer um erro ao ler o HTML, exibe mensagem de erro na tela
            System.out.println("Error reading HTML: " + e.getMessage());
        }
    }

    // Obtém um objeto Document a partir da URL especificada
    private static Document getDocumentFromUrl(String url) throws IOException, ParserConfigurationException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();

        try (InputStream is = new URL(url).openStream()) {
            return db.parse(is);
        }
    }

    private static boolean isValidHtml(String html) {
        // Implementação do método isValidHtml()
    }

    private static String getDeepestLayer(String html) {
        // Implementação do método getDeepestLayer()
    }
}

