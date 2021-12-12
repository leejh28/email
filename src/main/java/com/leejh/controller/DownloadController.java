package com.leejh.controller;

import com.leejh.service.DownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class DownloadController {
    @Autowired
    private DownloadService downloadService;

    @GetMapping("/download")
    public void download(HttpServletResponse response) throws IOException {
        downloadService.download(response);
    }

}
