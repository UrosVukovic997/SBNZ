package sbnz.integracija.example;

import java.util.List;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbnz.integracija.example.facts.Item;
import sbnz.integracija.example.model.GlavnaStanica;
import sbnz.integracija.example.model.MernaStanica;

@Service
public class SampleAppService {

	private static Logger log = LoggerFactory.getLogger(SampleAppService.class);

	private final KieContainer kieContainer;

	@Autowired
	public SampleAppService(KieContainer kieContainer) {
		log.info("Initialising a new example session.");
		this.kieContainer = kieContainer;
	}

	public Item getClassifiedItem(Item i) {
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.insert(i);
		kieSession.fireAllRules();
		kieSession.dispose();
		return i;
	}
	
	public List<MernaStanica> getClassifiedMernaStanica(List<MernaStanica> mStanice) {
		KieSession kieSession = kieContainer.newKieSession();
		for (MernaStanica ms : mStanice)
			kieSession.insert(ms);

		kieSession.fireAllRules();
		kieSession.dispose();
		return mStanice;
	}
	
	public GlavnaStanica getClassifiedGlavnaStanica() {
		KieSession kieSession = kieContainer.newKieSession();
		GlavnaStanica gs = GlavnaStanica.getInstance();
		kieSession.insert(gs);
		kieSession.fireAllRules();
		kieSession.dispose();
		return gs;
	}
	
}
