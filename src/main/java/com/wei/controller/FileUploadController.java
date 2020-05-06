package com.wei.controller;

import com.baomidou.mybatisplus.extension.api.ApiController;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @author lmz
 */
@CrossOrigin
@RestController
public class FileUploadController extends ApiController {
//    @Value("${upload.picture.path}")

    /**
     * 图片访问路径
     */
    private String accUrl = "";
    @javax.annotation.Resource
    private ResourceLoader resourceLoader;


    public static File getImgDirFile() {

        // 构建上传文件的存放 "文件夹" 路径
        /**
         * 上传路径
         */
        String fileDirPath = new String("src/main/resources/templates/userData/img/");
        File fileDir = new File(fileDirPath);
        if (!fileDir.exists()) {
            // 递归生成文件夹
            fileDir.mkdirs();
        }
        return fileDir;
    }

    /**
     * 上传
     *
     * @return java.lang.String
     * @author oneTi
     * @date 15:10 2018/8/17
     **/
    @RequestMapping("upload")
    @ResponseBody
    public String upload(@RequestParam("editormd-image-file") MultipartFile multipartFile) {
        String fileName = "";
        String path = getImgDirFile().getAbsolutePath();
        try {
            //multipartFile.getOriginalFilename() 获取文件原始名称
            fileName = multipartFile.getOriginalFilename();
            //new File(multipartFile.getOriginalFilename()) 根据获取到的原始文件名创建目标文件
            //multipartFile.transferTo() 将收到的文件传输到目标文件中
            assert fileName != null;
            multipartFile.transferTo(new File(path + fileName));
//            String accUrl="http://localhost:8081/"+path + fileName;
            String accUrl = path + fileName;

            System.out.println(accUrl);
            this.accUrl = path;
            return accUrl;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("图片上传失败！");
            return "图片上传失败";
        }
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
    public ResponseEntity<Resource> show(@PathVariable String fileName) {
        try {
            //resourceLoader.getResource("file:" + uploadPicturePath + fileName) 返回指定路径的资源句柄，这里返回的就是URL [file:D:/springboot/upload/test.png]
            //ResponseEntity.ok(T) 返回指定内容主体
            System.out.println(accUrl);
            return ResponseEntity.ok(resourceLoader.getResource("file:" + this.accUrl + fileName));
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
