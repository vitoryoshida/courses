package lambdaExpression;

import java.io.File;

@FunctionalInterface
public interface FileFilter {
    boolean acept(File file);
}
