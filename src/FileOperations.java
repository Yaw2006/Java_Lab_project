public interface FileOperations {
    void save(String filename, Object data);

    Object load( String filename);


}
