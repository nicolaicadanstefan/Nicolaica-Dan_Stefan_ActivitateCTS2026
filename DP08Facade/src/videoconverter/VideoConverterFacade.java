package videoconverter;

public class VideoConverterFacade{
    VideoDecoder videoDecoder = new VideoDecoder();
    AudioEncoder audioEncoder = new AudioEncoder();
    FileWriter fileWriter = new FileWriter();

    public void convertVideo() {
        videoDecoder.applyVideoDecoder();
        audioEncoder.applyAudioEncoder();
        fileWriter.applyFileWriter();
    }
}