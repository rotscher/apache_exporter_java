package ch.postfinance.prometheus;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ApacheExporterTest {

    @Test
    public void export() {
        ApacheExporter exporter = new ApacheExporter();
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println(exporter.export());
                Thread.sleep(15000);
            }
        } catch (IOException | InterruptedException e) {
            fail(e.getMessage());
        }
    }
}