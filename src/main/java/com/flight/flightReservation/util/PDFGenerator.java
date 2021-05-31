package com.flight.flightReservation.util;

import com.flight.flightReservation.Model.Reservation;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;


@Component
public class PDFGenerator {
    public void generateItinerary(Reservation reservation, String filePath){
        Document document = new Document();

        try{
            PdfWriter.getInstance(document, new FileOutputStream(filePath));

            document.open();

            document.add(generateTable(reservation));

            document.close();


        }catch (FileNotFoundException | DocumentException e){
            e.printStackTrace();
        }
    }

    private PdfPTable generateTable(Reservation reservation) {
          PdfPTable table = new PdfPTable(2);

        PdfPCell cell;

        cell = new PdfPCell(new Phrase("Flight Itinerary"));
        cell.setColspan(2);
        table.addCell(cell);

        cell = new PdfPCell(new Phrase("Flight Details"));
        cell.setColspan(2);
        table.addCell(cell);

        table.addCell("Aviakompanija");
        table.addCell(reservation.getFlight().getOperatingAirlines());

        table.addCell("Atvykimas");
        table.addCell(reservation.getFlight().getArrivalCity());

        table.addCell("Skrydžio numeris");
        table.addCell(reservation.getFlight().getFlightNumber());

        table.addCell("Išvykimas");
        table.addCell(reservation.getFlight().getDepartureCity());

        table.addCell("Apytikris išvykimo laikas");
        table.addCell(reservation.getFlight().getEstimatedDepartureTime().toString());

        cell = new PdfPCell(new Phrase( "Skrydžio informacija"));
        cell.setColspan(2);
        table.addCell(cell);

        table.addCell("Vardas");
        table.addCell(reservation.getPassenger().getFirstName());

        table.addCell("Pavarde");
        table.addCell(reservation.getPassenger().getLastName());

        table.addCell("Elektroninis paštas");
        table.addCell(reservation.getPassenger().getEmail());

        table.addCell(  "Telefonas");
        table.addCell(reservation.getPassenger().getPhone());

        return table;
    }
}
