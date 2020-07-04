package sbnz.integracija.example.model;

import org.kie.api.definition.type.Expires;
import org.kie.api.definition.type.Role;

@Role(Role.Type.EVENT)
@Expires("30m")

public class ProtokVode {
	
	public ProtokVode() {
    }

}
