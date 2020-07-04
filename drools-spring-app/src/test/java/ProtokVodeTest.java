import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import java.util.Collection;

import org.drools.core.ClockType;
import org.junit.Test;
import org.kie.api.KieBase;
import org.kie.api.KieBaseConfiguration;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.Message;
import org.kie.api.conf.EventProcessingOption;
import org.kie.api.runtime.ClassObjectFilter;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.KieSessionConfiguration;
import org.kie.api.runtime.conf.ClockTypeOption;
import org.kie.internal.io.ResourceFactory;

import sbnz.integracija.example.model.ProtokVode;

public class ProtokVodeTest {

	@Test
	public void test() {
		/*KieServices ks = KieServices.Factory.get();
        KieFileSystem kfs = ks.newKieFileSystem();
        kfs.write(ResourceFactory.newClassPathResource("/drools-spring-kjar/src/main/resources/sbnz/integracija/protokVode.drl"));
        KieBuilder kbuilder = ks.newKieBuilder(kfs);
        kbuilder.buildAll();
        if (kbuilder.getResults().hasMessages(Message.Level.ERROR)) {
            throw new IllegalArgumentException("Coudln't build knowledge module" + kbuilder.getResults());
        }
        KieContainer kContainer = ks.newKieContainer(kbuilder.getKieModule().getReleaseId());
        KieBaseConfiguration kbconf = ks.newKieBaseConfiguration();
        kbconf.setOption(EventProcessingOption.STREAM);
        KieBase kbase = kContainer.newKieBase(kbconf);
        
        KieSessionConfiguration ksconf1 = ks.newKieSessionConfiguration();
        ksconf1.setOption(ClockTypeOption.get(ClockType.REALTIME_CLOCK.getId()));
        KieSession ksession1 = kbase.newKieSession(ksconf1, null);
        
        KieSessionConfiguration ksconf2 = ks.newKieSessionConfiguration();
        ksconf2.setOption(ClockTypeOption.get(ClockType.PSEUDO_CLOCK.getId()));
        KieSession ksession2 = kbase.newKieSession(ksconf2, null);
        
        runRealtimeClockExample(ksession1);
	}
	
	private void runRealtimeClockExample(KieSession ksession) {
        Thread t = new Thread() {
            @Override
            public void run() {
                for (int index = 0; index < 4; index++) {
                    ProtokVode beep = new ProtokVode();
                    ksession.insert(beep);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        //do nothing
                    }
                }
            }
        };
        t.setDaemon(true);
        t.start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            //do nothing
        }
        ksession.fireUntilHalt();
        Collection<?> newEvents = ksession.getObjects(new ClassObjectFilter(ProtokVode.class));
        assertThat(newEvents.size(), equalTo(1));*/
    }

}
