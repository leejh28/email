package com.leejh.service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface DownloadService {
    void download(HttpServletResponse response) throws IOException;

}
