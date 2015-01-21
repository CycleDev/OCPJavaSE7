package nao.cycledev.ocpjavase7.c8.javaiofundamentals;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ByteStreams {

    public static boolean isFileClass(String file) {

        byte[] magicNumber = {(byte) 0xCA, (byte) 0xFE, (byte) 0xBA, (byte) 0xBE};

        try (FileInputStream input = new FileInputStream(file)) {
            byte[] number = new byte[4];
            if (input.read(number) != -1){
                if (Arrays.equals(magicNumber, number))
                    return true;
                else
                    return false;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void dataStreamTest(String str){

        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(str))){

            for (int i=0;i<10;i++){
                outputStream.writeByte(i);
                outputStream.writeShort(i);
                outputStream.writeInt(i);
                outputStream.writeLong(i);
                outputStream.writeFloat(i);
                outputStream.writeDouble(i);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(str))){

            for (int i = 0; i < 10 ; i++) {

                System.out.printf("%d %d %d %d %g %g %n", inputStream.readByte(), inputStream.readShort(), inputStream.readInt(),
                        inputStream.readLong(), inputStream.readFloat(), inputStream.readDouble());

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
