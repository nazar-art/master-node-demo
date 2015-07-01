package com.lelyak.edu.utils;

public enum FileLocations {
    /**
     * Expected responses.
     */
    EXPECTED_GET_RESPONSE("src/test/resources/expected_get_response.json"),
    EXPECTED_PUT_RESPONSE("src/test/resources/expected_put_response.json");

    private String fileLocation;

    FileLocations(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public String getFileLocation() {
        return fileLocation;
    }
}
