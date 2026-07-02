package JavaAgentRep;
import java.lang.instrument.Instrumentation;
import java.util.Properties;

public class PropertyWatcherAgent {
    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("[PropertyWatcherAgent] Starting...");

        Properties originalProps = System.getProperties();

        Properties wrappedProps = new Properties(originalProps) {
            @Override
            public synchronized Object put(Object key, Object value) {
                if ("java.protocol.handler.pkgs".equals(key)) {
                    System.err.println("⚠ [PropertyWatcherAgent] Detected property change:");
                    System.err.println("   java.protocol.handler.pkgs = " + value);
                    dumpStack();
                }
                return super.put(key, value);
            }
        };

        System.setProperties(wrappedProps);
        System.out.println("[PropertyWatcherAgent] Property watcher installed.");
    }

    private static void dumpStack() {
        try {
            throw new Exception("Property modification stack trace:");
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
}
