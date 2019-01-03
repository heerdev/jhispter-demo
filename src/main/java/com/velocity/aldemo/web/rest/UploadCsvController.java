package com.velocity.aldemo.web.rest;


import com.velocity.aldemo.entity.CsvEntity;
import com.velocity.aldemo.repository.CsvEntityRepo;
import com.velocity.aldemo.service.CsvReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

@RestController
public class UploadCsvController {

    @Autowired
    CsvEntityRepo csvEntityRepo;



    @PostMapping("upload-csv")
    public ResponseEntity<?> uploadCsv(@RequestParam("file") MultipartFile file) throws Exception {
        File convFile = new File(file.getOriginalFilename());
        convFile.createNewFile();
        FileOutputStream fos = new FileOutputStream(convFile);
        fos.write(file.getBytes());
        fos.close();
        List<CsvEntity> csvEntities= CsvReader.readFile(convFile);

        for (CsvEntity csvEntity :csvEntities) {
            csvEntityRepo.save(csvEntity);
        }


        return new ResponseEntity<>(csvEntities, HttpStatus.ACCEPTED);
    }
}
