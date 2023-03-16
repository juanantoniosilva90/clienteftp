package dev.silva.clientftp.ftpclient;

import dev.silva.clientftp.exceptions.FTPErrors;
import org.springframework.stereotype.Service;

import java.io.File;



public interface FTPService {

    void connectToFTP(String host, String user, String pass) throws FTPErrors;
    void uploadFileToFTP(File file, String ftpHostDir , String serverFilename) throws FTPErrors;
    void downloadFileFromFTP(String ftpRelativePath, String copytoPath) throws FTPErrors;
    void disconnectFTP() throws FTPErrors;

}
