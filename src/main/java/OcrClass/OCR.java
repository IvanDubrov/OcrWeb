package OcrClass;

import com.aspose.ocr.ImageStream;
import com.aspose.ocr.OCRConfig;
import com.aspose.ocr.OcrEngine;
import com.aspose.ocr.RecognitionBlock;

import java.util.List;


public class OCR {
    String[] scanIMG(String ListNameFile[]) {

        String listTextIMG[] = new String[ListNameFile.length];
        OcrEngine ocrEngine = new OcrEngine();
        OCRConfig ocrConfig = ocrEngine.getConfig();

//Set the Whitelist property to recognize numbers only
        ocrConfig.setWhitelist(new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'});
//Clear notifier list
        ocrEngine.clearNotifies();
//Clear recognition blocks
        ocrEngine.getConfig().clearRecognitionBlocks();
//Add 1 rectangle blocks to user defined recognition blocks
        ocrEngine.getConfig().addRecognitionBlock(RecognitionBlock.createTextBlock(155, 70, 105, 40));
//Ignore everything else on the image other than the user defined recognition blocks
        ocrEngine.getConfig().setDetectTextRegions(false);
//Set Image property by loading an image from file path
        for (int i = 0; i < ListNameFile.length; i++) {
            ocrEngine.setImage(ImageStream.fromFile("src/main/resources/img/" + ListNameFile[i]));
            if (ocrEngine.process()) {
                listTextIMG[i] = String.valueOf(ocrEngine.getText());
            }
        }
        return listTextIMG;

    }

}
