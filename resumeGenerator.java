/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResumeBuilder;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.draw.LineSeparator;
import java.awt.Desktop;
import com.itextpdf.text.Document;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPCell;
import java.io.FileOutputStream;

/**
 *
 * @author krishna keshav
 */
public class resumeGenerator {
    private final Map details; // stores form values from ResumeBuilder.java
    /**
     *
     */
    resumeGenerator(Map detailsFromRB) {
        details = detailsFromRB;
    }
    void createResume() throws IOException {
        Document resume = new Document();
        try {
            
            PdfWriter.getInstance(resume, new FileOutputStream("resume.pdf"));
            resume.open();
            LineSeparator line;
            line = new LineSeparator();
            Font f = new Font();
            resume.add( Chunk.NEWLINE );
            String space = "";
            Font font2 = new Font(Font.FontFamily.HELVETICA  , 18, Font.BOLD | Font.UNDERLINE);
            resume.add(new Paragraph("RESUME", font2)); 
            Paragraph name = new Paragraph((String) details.get("Name"));
            name.setAlignment(Paragraph.ALIGN_LEFT);
            resume.add( name );
            Paragraph email = new Paragraph((String) details.get("Email"));
            email.setAlignment(Paragraph.ALIGN_RIGHT);
            resume.add(email );
            Paragraph contact = new Paragraph((String) details.get("ContactNumber"));
            contact.setAlignment(Paragraph.ALIGN_RIGHT);
            resume.add(contact);  
            resume.add(Chunk.NEWLINE);
            resume.add(line);
            resume.add(Chunk.NEWLINE);
            Font font1 = new Font(Font.FontFamily.HELVETICA  , 13, Font.BOLD | Font.UNDERLINE);
            resume.add(new Chunk("Qulaification ", font1));
            resume.add(Chunk.NEWLINE);
            PdfPTable table = new PdfPTable(3);
            PdfPCell cell1 = new PdfPCell(new Paragraph("College"));
            PdfPCell cell2 = new PdfPCell(new Paragraph("Percentage"));
            PdfPCell cell3 = new PdfPCell(new Paragraph("Date"));
            PdfPCell cell4;
            cell4 = new PdfPCell(new Paragraph((String) details.get("SchoolX")));
            resume.add(cell4);
            resume.add(Chunk.NEWLINE);
            PdfPCell cell5 = new PdfPCell(new Paragraph((String) details.get("PercentageX")));
            resume.add(cell5);
            PdfPCell cell6;
            cell6 = new PdfPCell(new Paragraph((String) details.get("Date X"))) ;
            resume.add(cell6);
            PdfPCell cell7;
            cell7 = new PdfPCell(new Paragraph((String) details.get("SchoolXII")));
            resume.add(cell7);
            resume.add(Chunk.NEWLINE);
            PdfPCell cell8 = new PdfPCell(new Paragraph((String) details.get("PercentageXII")));
            resume.add(cell8);
            PdfPCell cell9;
            cell9 = new PdfPCell(new Paragraph((String) details.get("Date XII"))) ;
            resume.add(cell9);
            table.addCell(cell1);
            table.addCell(cell2);
            table.addCell(cell3);
            table.addCell(cell4);
            table.addCell(cell5);
            table.addCell(cell6);
            table.addCell(cell7);
            table.addCell(cell8);
            table.addCell(cell9);
            resume.add(table);
            resume.add(Chunk.NEWLINE);
            Font font3;
            font3 = new Font(Font.FontFamily.HELVETICA  , 13, Font.BOLD | Font.UNDERLINE);
            resume.add(new Chunk("Graduation and PostGraduation ", font1));
            //resume.add(Chunk.NEWLINE);
            PdfPTable table1;
            table1 = new PdfPTable(4);
            PdfPCell cell10 = new PdfPCell(new Paragraph(" College"));
            PdfPCell cell11 = new PdfPCell(new Paragraph("University"));
            PdfPCell cell12 = new PdfPCell(new Paragraph("CGPA"));
            PdfPCell cell13 = new PdfPCell(new Paragraph("DATE"));
            PdfPCell cell14;
            cell14 = new PdfPCell(new Paragraph((String) details.get("GraduationCollege")));
            resume.add(cell14);
            resume.add(Chunk.NEWLINE);
            PdfPCell cell15 = new PdfPCell(new Paragraph((String) details.get("GraduateUniversity")));
            resume.add(cell15);
            resume.add(Chunk.NEWLINE);
            PdfPCell cell16 = new PdfPCell(new Paragraph((String) details.get("GraduationCGPA")));
            resume.add(cell16);
            PdfPCell cell17;
            cell17 = new PdfPCell(new Paragraph((String) details.get("Graduation date"))) ;
            resume.add(cell7);
            PdfPCell cell18;
            cell18 = new PdfPCell(new Paragraph((String) details.get("PostGraduationCollege")));
            resume.add(cell8);
            resume.add(Chunk.NEWLINE);
            PdfPCell cell19;
            cell19 = new PdfPCell(new Paragraph((String) details.get("PostGraduateUniversity")));
            resume.add(cell19);
            PdfPCell cell20;
            cell20 = new PdfPCell(new Paragraph((String) details.get("PostGraduateCGPA"))) ;
            resume.add(cell20);
            PdfPCell cell21;
            cell21 = new PdfPCell(new Paragraph((String) details.get("Post Graduation date"))) ;
            resume.add(cell21);
            table1.addCell(cell10);
            table1.addCell(cell11);
            table1.addCell(cell12);
            table1.addCell(cell13);
            table1.addCell(cell14);
            table1.addCell(cell15);
            table1.addCell(cell16);
            table1.addCell(cell17);
            table1.addCell(cell18);
            table1.addCell(cell19);
            table1.addCell(cell20);
            table1.addCell(cell21);
            resume.add(table1);
            Font font4;
            font4 = new Font(Font.FontFamily.HELVETICA  , 13, Font.BOLD | Font.UNDERLINE);
            resume.add(new Chunk("Skills", font1));
            resume.add(Chunk.NEWLINE);
             resume.add(Chunk.NEWLINE);
            Paragraph name1;
            name1 = new Paragraph((String) details.get("Skills"));
            name1.setIndentationLeft(50);
            resume.add(name1);
            Font font5;
            font5 = new Font(Font.FontFamily.HELVETICA  , 13, Font.BOLD | Font.UNDERLINE);
            resume.add(new Chunk("Projects", font1));
            resume.add(Chunk.NEWLINE);
            Paragraph name2;
            name2 = new Paragraph((String) details.get("ProjectName1"));
            name2.setIndentationLeft(50);
            resume.add(name2);
            resume.add(Chunk.NEWLINE);
            Paragraph name3;
            name3 = new Paragraph((String) details.get("projectDescription1"));
            name3.setIndentationLeft(50);
            resume.add(name3);
            resume.add(Chunk.NEWLINE);
            Paragraph name4;
            name4 = new Paragraph((String) details.get("ProjectName2"));
            name4.setIndentationLeft(50);
            resume.add(name4);
            resume.add(Chunk.NEWLINE);
            Paragraph name5;
            name5 = new Paragraph((String) details.get("projectDescription2"));
            name5.setIndentationLeft(50);
            resume.add(name5);
            resume.add(Chunk.NEWLINE);
            Paragraph name6;
            name6 = new Paragraph((String) details.get("ProjectName3"));
            name6.setIndentationLeft(50);
            resume.add(name6);
            Paragraph name7;
            name7 = new Paragraph((String) details.get("projectDescription3"));
            name7.setIndentationLeft(50);
            resume.add(name7);
            resume.add(Chunk.NEWLINE);
            Paragraph name8;
            name8 = new Paragraph((String) details.get("ProjectName4"));
            name8.setIndentationLeft(50);
            resume.add(name8);
            Paragraph name9;
            name9 = new Paragraph((String) details.get("projectDescription4"));
            name9.setIndentationLeft(50);
            resume.add(name9);
            resume.close();
            
        } catch(DocumentException | FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        File file = new File("resume.pdf");
        Desktop.getDesktop().open(file);
        
    }
}
