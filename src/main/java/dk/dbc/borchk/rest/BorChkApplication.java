package dk.dbc.borchk.rest;

import dk.dbc.borchk.rest.BorChkInfo;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * This class defines the other classes that make up this JAX-RS application
 * by having the getClasses method return a specific set of resources.
 */
@ApplicationPath("api")
public class BorChkApplication extends Application {
    private static final Set<Class<?>> classes = new HashSet<>(Collections.singletonList(BorChkInfo.class));

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
}
