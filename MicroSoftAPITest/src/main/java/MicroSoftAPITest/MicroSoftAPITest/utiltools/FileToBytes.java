package MicroSoftAPITest.MicroSoftAPITest.utiltools;

import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class FileToBytes {

	 public static byte[] getFile(String filePath,String fileName) {

		 	byte[] bfile = new byte[8192];
	        BufferedOutputStream bos = null;  //新建一个输出流
	        FileOutputStream fos = null;  //w文件包装输出流
	        File file = null;
	        try {
	            File dir = new File(filePath);
	            if(!dir.exists()&&dir.isDirectory()){//判断文件目录是否存在
	            	System.out.println("no such file directory");
	                dir.mkdirs();
	            }
	            file = new File(filePath+"\\"+fileName);  //新建一个file类
	            fos = new FileOutputStream(file);
	            bos = new BufferedOutputStream(fos);  //输出的byte文件
	            bos.write(bfile);

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            if (bos != null) {
	                try {
	                    bos.close();  //关闭资源
	                } catch (IOException e1) {
	                    e1.printStackTrace();
	                }
	            }
	            if (fos != null) {
	                try {
	                    fos.close();  //关闭资源
	                } catch (IOException e1) {
	                    e1.printStackTrace();
	                }
	            }
	        }

	        return bfile;
	    }



	 public static  byte[] image2Bytes(String imagePath) throws Exception {

		 String[] temp = imagePath.split("[.]");
		 int length = temp.length;
		 String format = temp[length-1];

         BufferedImage bu=ImageIO.read(new File(imagePath));
         ByteArrayOutputStream imageStream = new ByteArrayOutputStream();
         try {

             @SuppressWarnings("unused")
			boolean resultWrite = ImageIO.write(bu, format, imageStream);

         } catch (Exception e) {
             e.printStackTrace();
         }
         imageStream.flush();
         byte[] tagInfo = imageStream.toByteArray();

         return tagInfo;
        }


}
