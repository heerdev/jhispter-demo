package com.velocity.aldemo.service;

import com.fasterxml.jackson.databind.MappingIterator;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.velocity.aldemo.entity.CsvEntity;


import java.io.File;
import java.util.List;

public class CsvReader {
    public static List<CsvEntity> readFile(File csvFile) throws Exception {
        MappingIterator<CsvEntity> personIter = new CsvMapper().readerWithTypedSchemaFor(CsvEntity.class).readValues(csvFile);

        return personIter.readAll();
    }
}
