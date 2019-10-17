package org.skyfox.spring_boot_demo.controller;

import java.io.File;
import java.io.IOException;

import org.skyfox.spring_boot_demo.entity.ResultMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
@Controller
@RequestMapping("/upload") 
public class UploadController {
	
	@PostMapping("/uploadfile")
    @ResponseBody
    public ResultMap upload( @RequestParam("addFile") MultipartFile file,@RequestParam("activityid") String activityid,@RequestParam("name") String name) {
        if (file.isEmpty()) {
            return new ResultMap().fail().message("上传失败");
        }
//        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");

        String fileName = file.getOriginalFilename();
        String filePath = "/Users/jakey/Desktop/upload";
        File dest = new File(filePath + fileName);
        try {
            file.transferTo(dest);
            return new ResultMap().success().message("上传成功");
        } catch (IOException e) {
           e.printStackTrace();
        }
        return new ResultMap().fail().message("上传失败");
    }
}
