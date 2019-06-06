//package base;
//
//import org.testng.Assert;
//
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.stream.Collectors;
//import java.util.zip.ZipEntry;
//import java.util.zip.ZipInputStream;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//
//        String filePath = "D:\\autotest\\autotest\\autotest.zip";
//
//        File resultFile = new File(filePath);
//        Assert.assertTrue(resultFile.exists(), "Загруженный файл не найден в ОС: " + filePath);
//        System.out.println("Проверка файлов внутри zip-архива");
//
//        ZipInputStream zip = new ZipInputStream(Files.newInputStream(Paths.get(filePath), StandardOpenOption.READ));
//
//        ZipEntry entry;
//
//        // Список найденный файлов в архиве
//        ArrayList<String> result = new ArrayList<>();
//
//        // Этот список наименований должен быть найден в архиве (искомые файлы)
//        ArrayList<String> searchFilesAndFolders = new ArrayList<>();
//        searchFilesAndFolders.add("PNG.png"); // файл
//        searchFilesAndFolders.add("NewTitle.pdf"); // файл
//        searchFilesAndFolders.add("NotDeletePlease2"); // директория
//
//        while ((entry = zip.getNextEntry()) != null) {
//            String zipEntryFullName;
//            if (!entry.isDirectory()) {
//                zipEntryFullName = entry.getName().substring(entry.getName().lastIndexOf("/")+1).trim();
//            }else {
//                String zipEntryFullName2 = null;
//                zipEntryFullName = entry.getName().replaceFirst(".$","");
//                zipEntryFullName = zipEntryFullName.substring(zipEntryFullName.lastIndexOf("/")+1).trim();
//            }
//            // обойдем все файлы в списке, если искомый файл содержится в архиве, то поместим его наименование в
//            // список с результатами "result"
//            for (String file : searchFilesAndFolders) {
//                if (zipEntryFullName.equals(file)) {
//                    result.add(zipEntryFullName);
//                }
//            }
//        }
//
//        // для отладки
//        Collections.sort(searchFilesAndFolders);
//        Collections.sort(result);
//        for (String s : result) {
//            System.out.println(s);
//        }
//
//        // удалим из списка "searchFilesAndFolders" искомых файлов те файлы и папки, что были найдены в архиве
//        searchFilesAndFolders.removeAll(result);
//
//        // Если в архиве найдены все искомые файлы, тогда список будет пуст
//        Assert.assertEquals(searchFilesAndFolders.size(), 0,
//                "Не все файлы/папки найдены в архиве: "+ searchFilesAndFolders);
//    }
//}
