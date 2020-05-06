package com.wei.controller;

import com.baomidou.mybatisplus.extension.api.ApiController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author lmz
 */
@CrossOrigin
@RestController
@RequestMapping("image")
public class FileUploadController extends ApiController {
    @Value("${upload.picture.path}")
    private String uploadPicturePath;
    @javax.annotation.Resource
    private ResourceLoader resourceLoader;

    /**
     * 上传
     *
     * @return java.lang.String
     * @author oneTi
     * @date 15:10 2018/8/17
     **/
    @RequestMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile multipartFile) {
        try {
            //multipartFile.getOriginalFilename() 获取文件原始名称
            //new File(multipartFile.getOriginalFilename()) 根据获取到的原始文件名创建目标文件
            //multipartFile.transferTo() 将收到的文件传输到目标文件中
            //multipartFile.transferTo(new File(multipartFile.getOriginalFilename()));
            multipartFile.transferTo(new File(multipartFile.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
            return "true";
        }
        return "false";
    }

    /**
     * 显示图片
     *
     * @param fileName 文件名
     * @return org.springframework.http.ResponseEntity<org.springframework.core.io.Resource>
     * @author oneTi
     * @date 15:11 2018/8/17
     **/
    @RequestMapping("/{fileName:.+}")
    @ResponseBody
    public ResponseEntity<Resource> show(@PathVariable String fileName) {
        try {
            //resourceLoader.getResource("file:" + uploadPicturePath + fileName) 返回指定路径的资源句柄，这里返回的就是URL [file:D:/springboot/upload/test.png]
            //ResponseEntity.ok(T) 返回指定内容主体
            return ResponseEntity.ok(resourceLoader.getResource("file:" + uploadPicturePath + fileName));
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
