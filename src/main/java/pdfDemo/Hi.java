package pdfDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
//import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;

public class Hi {
	public static void main(String[] args) throws FileNotFoundException, DocumentException {
	//Create a document and define the page size and the page margins.
	//Rectangle pagesize = new Rectangle(216f, 720f);	
	//36f left margin, 72f = 1 in= 25.4mm right margin, 108f top margin, 108 bottom margin
	//1)Document document = new Document(pagesize, 36f, 72f, 108f, 180f);
	Document document = new Document(PageSize.LETTER);	
	//2)Get a PdfWriter instance
	PdfWriter.getInstance(document, new FileOutputStream("iTextHelloWorld.pdf"));
	
   //3)Open the Document
	document.open();
	
	//4)Add content
	Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
	Chunk chunk = new Chunk("Hello World", font);
	document.add(chunk);
	
	//5)close the document
	document.close();
}
}