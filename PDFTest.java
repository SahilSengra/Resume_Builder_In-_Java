/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResumeBuilder;

import com.itextpdf.text.Document;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import java.io.IOException;

/**
 *
 * @author peace
 */
public class PDFTest {
    public void createPdf(String name) throws IOException {
        try (PDDocument document = new PDDocument()) {
            PDPage blankPage = new PDPage();
            document.addPage( blankPage );
            document.save(name);
        }
        Document doc = new Document();
    }
    public static void main(String args[]) throws IOException {

    }
    
}
