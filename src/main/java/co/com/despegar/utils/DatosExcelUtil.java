package co.com.despegar.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import okhttp3.internal.http2.Header;

public class DatosExcelUtil {

	public void escribirEncabezado() {

		String nombreArchivo = "Prueba.xlsx";
		String rutaArchivo = "C:\\Proyectos\\RetoDespegar\\" + nombreArchivo;
		String hoja = "Hoja1";
		Workbook book = new XSSFWorkbook();
		Sheet hoja1 = book.createSheet(hoja);

		// Poner en negrilla el título
		CellStyle style = book.createCellStyle();
		Font font = book.createFont();
		font.setBold(true);
		style.setFont(font);

		Row row = hoja1.createRow(0);
		String[] header = new String[] { "Tipo de Vuelo", "Origen", "Destino", "Aerolínea", "Hora Salida", "Escalas",
				"Hora llegada", "Total horas" };
		for (int i = 0; i < header.length; i++) {
			Cell cell = row.createCell(i);
			cell.setCellStyle(style);
			cell.setCellValue(header[i]);
		}
		
		Row fila = hoja1.createRow(4);
		String[] headerPrecio = new String[] { "Precio por adulto", "Cantidad de adultos", "Valor por todos los adultos", "Impuestos y tasas", "Cargos", "Precio final" };
		for (int i = 0; i < headerPrecio.length; i++) {
			Cell cell = fila.createCell(i);
			cell.setCellStyle(style);
			cell.setCellValue(headerPrecio[i]);
		}
		
		
		File file;
		file = new File(rutaArchivo);

		try {
			FileOutputStream fileOut = new FileOutputStream(file);
			book.write(fileOut);
			fileOut.close();

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "El archivo se encuentra abierto");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Ha ocurrido una excepción verificada");
		} finally {

		}
	}

	public void escribirDatosVuelo(int fila, String tipoDeVuelo, String origen, String destino, String aerolinea, String horaSalida, String escalas ,String horaLlegada, String totalHoras)
			throws EncryptedDocumentException, InvalidFormatException, IOException {

		String[] document = new String[] { tipoDeVuelo, origen, destino, aerolinea, horaSalida, escalas, horaLlegada, totalHoras};
		String nombreArchivo = "Prueba.xlsx";
		String hoja = "Hoja1";

		try {
			FileInputStream file = new FileInputStream(new File(nombreArchivo));
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet hoja1 = wb.getSheet(hoja);

			XSSFRow row = hoja1.getRow(fila);
			if (row == null) {
				row = hoja1.createRow(fila);
			}

			for (int i = 0; i < document.length; i++) {
				XSSFCell cell = row.createCell(i);
				cell.setCellValue(document[i]);

			}

			file.close();
			FileOutputStream output = new FileOutputStream(nombreArchivo);
			wb.write(output);
			output.close();

		} catch (Exception e) {
			
		}

		
	}
	
	public void escribirPrecioDelVuelo(int fila, String precioxAdulto, String cantidadAdultos, String valorxAdultos, String impYTasas, String cargos, String precioFinal)
			throws EncryptedDocumentException, InvalidFormatException, IOException {

		String[] document = new String[] { precioxAdulto, cantidadAdultos, valorxAdultos, impYTasas, cargos, precioFinal};
		String nombreArchivo = "Prueba.xlsx";
		String hoja = "Hoja1";

		try {
			FileInputStream file = new FileInputStream(new File(nombreArchivo));
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet hoja1 = wb.getSheet(hoja);

			XSSFRow row = hoja1.getRow(fila);
			if (row == null) {
				row = hoja1.createRow(fila);
			}

			for (int i = 0; i < document.length; i++) {
				XSSFCell cell = row.createCell(i);
				cell.setCellValue(document[i]);

			}

			file.close();
			FileOutputStream output = new FileOutputStream(nombreArchivo);
			wb.write(output);
			output.close();

		} catch (Exception e) {
			
		}

		
	}
}
