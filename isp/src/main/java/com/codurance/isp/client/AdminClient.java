package com.codurance.isp.client;

public class AdminClient {
    private final FileServerAdministration fileServerAdministration = new LinuxFileServer();
    private final FileServerAdministration fileServerAdministration1 = new PublicFileServer();
}
