package mx.com.citelis.directory.controller;

import lombok.RequiredArgsConstructor;
import mx.com.citelis.directory.config.DirectoryProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class DirectoryInfoController {

    private final DirectoryProperties directoryProperties;

    @GetMapping("/dbinfo")
    public String dbinfo() {
        return directoryProperties.getDatasource().getUrl();
    }

    @GetMapping("/version")
    public String version() {
        return directoryProperties.getVersion();
    }
}
