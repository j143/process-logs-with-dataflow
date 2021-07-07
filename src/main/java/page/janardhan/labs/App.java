package page.janardhan.labs;

import org.apache.beam.sdk.values.PCollection;
import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.io.TextIO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    PipelineOptions options = PipelineOptionsFactory.create();
    Pipeline p = Pipeline.create(options);

    PCollection<String> homeLogs = p.apply("homeLogsTextRead", TextIO.read().from(options.getHomeLogSource()));
    PCollection<String> browseLogs = p.apply("browseLogsTextRead", TextIO.read().from(options.getBrowseLogSource()));
    // PCollection<String> 
    
}
