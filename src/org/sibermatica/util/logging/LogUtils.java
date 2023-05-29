package org.sibermatica.util.logging;

import org.sibermatica.io.IOUtils;

import java.io.OutputStream;

import static org.sibermatica.io.IOUtils.ToString;
import static org.sibermatica.io.IOUtils.toOutputStream;

public class LogUtils {

    public OutputStream logSystemConsole() {
        // IOUtils.toOutputStream(String) => this: toOutputStream
        // IOUtils.ToString(OutputStream) => this: ToString
        return toOutputStream(ToString(System.out));
    }


}
